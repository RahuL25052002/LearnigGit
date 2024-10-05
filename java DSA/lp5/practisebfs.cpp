#include<iostream>
#include<queue>
#include<vector>
#include<omp.h>

using namespace std;

// struct Node{
//     int data;
//     vector<Node*> neighbors;
//     bool visited=false;

//     Node(int _data): data(_data){}

// };

// void parrallelBfs(Node * root){
//     queue<Node*> q;
//     q.push(root);
//     root->visited=true;

//     while(!q.empty()){
//         #pragma omp parrallel
//         {
//             #pragma omp for
//             for(int i=0;i<q.size();i++){
//                 Node * current;
//                 #pragma omp critical
//                 {
//                     current=q.front();
//                     q.pop();
//                 }
//                 cout<<current->data<<" ";

//                 #pragma omp parrallel for
//                 for(Node * neighbors:current->neighbors){
//                     if(!neighbors->visited){
//                         #pragma omp critical
//                         {
//                             neighbors->visited=true;
//                             q.push(neighbors);
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }

// void parrallelDfs(Node *root){
//     root->visited=true;
//     cout<<root->data<<" ";

//     #pragma omp parrallel for
//     for(int i=0;i<root->neighbors.size();i++){
//         Node * neighbor=root->neighbors[i];
//         if(!neighbor->visited){
//             parrallelDfs(neighbor);
//         }
//     }
// }


struct Node{
    int data;
    vector<Node*> neighbors;
    bool visited=true;

    Node(int _data):data(_data){}
};

void parrallelBfs(Node* root){
    queue<Node*> q;
    q.push(root);
    root->visited=true;

    while(!q.empty()){
        #pragma omp parrallel
        {
            #pragma omp for
            for(int i=0;i<q.size();i++){
                Node* current;
                #pragma omp critical
                {
                    current=q.front();
                    q.pop();
                }

                cout<<current->data<<" ";

                #pragma omp parrallel for

                for(Node* neighbors: current->neighbors){
                    if(!neighbors->visited){
                        #pragma omp critical
                        {
                            neighbors->visited=true;
                            q.push(neighbors);
                        }
                    }
                }
            }
        }

    }
}

void parrallelDfs(Node* root){
    root->visited=true;
    cout<<root->data<<" ";

    #pragma omp parrallel
    for(int i=0;i<root->neighbors.size();i++){
        Node* neighbor=root->neighbors[i];
        if(!root->visited){
            parrallelDfs(neighbor);
        }
    }
}

int main() {
    // Sample graph
    Node* root = new Node(0);
    Node* node1 = new Node(1);
    Node* node2 = new Node(2);
    Node* node3 = new Node(3);
    Node* node4 = new Node(34);

    root->neighbors.push_back(node1);
    root->neighbors.push_back(node2);
    node2->neighbors.push_back(node3);
    node3->neighbors.push_back(node4);

    // Parallel BFS
    cout << "Parallel BFS: ";
    parrallelBfs(root);
    cout << endl;

    // Reset visited flags for DFS
    root->visited = false;
    node1->visited = false;
    node2->visited = false;
    node3->visited = false;
    node4->visited=false;

    // Parallel DFS
    cout << "Parallel DFS: ";
    parrallelDfs(root);
    cout << endl;

    // Deallocate memory for the nodes
    delete root;
    delete node1;
    delete node2;
    delete node3;
    delete node4;

    return 0;
}
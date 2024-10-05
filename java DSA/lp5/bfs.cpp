#include <iostream>
#include <vector>
#include <queue>
#include <omp.h>

using namespace std;

// Node struct with a visited flag for both BFS and DFS
struct Node {
    int data;
    vector<Node*> neighbors;
    bool visited = false;  // Add a visited flag member

    Node(int _data) : data(_data) {} // Constructor to initialize data
};

// Parallel BFS implementation
void parallelBFS(Node* root) {
    queue<Node*> q;
    q.push(root);
    root->visited = true;

    while (!q.empty()) {
        #pragma omp parallel
        {
            #pragma omp for
            for (int i = 0; i < q.size(); ++i) {
                Node* current;
                #pragma omp critical
                {
                    current = q.front();
                    q.pop();
                }

                cout << current->data << " ";  // Visit node

                // Process neighbors in parallel
                #pragma omp parallel for
                for (Node* neighbor : current->neighbors) {
                    if (!neighbor->visited) {
                        #pragma omp critical
                        {
                            neighbor->visited = true;
                            q.push(neighbor);
                        }
                    }
                }
            }
        }
    }
}

// Parallel DFS implementation
void parallelDFS(Node* root) {
    root->visited = true;
    cout << root->data << " ";  // Visit node

    #pragma omp parallel for
    for (int i = 0; i < root->neighbors.size(); ++i) {
        Node* neighbor = root->neighbors[i];
        if (!neighbor->visited) {
            parallelDFS(neighbor);
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
    parallelBFS(root);
    cout << endl;

    // Reset visited flags for DFS
    root->visited = false;
    node1->visited = false;
    node2->visited = false;
    node3->visited = false;
    node4->visited=false;

    // Parallel DFS
    cout << "Parallel DFS: ";
    parallelDFS(root);
    cout << endl;

    // Deallocate memory for the nodes
    delete root;
    delete node1;
    delete node2;
    delete node3;
    delete node4;

    return 0;
}
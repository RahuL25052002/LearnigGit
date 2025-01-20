/*
 *Merge two sorted linked lists
Difficulty: MediumAccuracy: 62.91%Submissions: 174K+Points: 4
Given the head of two sorted linked lists consisting of nodes respectively. The task is to merge both lists and return the head of the sorted merged list.

Examples:

Input: head1 = 5 -> 10 -> 15 -> 40, head2 = 2 -> 3 -> 20
Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
Explanation:

Input: head1 = 1 -> 1, head2 = 2 -> 4
Output: 1 -> 1 -> 2 -> 4
Explanation:

Constraints:
1 <= no. of nodes<= 103
0 <= node->data <= 105
 *
 */

//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node *next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};

void printList(struct Node *head) {
    struct Node *temp = head;
    while (temp != NULL) {
        cout << temp->data << ' ';
        temp = temp->next;
    }
    cout << "\n~\n";
}

Node *insertSorted(Node *head, int data) {
    Node *new_node = new Node(data);
    if (!head || head->data >= data) {
        new_node->next = head;
        return new_node;
    }

    Node *current = head;
    while (current->next && current->next->data < data) {
        current = current->next;
    }
    new_node->next = current->next;
    current->next = new_node;
    return head;
}


// } Driver Code Ends
/* Link list Node
struct Node {
  int data;
  struct Node *next;

  Node(int x) {
    data = x;
    next = NULL;
  }
};
*/
class Solution {
  public:
    Node* sortedMerge(Node* head1, Node* head2) {
        // code here
        if(head1==NULL && head2==NULL){
        return NULL;
        }else{
            Node *temp1=head1;
            Node *temp2=head2;
            Node *temp3;
            Node *head3=NULL;
            while(temp1 && temp2){
                Node * newnode =(Node*)malloc(sizeof(Node));
                if(temp1->data<temp2->data){
                    newnode->data=temp1->data;
                    newnode->next=NULL;
                    temp1=temp1->next;
                }else{
                    newnode->data=temp2->data;
                    newnode->next=NULL;
                    temp2=temp2->next;
                }
                if(head3==NULL){
                    head3=newnode;
                    temp3=newnode;
                }else{
                    temp3->next=newnode;
                    temp3=newnode;
                }
            }
            temp3=head3;
            while(temp3->next){
                temp3=temp3->next;
            }
          if(temp1!=NULL){
              temp3->next=temp1;
          }
          if(temp2!=NULL){
              temp3->next=temp2;
          }
        return head3;
        }
    }
};

//{ Driver Code Starts.

// Driver program to test above functions
int main() {
    int T;
    cin >> T;
    cin.ignore();
    while (T--) {
        int n1, n2, tmp;
        Node *head1 = nullptr, *head2 = nullptr;
        string input1, input2;

        getline(cin, input1); // Read the entire line for the LL1 elements
        stringstream ss1(input1);
        while (ss1 >> tmp) {
            head1 = insertSorted(head1, tmp);
        }

        getline(cin, input2); // Read the entire line for the LL2 elements
        stringstream ss2(input2);
        while (ss2 >> tmp) {
            head2 = insertSorted(head2, tmp);
        }

        Solution obj;
        Node *head = obj.sortedMerge(head1, head2);
        printList(head);
    }
    return 0;
}

// } Driver Code Ends

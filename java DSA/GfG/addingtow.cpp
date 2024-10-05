package GfG;

 struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
 };

class Solution {
public:
    ListNode *reverse(ListNode* head){
        ListNode* curr=head;
        ListNode* prev=NULL;
        ListNode* Next=NULL;
        while(curr!=NULL){
            Next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
       if(l1!=NULL && l2!=NULL){
           return NULL;
       }
       ListNode *temp1=reverse(l1);
       ListNode *temp2=reverse(l2);
       ListNode* head3=NULL; 
       ListNode* temp3=NULL;
       while(temp1!=NULL && temp2!=NULL){
           ListNode* newnode=(ListNode*)malloc(sizeof(ListNode));
           int ans=(temp1->val)+(temp2->val);
           int carry=0;
           if(ans>9){
               int num=ans%10;
               newnode->val=num;
               newnode->next=NULL;
               carry=num/10;
           }else{
               if(ans+carry>9){
                   newnode->val=ans%10;
                   carry=ans/10;
               }else{
                    newnode->val=ans+carry;
               }
           }
           if(head3==NULL){
               head3=newnode;
               temp3=newnode;
           }else{
               temp3->next=newnode;
               temp3=newnode;
           }

       }
       return head3;
    }
};
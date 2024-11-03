class Solution {
    public boolean isLengthEven(Node head) {
        // code here   
        int ans=0;
        while(head!=null){
            ans++;
            head=head.next;
        }
        if(ans%2==0){
            return true;
        }
        
        return false;
    }
}


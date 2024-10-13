/*

Delete Alternate Nodes
Difficulty: EasyAccuracy: 56.09%Submissions: 69K+Points: 2
Given a Singly Linked List, Delete all alternate nodes of the list ie delete all the nodes present in even positions.

Examples :

Input: LinkedList: 1->2->3->4->5->6
 
Output: 1->3->5

Explanation: Deleting alternate nodes ie 2, 4, 6 results in the linked list with elements 1->3->5.
Input: LinkedList: 99->59->42->20
 
Output: 99->42
 
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= number of nodes <= 105
1 <= node->data <= 103  */

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

class Solution {
    public void deleteAlt(Node head) {
        // Code Here

        while(head!=null && head.next!=null){
           head.next=head.next.next;
           head=head.next;
        }

    }
}

class deleteAlternateNode{

	public static void printList(Node head){
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        	int t = sc.nextInt();
        	sc.nextLine();
        	while (t-- > 0) {
            		List<Integer> arr = new ArrayList<>();
            		String input = sc.nextLine();
            		Scanner ss = new Scanner(input);
            		while (ss.hasNextInt()) {
                		arr.add(ss.nextInt());
            		}
            		Node head = new Node(arr.get(0));
            		Node tail = head;
            		for (int i = 1; i < arr.size(); i++) {
                		tail.next = new Node(arr.get(i));
                		tail = tail.next;
            		}
            		Solution ob = new Solution();
            		ob.deleteAlt(head);
            		printList(head);
		}	
	}
}



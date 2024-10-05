// package Trees;

// import java.util.ArrayList;
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// public class BFSLevelOrder {
//     public class TreeNode{
//         int val;
//         TreeNode left;
//         TreeNode right;
//         TreeNode next;
//         int height;
//         TreeNode(){

//         }
//         TreeNode(int val){
//             this.val=val;
//         }
//         TreeNode(int val,TreeNode left,TreeNode right){
//             this.val=val;
//             this.right=right;
//             this.left=left;
//         }
//     }
//     private static TreeNode root;
  
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result=new ArrayList<>();
//         if(root==null){
//             return result;
//         }        
//         Queue<TreeNode> queue=new LinkedList<>();
//         queue.offer(root);
//         while(!queue.isEmpty()){
//             int levelSize=queue.size();
//             List<Integer> currentLevel=new ArrayList<>(levelSize);
//             for(int i=0;i<levelSize;i++){
//                 TreeNode currentNode=queue.poll();
//                 currentLevel.add(currentNode.val);
//                 if(currentNode.left!=null){
//                     queue.offer(currentNode.left);
//                 }
//                 if(currentNode.right!=null){
//                     queue.offer(currentNode.right);
//                 }
//             }
//             result.add(currentLevel);
//         }
//         return result;
//     }

//     public List<List<Integer>> ZigZaglevelOrder(TreeNode root) {
//         List<List<Integer>> result=new ArrayList<>();
//         if(root==null){
//             return result;
//         }        
//         Deque<TreeNode> queue=new LinkedList<>();
//         queue.offer(root);

//         boolean reverse=false;

//         while(!queue.isEmpty()){
//             int levelSize=queue.size();
//             List<Integer> currentLevel=new ArrayList<>(levelSize);
//             for(int i=0;i<levelSize;i++){

//                 if(!reverse){
//                     TreeNode currentNode=queue.pollFirst();
//                     currentLevel.add(currentNode.val);
//                     if(currentNode.left!=null){
//                         queue.addLast(currentNode.left);
//                     }
//                     if(currentNode.right!=null){
//                         queue.addLast(currentNode.right);
//                     }
//                 }else{
//                     TreeNode currentNode=queue.pollLast();
//                     currentLevel.add(currentNode.val);
//                     // here we first add right becasue there sequence not change 
//                     if(currentNode.right!=null){
//                         queue.addFirst(currentNode.right);
//                     }
//                     if(currentNode.left!=null){
//                         queue.addFirst(currentNode.left);
//                     }
//                 }
                
//             }
//             reverse=!reverse;
//             result.add(currentLevel);
//         }
//         return result;
//     }

// // Populating Next Right  pointers in each Node
//     public TreeNode connect(TreeNode root) {
//         if(root==null){
//             return null;
//         }
//         TreeNode leftmost=root;
//         while(leftmost.left!=null){
//             TreeNode current=leftmost;
//             while(current!=null){
//                 current.left.next=current.right;
//                 if(current.next!=null){
//                     current.right.next=current.next.left;
//                 }
//                 current=current.next;
//             }
//             leftmost=leftmost.left;
//         }
//         return root;
//     }



//     public static void main(String[] args) {
//         //  BST tree=new BST();
//         BFSLevelOrder tree=new BFSLevelOrder();
//          int []nums={3,1,12,10,15};
//           tree.populate(nums);
//          tree.display();
//          List<List<Integer>> list=new ArrayList<>();
//          list=tree.ZigZaglevelOrder(root);
//          System.out.println(list);
//          tree.prettyDisplay();
        
//     }

//     public void prettyDisplay(){
//         prettyDisplay(root,0);
//     }
//     private void prettyDisplay(TreeNode node,int level){
//         if(node==null){
//             return ;
//         }
//         prettyDisplay(node.right,level+1);
//         if(level!=0){
//             for(int i=0;i<level-1;i++){
//                 System.out.print("|\t\t");
//             }
//             System.out.println("|--------------->"+node.val);
//         }else{
//             System.out.println(node.val);
//         }
//         prettyDisplay(node.left,level+1);
//     }


//     public int height(TreeNode node){
//         if(node==null){
//             return -1;
//         }
//         return node.height;
//     }
//     public boolean isEmpty(){
//         return root==null;
//     }
//     // public void display(){
//     //     display(root,"Root Node: ");
//     // }
//     // private void display(Node node,String details){
//     //     if(node==null){
//     //         return ;
//     //     }
//     //     System.out.println(details+node.getValue());
//     //     display(node.left,"Left child of"+node.getValue()+" : ");
//     //     display(node.right,"right child of"+node.getValue()+" : ");
//     // }
//     public void insert(int value){
//         root=insert(value, root);
//     }
//     private TreeNode insert(int value,TreeNode node){
//         if(node==null){
//             node=new TreeNode(value);
//             return node;
//         }
//         if(value<node.val){
//             node.left=insert(value, node.left);
//         }
//         if(value>node.val){
//             node.right=insert(value, node.right);
//         }
//         node.height=Math.max(height(node.left),height(node.right))+1;
//         return node;
//     }
//     public boolean balanced(){
//         return balanced(root);
//     }
//     private boolean balanced(TreeNode node){
//         if(node==null){
//             return true;
//         }
//         return Math.abs(height(node.left)-height(node.right)) <=1 && balanced(node.left) && balanced(node.right);

//     }
//     public void display(){
//         display(this.root,"Root Node: ");
//     }
//     private void display(TreeNode node, String details){
//         if(node==null){
//             return;
//         }
//         System.out.println(details+node.val);
//         display(node.left,"Left child of "+node.val+" : ");
//         display(node.right,"Right child of "+node.val+" : ");
//     }
//     public void populate(int[]nums){
//         for(int i=0;i<nums.length;i++){
//             this.insert(nums[i]);
//         }
//     }
// }

// package StringProblem;

// import java.util.HashSet;
// import java.util.Set;

// public class MaxSubstring {
//     public static void main(String[] args) {
//         String check="abcababcab";
//         int  ans=lengthOfLongestSubstring(check);
//         System.out.println(ans);
//     }
        
    
//     static int lengthOfLongestSubstring(String s) {
//         // String ans="";
//         // int max=0;
//         // for(int i=0;i<s.length();i++){
//         //     if(!ans.contains(String.valueOf(s.charAt(i)))){
//         //         ans+=s.charAt(i);
//         //     }else{
//         //         ans="";
//         //         ans+=s.charAt(i);
//         //     }
//         //     if(ans.length()>max){
//         //         max=ans.length();
//         //     }
//         // }
//         // return max;
//         int  left=0;
//         int right=0;
//         Set <Character> check=new  HashSet();
//         int max=0;
//         while(right<s.length()){
//             char ch=s.charAt(right);
//             if(check.add(ch)){
//                 max=Math.max(max,right-left+1);
//                 right++;
//             }else{
//                 while(s.charAt(left)!=ch){
//                     check.remove(s.charAt(left));
//                     left++;
//                 }
//                 check.remove(ch);
//                 left++;
//             }
//         }
//         return max;
//     }
// }

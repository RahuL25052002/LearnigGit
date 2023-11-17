package StringRecur;

import java.util.ArrayList;

public class subSq {
    public static void main(String[] args) {
        ArrayList<String> ans=subS("","abc");
        System.out.println(ans  );
    }
    static ArrayList<String> subS(String ans,String original){
        if(original.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=original.charAt(0);
        ArrayList<String> left=subS(ans+ch, original.substring(1));
        ArrayList<String> right=subS(ans, original.substring(1));
        left.addAll(right);
        return left;
    }

}

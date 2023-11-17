package StringRecur;
public class subSequence {
    public static void main(String[] args) {
        subSeq("","abc");
    }
    static void subSeq(String ans,String Original){
        if(Original.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=Original.charAt(0);
        subSeq(ans+ch, Original.substring(1));
        subSeq(ans, Original.substring(1));
    }
}

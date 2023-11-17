package StringRecur;
public class RemoveaCharacter {
    public static void main(String[] args) {
        String str="baccad";
        skipChar("",str);
    }
    static String ans="";
    static String removeChar(String str,int i){
        
        if(str.length()==i){
            return ans;
        }
        if(str.charAt(i)!='a')
            ans+=str.charAt(i);
        return removeChar(str, i+1);
    }
    static void skipChar(String str,String original){
        if(original.isEmpty()){
            System.out.println(str);
            return;
        }
        char ch=original.charAt(0);
        if(ch=='a')
            skipChar(str, original.substring(1));
        else
            skipChar(str+ch, original.substring(1));
    }
}

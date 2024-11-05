public class validPalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");

        int size=cleanedString.length();
        int start=0;
        int end=size-1;
        for(int i=0;i<size/2;i++){
            if(cleanedString.charAt(start)==cleanedString.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
	validPalindrome obj=new validPalindrome();	
    	String str="Rahul %^& luhaR";
	boolean ans=obj.isPalindrome(str);
	System.out.println(ans);
    }
}

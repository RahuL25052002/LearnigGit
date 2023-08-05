package Lec9java;

public class linearString {
    public static void main(String[] args) {
        String str="Rahul Bhau ";
        char target='R';
        boolean ans=stringCharSearch(str,target);
        if(ans){
            System.out.println("Present");

        }else{
            System.out.println("Absent");
        }
    }
    public static boolean stringCharSearch(String str, char target){
        if(str.length()==0)
            return false;
        
        for(char ch:str.toCharArray()){
            if(ch==target)
                return true;
        }
        return false;
    }
}

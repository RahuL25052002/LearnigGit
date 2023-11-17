package StringRecur;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        combDice("",4);

        System.out.println(combDiceRet("", 12));
    System.out.println(count);
    }
    static void combDice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            combDice(p+i,target-i);
        }
    }
    static int count=0;
    static ArrayList<String> combDiceRet(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            count++;
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(combDiceRet(p+i, target-i));
        }
        return list;
    }
}

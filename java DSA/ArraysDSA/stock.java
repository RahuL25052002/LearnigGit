package ArraysDSA;
public class stock {
    public static void main(String[] args) {
        int[]prices={7,1,5,3,6,4};
        int max=Sell(prices);
        System.out.println(max);
    }
    static int Sell(int[]prices){
        int j=0;
        int max=0;
        for(int i=0;i<prices.length;){
            int profit=prices[i]-prices[j];
            if(profit>max){
                max=profit;
            }
            if(j>prices.length-1){
                break;
            }
            if(i>prices.length-2){
                j++;
                i=j;
            }else{
                i++;
            }
        }
        return max;
    }
}

public class Q6 {
    public static void main(String[] args) {
        int [] price = {7,1,5,3,6,4};
        int minbuy = price[0];
        int maxProfit = 0;

        int sell = price[0];
        for(int i =0;i<price.length;i++){
            int profit = price[i] - minbuy ;
            if(profit>maxProfit){
                maxProfit = profit;
                sell = price[i]; 
            }
            minbuy = Math.min(minbuy,price[i]);


        }
        System.out.println("Bought: "+minbuy);
        System.out.println("Sold: "+sell);
        System.out.println("MaxProfit: "+maxProfit);

        
    }
}

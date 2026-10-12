class Solution {
    public int maxProfit(int[] prices) {
     int j=0,price=0,maxprofit=0;
     for(int i=1;i<prices.length;i++){
        if(prices[j]<prices[i]){
           price=prices[i]-prices[j];
           if(price>maxprofit){
            maxprofit=price;
           }
        }
        else{
            j=i;
        }
     } 
     return maxprofit>0 ? maxprofit : 0 ;  
    }
}
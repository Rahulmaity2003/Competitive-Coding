class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i=0;i<prices.length;i++){
            int currValue=prices[i];
           for(int j=i+1;j<prices.length;j++){
            if(currValue >= prices[j]){
              prices[i]= currValue-prices[j];
              break;
            }
           }
        }
        return prices;
    }
}
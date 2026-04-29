class Solution {
    public int maxProfit(int[] prices) {
       int mp=0;
      /* int sp[]= Arrays.stream(prices).sorted().toArray();//System.out.print(sp);
       if(Arrays.equals(sp,prices))
       return 0;*/
       for(int i=0; i<prices.length; i++){
           for(int j=i+1; j<prices.length; j++){
            if(prices[j]-prices[i]>0)
            {
                mp=Math.max(mp,prices[j]-prices[i]);System.out.println(mp);
            }}
       }
       return mp;
    }
}

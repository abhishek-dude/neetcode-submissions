class Solution {
    public int longestConsecutive(int[] nums) {
         if(nums.length==0)
        return 0;
        int l=0;
        int c=0, d=0;
        int[] sa = Arrays.stream(nums).distinct().sorted().toArray();
        for(int i=1; i<sa.length; i++){
            if(sa[i]-1==(sa[i-1])){
                c++;
            }
            d++;
            if(l<=c)
            l=c;
            if(c!=d){
            c=0;d=0;
            }
        }
        return l+1;
    }
}

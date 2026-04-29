class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        int l=0;
        int c=0, d=0;
        int[] sa = Arrays.stream(nums).distinct().sorted().toArray();
        System.out.println(Arrays.toString(sa));
        for(int i=0; i<sa.length-1; i++){
            if(sa[i]==(sa[i+1]-1)){
                c++;System.out.print("sa[i]="+sa[i]+" "+"sa[i+1]="+sa[i+1]);
            }
            d++;
            System.out.print(" "+"l="+l+" "+"c="+c);
            if(l<=c)
            l=c;
            System.out.print(" "+"c="+c+" "+"d="+d);
            if(c!=d){
            c=0;d=0;
            }System.out.println();
        }
        return l+1;
    }
}

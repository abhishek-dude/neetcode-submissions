class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r= new ArrayList<>();
        if(nums.length==0)
        return r;
        for(int h =0; h<nums.length; h++){
            for(int i=h+1; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    List<Integer> temp =new ArrayList<>();
                    if(nums[h]+nums[i]+nums[j]==0){
                        temp.add(nums[h]); 
                        temp.add(nums[i]); 
                        temp.add(nums[j]);System.out.println(r.size()+"gvyuiy"+temp);
                            r.add(temp);
                    }
                }
            }
        }
        for (List<Integer> l : r) {
    Collections.sort(l);
}
r = new ArrayList<>(new LinkedHashSet<>(r));
        return r;
    }
}

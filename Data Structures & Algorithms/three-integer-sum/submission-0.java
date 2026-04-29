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
                       /* for(int g=1; g<=r.size(); g++){
                            Integer temp2[]= (r.get(g)).toArray(new Integer[0]);
                            Integer temp3[]= temp.toArray(new Integer[0]);
                            Arrays.sort(temp2);
                            Arrays.sort(temp3);System.out.println("fcxd");
                            System.out.println(temp);
                            if(!Arrays.equals(temp3, temp2))*/    
                            r.add(temp);
                        //}
                    }
                }
            }
        }
        for (List<Integer> l : r) {
    Collections.sort(l);
}

// remove duplicates
r = new ArrayList<>(new LinkedHashSet<>(r));
        return r;
    }
}

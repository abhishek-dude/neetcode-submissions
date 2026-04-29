class Solution {    //O(nlogn)
    public int findMin(int[] nums) {
        int min=1234567;
        for(int i=0; i<nums.length; i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}

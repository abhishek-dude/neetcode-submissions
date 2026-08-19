class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        Arrays.sort(nums);
        int len = nums.length-1;
        int n = nums[len];
        int total = (n*(n+1))/2;
        return (sum==total)?
                            ((nums[0]==0)?n+1:0)
                            :total-sum;
    }
}

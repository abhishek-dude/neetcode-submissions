class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstValueIndex=0, secondValueIndex=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
            if(nums[j]==(target-nums[i])){
            firstValueIndex=i;
            secondValueIndex=j;
            break;
            }
            }
        }
        return new int[]{firstValueIndex,secondValueIndex};
    }
}

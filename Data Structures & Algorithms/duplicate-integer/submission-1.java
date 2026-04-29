class Solution {
    public boolean hasDuplicate(int[] nums) {
        Long length1 = Arrays.stream(nums).distinct().count();
        if(length1==nums.length)
        return false;
        else
        return true;
    }
}
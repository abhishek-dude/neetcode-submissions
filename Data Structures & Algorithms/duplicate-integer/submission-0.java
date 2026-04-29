class Solution {
    public boolean hasDuplicate(int[] nums) {
        Long length1 = Arrays.stream(nums).distinct().count();
        int length2 = nums.length;
        if(length1==length2)
        return false;
        else
        return true;
    }
}
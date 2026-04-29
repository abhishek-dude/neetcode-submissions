class Solution {
    public boolean hasDuplicate(int[] nums) {
        return !Arrays.equals(nums,(Arrays.stream(nums).distinct().toArray()));
    }
}
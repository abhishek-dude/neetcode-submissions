class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> r = new ArrayList<>();

        if (nums.length == 0)
            return r;

        for (int h = 0; h < nums.length; h++) {
            for (int i = h + 1; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[h] + nums[i] + nums[j] == 0) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[h]);
                        temp.add(nums[i]);
                        temp.add(nums[j]);

                        Collections.sort(temp); // normalize order

                        boolean exists = false;

                        for (int g = 0; g < r.size(); g++) {
                            if (r.get(g).equals(temp)) {
                                exists = true;
                                break;
                            }
                        }

                        if (!exists)
                            r.add(temp);
                    }
                }
            }
        }
        return r;
    }
}
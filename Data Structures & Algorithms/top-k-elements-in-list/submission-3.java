


class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: frequency map
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Step 2: sort by frequency descending
        List<Map.Entry<Integer,Integer>> list =
                freq.entrySet()
                    .stream()
                    .sorted(Map.Entry
                            .<Integer,Integer>comparingByValue()
                            .reversed())
                    .toList();

        // Step 3: collect top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
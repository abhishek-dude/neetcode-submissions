class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch=s.charAt(r);
            if(mp.containsKey(ch) && mp.get(ch)>=l){
                l=mp.get(ch)+1;
            }
            mp.put(ch,r);
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        String st="";int sidx=0;
        for(int i=0; i<s.length(); i++){
            if(!st.contains(s.charAt(i)+"")){
                st+= s.charAt(i)+"";
                length=Math.max(length,st.length());
            }
            else{
                st="";
                sidx++;
                i=sidx-1;
            }
        }
        return length;
    }
}

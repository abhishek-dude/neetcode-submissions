class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        String st="";int sidx=0;
        for(int i=0; i<s.length(); i++){
            if(!st.contains(String.valueOf(s.charAt(i)))){
            st+= String.valueOf(s.charAt(i));
                length=Math.max(length,st.length());
                //sidx++;
            }
            else{
                st="";
                //i=s.indexOf(s.charAt(i));
                sidx++;i=sidx-1;
            }//System.out.println();
        }
        return length;
    }
}

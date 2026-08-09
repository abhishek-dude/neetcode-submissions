class Solution {
    public boolean isPalindrome(String s) {
        String st= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        //System.out.print(st);
        return st.equals(new StringBuilder().append(st).reverse().toString());
    }
}

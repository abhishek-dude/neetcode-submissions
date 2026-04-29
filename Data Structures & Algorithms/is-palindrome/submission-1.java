class Solution {
    public boolean isPalindrome(String s) {
        String tcs = s.replaceAll("[^a-zA-Z0-9]", "");
        return (new StringBuilder(tcs).reverse().toString().equalsIgnoreCase(tcs));
    }
}

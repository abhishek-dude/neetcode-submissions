class Solution {
    public boolean isPalindrome(String s) {
        String tcs = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder rs = new StringBuilder();
        rs.append(tcs);
        rs.reverse();
        if(rs.toString().equalsIgnoreCase(tcs))
        return true;
        return false;
    }
}

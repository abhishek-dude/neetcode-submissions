public class Solution {//brute force
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");            System.out.print(s+" ");
            s = s.replace("{}", "");            System.out.print(s+" ");
            s = s.replace("[]", "");            System.out.print(s+" ");
        }
        return s.isEmpty();
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
 return s.chars()
                .sorted()
                .boxed()
                .collect(Collectors.toList())
                .equals(
                    t.chars()
                     .sorted()
                     .boxed()
                     .collect(Collectors.toList())
                );
   }
}

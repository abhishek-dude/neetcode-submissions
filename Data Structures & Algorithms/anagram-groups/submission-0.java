class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedArray = new String[strs.length];
        for(int i=0; i<strs.length; i++){
            char[] singleString = strs[i].toCharArray();
            Arrays.sort(singleString);
            sortedArray[i] = new String(singleString);
        }
        
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int j=0; j<strs.length; j++){
            if (visited[j]) continue;
            List<String> list = new ArrayList<>();
            list.add(strs[j]);
            visited[j] = true;
            for (int k=j+1; k<strs.length; k++) {
                if(!visited[k] && sortedArray[j].equals(sortedArray[k])) {
                    list.add(strs[k]);
                    visited[k] = true;
                }
            }
            result.add(list);
        }
        return result;
    }
}
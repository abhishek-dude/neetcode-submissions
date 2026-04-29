class Solution {

    public String encode(List<String> strs) {
        String encodedValue ="";
        for(int i=0; i<strs.size(); i++){
            String value=strs.get(i);
                 encodedValue=encodedValue+value.length()+"#"+value;
                //System.out.println(encodedValue);
        }
        return encodedValue;
    }

    public List<String> decode(String str) {

    List<String> result = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {

        // 1. find '#'
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // 2. extract length
        int length = Integer.parseInt(str.substring(i, j));

        // 3. extract actual word
        String word = str.substring(j + 1, j + 1 + length);
        result.add(word);

        // 4. move pointer to next block
        i = j + 1 + length;
    }

    return result;
}
}

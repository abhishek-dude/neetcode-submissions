class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result= new int[2];
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(target-numbers[i]==numbers[j] && i!=j){
                    result[0]=j+1;
                    result[1]=i+1;
                }
            }
        }
    return result;
    }
}

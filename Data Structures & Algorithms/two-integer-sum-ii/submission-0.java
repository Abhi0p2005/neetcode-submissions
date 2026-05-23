class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(target - numbers[j] == numbers[i] && i!=j){
              return new int[] { i+1, j+1};
                }
                
            }
            
            
        }return null;
        
    }
}

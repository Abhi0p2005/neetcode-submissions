class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for ( int i =0;i<nums.length ;i++){
            for ( int j=i+1;j<nums.length;j++){
                for ( int k=j+1;k<nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> num = new ArrayList<>();
                        num.add(nums[i]);
                        num.add(nums[j]);
                        num.add(nums[k]);
                        Collections.sort(num);
                        if(ans.contains(num)) continue;
                        else ans.add(num);
                    }
                }
            }

        }
        return ans;
        
    }
}

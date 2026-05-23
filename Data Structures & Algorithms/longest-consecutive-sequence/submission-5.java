class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int n = nums.length;
        PriorityQueue<Integer> counter = new PriorityQueue<>(Collections.reverseOrder());
        int count =1;
        Arrays.sort(nums);
        int num = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-num ==1){
            count ++;
            num = nums[i];
            }
            else if(nums[i]-num ==0){
                continue;
            }
            else{
                counter.add(count);
                num =nums[i];
                count = 1;
                
            }
        }
        counter.add(count); 
        return counter.peek();
        
    }
}

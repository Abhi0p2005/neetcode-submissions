class Solution {
    public int trap(int[] height) {
        if(height == null || height.length ==0){
            return 0;
        }
        int n = height.length;
        int ans = 0;
        for(int i = 0 ;i<n;i++){
            int lmax = height[i];
            int rmax = height[i];
            for(int j = 0;j<i;j++){
                lmax = Math.max(lmax,height[j]);
            }
            for(int j = i+1;j<n;j++){
                rmax = Math.max(rmax,height[j]);
            }
            ans += Math.min(lmax,rmax)-height[i];
        }
       return ans; 
    }
}

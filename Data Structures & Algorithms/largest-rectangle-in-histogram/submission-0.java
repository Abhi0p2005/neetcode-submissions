class Solution {
    public int largestRectangleArea(int[] heights) {
        int res =0;
        int n = heights.length;
        for(int i=0;i<n;i++){
            int height = heights[i];
            int rightmost =i+1;
            while(rightmost<n && heights[rightmost]>=height) rightmost++;
            int leftmost = i;
            while(leftmost>=0 && heights[leftmost]>=height) leftmost--;
            leftmost++;
            rightmost--;
            res = Math.max(res,height*(rightmost - leftmost +1));
        }
        return res;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int [][] pair = new int[n][2];
        for(int i = 0;i<n;i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(b[0],a[0]));
        int fleet = 1;
        double pt = (double)(target- pair[0][0])/pair[0][1];
        for(int j=1;j<n;j++){
            double ct = (double)(target-pair[j][0])/pair[j][1];
            if(ct>pt){
                fleet++;
                pt = ct;
            }
        }
        return fleet;
    }
}

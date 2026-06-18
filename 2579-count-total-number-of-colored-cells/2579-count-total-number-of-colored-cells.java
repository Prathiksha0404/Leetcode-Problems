class Solution {
    public long coloredCells(int n) {
        
        long sum=1;
        for(int i=1;i<n;i++){
         sum+=4L*i;
        }
        return sum;
    }
}
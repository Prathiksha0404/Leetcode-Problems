class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans=new int[matrix.length];

          for(int i=0;i<matrix.length;i++){
            int deg=0;
            for(int j=0;j<matrix.length;j++){
                deg+=matrix[i][j];
            }
            ans[i]=deg;
          }
          return ans;
    }
}
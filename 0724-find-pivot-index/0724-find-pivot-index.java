class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left=0,total=0;
        for(int i:nums){
            total+=i;
        }
      for(int i=0;i<n;i++){
        int right=total-nums[i]-left;
        if(left==right){
            return i;
        }
        left+=nums[i];
      }
      return -1;
    }
}
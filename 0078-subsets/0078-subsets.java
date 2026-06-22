class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>lst=new ArrayList<>();
        solve(nums,res,lst,0);
        return res;

    }
     private void solve(int[] nums, List<List<Integer>> res,
                       List<Integer> lst, int index) {

        if(index>=nums.length)
       {
              res.add(new ArrayList<>(lst));
              return;
       }   
            int ele=nums[index];
            lst.add(ele);
            solve(nums,res,lst,index+1);
            lst.remove(lst.size()-1);

            solve(nums,res,lst,index+1);
        }
}
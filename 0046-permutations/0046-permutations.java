class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        solve(nums,new ArrayList<>(),res);
        return res;
    }


    public void solve(int[] nums,List<Integer>list,List<List<Integer>>res){

        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))
            continue;

            list.add(nums[i]);
            solve(nums,list,res);
            list.remove(list.size()-1);
        }
    }
}
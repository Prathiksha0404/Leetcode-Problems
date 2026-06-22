class Solution {
    public List<String> letterCombinations(String digits) {
      List<String> res=new ArrayList<>();

       if(digits.length()==0){
        return res;
       }
        String[] map={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };

        solve(digits,0,"",map,res);
        return res;

       }

        public void solve(String digits, int index, String curr, String[] map,List<String> res) {

        if(index==digits.length()){
            res.add(curr);
            return;
        }

        String letters=map[digits.charAt(index)-'0'];

        for(int i=0;i<letters.length();i++){
            solve(digits,index+1,curr+letters.charAt(i),map,res);
        }
       
    }
}
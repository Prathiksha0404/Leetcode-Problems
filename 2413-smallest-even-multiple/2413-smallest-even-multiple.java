class Solution {
    public int smallestEvenMultiple(int n) {
       int result=0;
       if(n%2==0){
        return n;
       }
       return n*2;
    }
}
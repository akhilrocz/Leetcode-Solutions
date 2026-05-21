class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length();
        for(int i=0;i<n-1;i++){
            //int num = Integer.parseInt(s.charAt(i));
            if(Math.abs((int) s.charAt(i+1)-(int) s.charAt(i))>2){
                return false;
            }
        }

        return true;
    }
}
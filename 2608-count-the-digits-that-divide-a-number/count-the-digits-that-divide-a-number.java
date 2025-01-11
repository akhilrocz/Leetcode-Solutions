class Solution {
    public int countDigits(int num) {
        String n =String.valueOf(num);
        int cnt=0;
        if(n.length()==1) return 1;
        for(int i=0;i<n.length();i++){
            int digit =Character.getNumericValue(n.charAt(i));
            if(num%digit==0) {
                cnt++;
            }
        }
        return cnt;
    }
}
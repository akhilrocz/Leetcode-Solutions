class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            int res = i^1;
            if(res==i-1){
                count++;
            }
        }

        return count;
    }
}
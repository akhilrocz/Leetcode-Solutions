class Solution {
    public int countOdds(int low, int high) {
        int count=0;

        //Approach 1

        return (high+1)/2 -low/2;

        //Approach 2
        // for(int i=low;i<=high;i++){
        //     int res = i^1;
        //     if(res==i-1){
        //         count++;
        //     }
        // }

        //return count;
    }
}
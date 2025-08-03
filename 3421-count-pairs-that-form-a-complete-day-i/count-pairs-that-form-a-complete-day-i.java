class Solution {
    public int countCompleteDayPairs(int[] hours) {
       int count=0;
    //    int left=0;
    //    int right=hours.length-1;
    //    while(left<right){
    //     if((hours[left]+hours[right])%24==0){
    //         count+=1;
    //         left++;

    //    }
        for(int i=0;i<hours.length-1;i++){
            for(int j=i+1;j<hours.length;j++){
                    if((hours[i]+hours[j])%24==0){
                        count+=1;
                }
            }
            
        }

       return count;
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        Long firstMax = null;
        Long secondMax = null;
        Long thirdMax = null;

        for (int num : nums) {
            long nu=(long)num;
            if((firstMax!=null && num==firstMax)||(secondMax!=null && num==secondMax)||(thirdMax!=null && num==thirdMax)){
                continue;
            } 

            if ( firstMax==null || nu > firstMax) { 
                thirdMax=secondMax; 
                secondMax = firstMax;   //2
                firstMax = nu;  //2 //3
            } else if (secondMax==null || nu > secondMax) { 
                thirdMax=secondMax;
                secondMax = nu;
            }else if(thirdMax==null || nu>thirdMax){
                thirdMax=nu;
            }
        }

        return thirdMax == null? firstMax.intValue() : thirdMax.intValue();

    }
}
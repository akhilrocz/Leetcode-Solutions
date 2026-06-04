class Solution {
    public boolean judgeCircle(String moves) {
       int count1=0;
       int count2=0;
       for(char c:moves.toCharArray()){
        if(c=='R'){
            count1++;
        }else if(c=='L'){
            count1--;
        }
        else if(c=='U'){
            count2++;
        }
         else if(c=='D'){
            count2--;
        }
       }
       return count2==0 && count1==0;
    }
}
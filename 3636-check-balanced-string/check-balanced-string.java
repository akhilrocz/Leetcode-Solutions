class Solution {
    public boolean isBalanced(String num) {
        int sumAtEvenIndex=0;
        int sumAtOddIndex=0;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0){
             sumAtEvenIndex+= num.charAt(i)-'1'+1;
            }else{
                sumAtOddIndex+= num.charAt(i)-'1'+1;
            }
        }

        return sumAtEvenIndex==sumAtOddIndex;
    }
}
class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";

        boolean isNumNegative =false;
        if(num<0){
            isNumNegative=true;
            num = Math.abs(num);
        }

        StringBuilder sb = new StringBuilder();

        while(num>0){
            sb.append(num%7);
            num/=7;
        }

        sb.reverse();

        if(isNumNegative){
            sb.insert(0,'-');
        }

        return sb.toString();





    }
}
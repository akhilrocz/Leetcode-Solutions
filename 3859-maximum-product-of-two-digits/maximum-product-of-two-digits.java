class Solution {
    public int maxProduct(int n) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        int temp=n;

        while(temp>0){
            int r=temp%10;  //1 //3
            
            if(r>max1){
                max2=max1;  //min value
                max1=r;  //1
            }else if(r>max2){
                max2=r;
            }

            temp/=10;  //3

        }

        return max1*max2;
    }
}
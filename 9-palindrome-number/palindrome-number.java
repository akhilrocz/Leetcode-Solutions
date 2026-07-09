class Solution {
    public boolean isPalindrome(int x) {
        
        int temp=x;
        int sum=0;
        while(temp>0){
            int r =temp%10;  //1  //2  //1
            sum=sum*10+r;  //1  12  //121
            temp/=10;  //12  //1
        }


        return sum==x;
    }
}
class Solution {
    public void reverseString(char[] s){
        int left=0;
        int right = s.length-1;  //char array
        while(left<right){
            char temp=s[left];  //h  //e
            s[left]=s[right];  //o  //l
            s[right]=temp;  //h  //e
            left++;
            right--;
        }
   
    }
}
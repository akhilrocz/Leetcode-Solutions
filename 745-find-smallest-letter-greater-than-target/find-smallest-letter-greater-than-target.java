class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         int left=0;
         int n = letters.length;
         int right = n-1;
char smallestChar =letters[0];
         while(left<=right)
         {
            int mid = left+(right-left)/2;  //integer division
            if(letters[mid]>target){
                smallestChar = letters[mid];
                right =mid-1;
            }else
            {
                left=mid+1;
            }
         }

         return smallestChar;
    }
}

  // c c f g   here mid is at c   target=a
  

  //left =0 right =3 mid =1   letters[mid]>target 


  

  


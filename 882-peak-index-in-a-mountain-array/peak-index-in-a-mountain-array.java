class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int peakIndex=-1;
      for(int i=1;i<arr.length-1;i++){
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            peakIndex=i;
        }
      }


return peakIndex;
      

    }
}
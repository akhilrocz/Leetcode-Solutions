class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0)
        {
            return new int[0];
        }
        Set<Integer> set1 =new HashSet<>();
        Set<Integer> set2 =new HashSet<>();
   for(int num:nums1){
  set1.add(num);
   }
   for(int num:nums2){
  set2.add(num);
   }
   set1.retainAll(set2);  //intersection will store in set1
   int[] res =new int[set1.size()];
   int indx=0;
   for(int num:set1){
    res[indx++]=num;
   }
   return res;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      Set<Integer> set =new HashSet<>();
      List<Integer> l = new ArrayList<>();
      int n=nums.length;

      for(int num:nums){
        set.add(num);  //deletes duplicates
      }

      for(int i=1;i<=n;i++){
        if(!set.contains(i)){
            l.add(i);
        }
      }

      return l;

    }
}
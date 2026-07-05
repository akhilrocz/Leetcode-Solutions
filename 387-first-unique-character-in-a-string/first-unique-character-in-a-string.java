class Solution {
    public int firstUniqChar(String s) {
         int n =s.length();

         Map<Character,Integer> map = new HashMap<>();

         for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
         }

         for(int i=0;i<n;i++){
            char c= s.charAt(i);
            if(map.get(c)==1){
                return i;
            }
         }

         return -1;

    }
}
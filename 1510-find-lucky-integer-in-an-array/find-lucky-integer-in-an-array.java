//hashmap to store the occurences
class Solution {    
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxKey=-1;
       for(int key:map.keySet())
       {
        int val =map.get(key);
        if(val==key){
           maxKey = Math.max(maxKey,key);
        }
        }
        return maxKey;
    }
}
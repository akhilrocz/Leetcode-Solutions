class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
int largest=-1;
for(int i=0;i<arr.length;i++){
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()==entry.getKey()){
            largest=Math.max(largest,entry.getKey());
        }
    }
}

return largest;


    }
}
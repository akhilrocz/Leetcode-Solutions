class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int maxOdd= Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0 && entry.getValue()>maxOdd)
            {
                maxOdd = entry.getValue();
            }else if(entry.getValue()%2==0 && entry.getValue()<minEven){
                minEven = entry.getValue();
            }
        }


        return maxOdd- minEven;
    }
}
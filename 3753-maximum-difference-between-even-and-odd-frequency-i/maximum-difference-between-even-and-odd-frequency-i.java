class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int maxOdd= 1;
        int minEven = 99999998;

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
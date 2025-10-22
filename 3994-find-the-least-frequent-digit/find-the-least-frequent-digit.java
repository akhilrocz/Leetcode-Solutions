class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = String.valueOf(n);
        Map<Character,Integer> map = new HashMap<>();
        char res =' ';
        int leastFrequent =Integer.MAX_VALUE;
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()<leastFrequent){
                leastFrequent = entry.getValue();
                res=entry.getKey();
            }
        }
int num =  Character.getNumericValue(res);

return num;

    }
}
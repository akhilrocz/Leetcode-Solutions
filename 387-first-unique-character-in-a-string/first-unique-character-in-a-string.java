class Solution {
    public int firstUniqChar(String s) {
       Map<Character, int[]> map = new LinkedHashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, new int[]{0, i}));
            map.get(c)[0]++;
        }
        
        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            if (entry.getValue()[0] == 1) {
                return entry.getValue()[1];
            }
        }
        
        return -1;
    }
}
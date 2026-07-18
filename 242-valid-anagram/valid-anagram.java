class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();

        s=s.trim().replaceAll("[^a-zA-Z]","");

        t=t.trim().replaceAll("[^a-zA-Z]","");

        if(s.length()!=t.length()) return false;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char key : map.keySet()) {
            if (!map.get(key).equals(map1.get(key)) ) {
                return false;
            }
        }

        return true;
    }
}
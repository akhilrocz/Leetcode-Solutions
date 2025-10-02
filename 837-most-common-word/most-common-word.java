class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        String s = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = s.split("\\s+");
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int max = 0;
        String res = "";

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!bannedSet.contains(entry.getKey()) && entry.getValue() > max) {
                res = entry.getKey();
                max = entry.getValue();
            }
        }

        return res;

    }
}
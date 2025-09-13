class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Integer> vowelFrequencies = new ArrayList<>();
        List<Integer> constantFrequencies = new ArrayList<>();

        int maxVowelFrequency = 0;
        int maxConstantFrequency = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 'a' || entry.getKey() == 'e' || entry.getKey() == 'i' || entry.getKey() == 'o'
                    || entry.getKey() == 'u') {
                vowelFrequencies.add(entry.getValue());
            } else if (Character.isLetter(entry.getKey()) && entry.getKey() != 'a'
                    || Character.isLetter(entry.getKey()) && entry.getKey() != 'e'
                    || Character.isLetter(entry.getKey()) && entry.getKey() != 'i'
                    || Character.isLetter(entry.getKey()) && entry.getKey() != 'o'
                    || Character.isLetter(entry.getKey()) && entry.getKey() != 'u') {
                constantFrequencies.add(entry.getValue());
            }
        }

        for (int num : vowelFrequencies) {
            maxVowelFrequency = Math.max(num, maxVowelFrequency);
        }

        for (int n : constantFrequencies) {
            maxConstantFrequency = Math.max(n, maxConstantFrequency);
        }

        return maxVowelFrequency + maxConstantFrequency;

    }
}
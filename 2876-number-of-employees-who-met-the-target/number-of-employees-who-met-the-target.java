class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Map<Integer, Integer> hourCounts = new HashMap<>();

        for (int hour : hours) {
            hourCounts.put(hour, hourCounts.getOrDefault(hour, 0) + 1);
        }

        int count = 0;
        for (int hour : hourCounts.keySet()) {
            if (hour >= target) {
                count += hourCounts.get(hour);
            }
        }

        return count;
    }
}
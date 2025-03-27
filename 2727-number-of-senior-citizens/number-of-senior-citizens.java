class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        List<String> ages = new ArrayList<>();
        for (int i = 0; i < details.length; i++) {
            ages.add(details[i].substring(11, 13));
        }

        for (int i = 0; i < ages.size(); i++) {
            if (Integer.parseInt(ages.get(i)) > 60) {
                count++;
            }
        }

        return count;
    }
}
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int leastIndexSum = Integer.MAX_VALUE;
        // String commonStr = "";
        int currentSum = 0;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    currentSum = i + j;
                    if (currentSum < leastIndexSum) { //3<Integer.MAX_VALUE
                        leastIndexSum = currentSum; //3
                        res.clear();
                        res.add(list1[i]); //Shogun
                    } else if (currentSum == leastIndexSum) {
                        res.add(list1[i]);
                    }
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
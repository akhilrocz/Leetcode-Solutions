class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int x = fruits.length;
        int y = baskets.length;
        boolean used[] = new boolean[fruits.length];
        int count = 0;
        for (int i = 0; i < x; i++) {
            boolean placed =false;
            for (int j = 0; j < y; j++) {
                if (!used[j] && fruits[i] <= baskets[j]) {
                    placed =true;  //if fruit placed in basket
                    used[j]=true;  //basket is used
                    break;
                }
            }
            if(!placed){
            count++;
            }
        }

        return count;
    }
}
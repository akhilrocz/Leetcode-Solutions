class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        List<Integer> l = new ArrayList<>();
        for(int[] row:accounts){
            int sum = 0;
            for(int val:row){
                sum+=val;
            }
            l.add(sum);
        }


        for (int k = 0; k < l.size(); k++) {
            if (l.get(k) > maxWealth) {
                maxWealth = l.get(k);
            }
        }

        return maxWealth;

    }
}
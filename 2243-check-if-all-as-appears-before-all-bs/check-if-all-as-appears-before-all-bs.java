class Solution {
    public boolean checkString(String s) {
        List<Integer> aIndices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aIndices.add(i);
            }
        }

        List<Integer> bIndices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                bIndices.add(i);
            }
        }
        boolean flag = true;
        for (int i = 0; i < aIndices.size(); i++) {
            for (int j = 0; j < bIndices.size(); j++) {
                if (aIndices.get(i) > bIndices.get(j)) {
                    flag = false;
                    break;
                }
            }
        }

    return flag;

    }
}
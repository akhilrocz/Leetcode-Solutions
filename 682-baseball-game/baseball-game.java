class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String op : operations) {
            try {
                int num = Integer.parseInt(op);
                list.add(num);
            } catch (NumberFormatException e) {
                if (op.equals("C")) {
                    if (!list.isEmpty()) {
                        list.remove(list.get(list.size() - 1));
                    }
                } else if (op.equals("D")) {
                    if (!list.isEmpty()) {
                        // list.add(2 * list.size() - 1);
                        list.add(2*list.get(list.size()-1));
                    }
                } else if (op.equals("+")) {
                    if (!list.isEmpty()) {
                     int sum= list.get(list.size() - 1) + list.get(list.size() - 2);
                     list.add(sum);
                    }
                }
            }
        }

        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res += list.get(i);
        }

        return res;
    }
}
class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> counts = new HashMap<>();

        for(char c:s.toCharArray()){
            counts.put(c,counts.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->counts.get(b)-counts.get(a));

        for(char ch:counts.keySet()){
            maxHeap.offer(ch);
        }

        StringBuilder sb = new StringBuilder();

        while(!maxHeap.isEmpty()){
            char ch = maxHeap.poll();

            int count = counts.get(ch);

            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }

        return sb.toString();

    }
}
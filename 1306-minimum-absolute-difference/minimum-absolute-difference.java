class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minAbsoluteDiff =Integer.MAX_VALUE;
        List<List<Integer>> res =new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int diff =Math.abs(arr[i+1]-arr[i]);
            if(diff<minAbsoluteDiff){
                minAbsoluteDiff=diff;
                res.clear();  //clear prev result
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }else if(diff == minAbsoluteDiff){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}
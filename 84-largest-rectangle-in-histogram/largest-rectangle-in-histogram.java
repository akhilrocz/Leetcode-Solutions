class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();

        int maxArea=0;

        for(int i=0;i<=n;i++){
            int currentHeight = i==n?0:heights[i];

            while(!stk.isEmpty() && currentHeight<heights[stk.peek()]){
                int height = heights[stk.pop()];

                int width;

                if(stk.isEmpty()){
                    width=i;
                }else{
                    width=i-stk.peek()-1;
                }

                maxArea = Math.max(maxArea, height*width);
            }

            stk.push(i);
        }

        return maxArea;
    }
}
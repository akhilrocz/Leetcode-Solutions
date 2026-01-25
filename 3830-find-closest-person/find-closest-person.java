class Solution {
    public int findClosest(int x, int y, int z) {
        int noOfStepsRequired1 = Math.abs(x-z);
        int noOfStepsRequired2 = Math.abs(y-z);

        return noOfStepsRequired1>noOfStepsRequired2?2:noOfStepsRequired1==noOfStepsRequired2?0:1;

    }
}
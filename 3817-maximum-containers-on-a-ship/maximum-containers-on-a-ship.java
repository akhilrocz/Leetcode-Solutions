class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int deckCells = n*n;
        if(deckCells*w<=maxWeight){
            return deckCells;
        }
            return maxWeight/w;
    }
}
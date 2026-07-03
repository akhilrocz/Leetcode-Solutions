class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> rows = new HashSet<>(); 
        Set<Integer> columns = new HashSet<>();
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //1st row 1st columns
                if(matrix[i][j]==0){
                    rows.add(i);  
                    columns.add(j);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows.contains(i) || columns.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
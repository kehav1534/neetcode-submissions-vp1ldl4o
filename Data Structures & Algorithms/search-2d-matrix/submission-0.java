class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        int midRow = (top+bottom)/2;
        int midCol = (left+right)/2;

        while(top<=bottom && left<=right){

            if( matrix[midRow][midCol] == target) return true;

            if( target>=matrix[midRow][0] && 
                target<=matrix[midRow][matrix[0].length-1]){
                    if(target<matrix[midRow][midCol])
                        right = midCol-1;
                    else left = midCol+1;
                    midCol = (left+right)/2;
                }
            else{
                if(target<matrix[midRow][0]) bottom = midRow-1;
                else top = midRow+1;
                midRow = (top+bottom)/2;
            }
        }
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows*cols-1;
        while(left <= right){
            //imagine 2d array and sorted 1d array and apply binary search;
            int mid = (left+right)/2;
            int row = mid/cols; //get specific row
            int col = mid%cols; //get specific column
            int value = matrix[row][col]; //get value
            
            if(value==target){
                return true;
            }

            if(value<target){
                left=mid+1;
            }

            if(value>target){
                right=mid-1;
            }

        }
        return false;
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int row=matrix.length;
        int col=matrix[0].length;
        int j=row*col-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            int curr=matrix[mid/col][mid%col];
            if(curr==target)
            {
                return true;
            }
            else if(curr<target)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return false;
    }
}
class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=(m*n)-1;

        while (left<=right)
        {
            int mid=(left+right)/2;
            int row=mid/n;
            int col=mid%n;
            int present_num=matrix[row][col];
            if (present_num == target)
            {
                return true;
            }
            else if (present_num<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}
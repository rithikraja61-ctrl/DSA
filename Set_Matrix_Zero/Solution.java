class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row=new ArrayList<>();
        List<Integer> col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(j);
                    col.add(i);
                }
            }
        }
        int[][] result=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            if(col.contains(i))
            {
                continue;
            }
            for(int j=0;j<matrix[i].length;j++)
            {
                if(row.contains(j))
                {
                    continue;
                }
                result[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]=result[i][j];
            }
        }
    }
}
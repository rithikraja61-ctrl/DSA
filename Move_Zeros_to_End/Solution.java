class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++)
        {
            int temp=0;
            int j=i;
            while(j!=0&&arr[j]==0&&arr[j+1]!=0)
            {
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
                if(j==-1)
                {
                    break;
                }
            }
        }
    }
}
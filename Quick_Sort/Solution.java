class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high)
        {
            int partition=partition(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot=low;
        int i=low;
        int j=high;
        while(i<j)
        {
            while(i<=high&&arr[pivot]>=arr[i])
            {
                i++;
            }
            while(j>=low&&arr[pivot]<arr[j])
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
}
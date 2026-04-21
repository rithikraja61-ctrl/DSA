class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int i=0;
        int j=arr.length-1;
        int min=arr[i];
        int index=0;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(arr[mid]<min)
            {
                min=arr[mid];
                index=mid;
            }
            else if(arr[mid]>arr[j])
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return index;
    }

}
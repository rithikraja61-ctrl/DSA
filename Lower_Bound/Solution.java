class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int mid=0;
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(arr[mid]==target)
            {
                while(mid!=0&&arr[mid]==arr[mid-1])
                {
                    mid--;
                }
                return mid;
            }
            else if(arr[mid]<target)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }

        }
        if(mid==arr.length-1)
        {
            if(arr[mid]<target)
            {
                return i;
            }
        }

        if(arr[mid]>target)
        {
            return mid;
        }
        else
        {
            return mid+1;
        }
    }
}

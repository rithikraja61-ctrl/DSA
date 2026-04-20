class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int i=0;
        int j=arr.length-1;
        int mid=0;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(arr[mid]==target)
            {
                while(mid!=arr.length&&arr[mid]==arr[mid+1])
                {
                    mid++;
                }
                return mid+1;
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
        if(arr[mid]<target)
        {
            return mid+1;
        }
        else
        {
            return mid;
        }
    }
}
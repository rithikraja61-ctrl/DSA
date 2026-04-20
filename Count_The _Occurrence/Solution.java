class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int i=0;
        int j=arr.length-1;
        int mid=0;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(arr[mid]==target)
            {
                int count=1;
                int back=mid;
                int forward=mid;
                while(back!=0&&arr[back]==arr[back-1])
                {
                    back--;
                    count++;
                }
                while(forward!=arr.length-1&&arr[forward]==arr[forward+1])
                {
                    forward++;
                    count++;
                }
                return count;
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
        return 0;
    }
}

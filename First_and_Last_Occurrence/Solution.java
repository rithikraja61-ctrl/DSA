class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int[] arr=new int[2];
        int mid=0;
        if(nums.length==0)
        {
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        while(i<=j)
        {
            mid=(i+j)/2;
            if(nums[mid]==target)
            {
                int first=mid;
                int last=mid;
                while(first!=0&&nums[first]==nums[first-1])
                {
                    first--;
                }
                while(last!=nums.length-1&&nums[last]==nums[last+1])
                {
                    last++;
                }
                arr[0]=first;
                arr[1]=last;
                return arr;
            }
            else if(nums[mid]>target)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        arr[0]=-1;
        arr[1]=-1;
        return arr;
    }
}
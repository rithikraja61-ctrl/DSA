class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mid=0;
        if(j==0)
        {
            return 0;
        }
        while(i<=j)
        {
            mid=(i+j)/2;
            if(nums.length-1!=mid&&nums[mid]>nums[mid+1]&&mid!=0&&nums[mid]>nums[mid-1]||nums.length-1==mid&&nums[mid-1]<nums[mid]||mid==0&&nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }

        }
        return 0;
    }
}
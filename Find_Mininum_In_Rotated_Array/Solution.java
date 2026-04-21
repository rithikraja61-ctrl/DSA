class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int i=0;
        int j=nums.length-1;
        int mid=0;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(nums[mid]<min)
            {
                min=nums[mid];
            }
            else if(nums[j]>nums[mid])
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return min;
    }
}
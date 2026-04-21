class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mid=0;
        if(j==0)
        {
            return nums[0];
        }
        while(i<=j)
        {
            mid=(i+j)/2;
            if(mid!=nums.length-1&&nums[mid]!=nums[mid+1]&&mid!=0&&nums[mid]!=nums[mid-1]||mid==nums.length-1&&nums[mid]!=nums[mid-1]||mid==0&&nums[mid+1]!=nums[mid])
            {

                return nums[mid];
            }
            else if((nums.length-mid-1)%2==0)
            {
                if(mid!=nums.length-1&&nums[mid]==nums[mid+1])
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }
            }
            else
            {
                if(mid!=nums.length-1&&nums[mid+1]==nums[mid])
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
        }
        return -1;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int max=0;
        int negmax=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<negmax)
            {
                negmax=nums[i];
            }
        }
        int[] hash=new int[max+1];
        int[] neghash=new int[(-negmax)+1];
        for(int i=0;i<nums.length;i++)
        {
            boolean ispositive=true;
            if(nums[i]<0)
            {
                ispositive=false;
            }
            if(ispositive&&hash[nums[i]]!=0)
            {
                return true;
            }
            else if(ispositive)
            {
                hash[nums[i]]++;
            }
            else if(neghash[-nums[i]]!=0)
            {
                return true;
            }
            else
            {
                neghash[-nums[i]]++;
            }
        }
        return false;
    }
}
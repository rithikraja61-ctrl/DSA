class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        else if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++)
        {
            int key=nums[i];
            int j=i-1;
            while(j>=0&&nums[j]>key)
            {
                nums[j+1]=nums[j];
                nums[j]=key;
                j--;
            }
            nums[j+1]=key;
        }

        int max=1;
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            int diff=nums[i+1]-nums[i];
            if(diff<0)
            {
                diff=-diff;
            }
            if(diff==1)
            {
                count++;
            }
            else
            {
                if(count>=max)
                {
                    count++;
                    max=count;
                }
                count=0;
            }
        }
        if(nums[nums.length-2]-nums[nums.length-1]<=1)
        {
            count++;
        }
        if(count>max)
        {
            max=count;
        }
        return max;
    }
}
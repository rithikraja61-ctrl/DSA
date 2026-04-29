class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }

            sum=sum+nums[i];
        }

        int i=0;
        int j=max;

        while(i<=j)
        {
            int mid=(i+j)/2;
            int result=sumOfDivisior(nums,mid);
            if(result<=threshold)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return i;

    }
    int sumOfDivisior(int[] arr,int d)
    {
        double total=0;
        for(int i=0;i<arr.length;i++)
        {
            total=total+Math.ceil((double)arr[i]/(double)d);
        }
        return (int)total;
    }
}
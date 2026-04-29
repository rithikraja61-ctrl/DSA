class Solution {
    public int findGCD(int[] nums) {
        int largest=0;;
        int smallest=nums[0];
        int gcd=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {
                largest=nums[i];
            }
            if(nums[i]<smallest)
            {
                smallest=nums[i];
            }
        }
        for(int i=smallest;i>0;i--)
        {
            if(smallest%i==0&&largest%i==0)
            {
                gcd=i;
                break;
            }
        }
        return gcd;
    }
}
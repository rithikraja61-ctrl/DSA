class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max=piles[i];
            }
        }
        int i=1;
        int j=max;
        while(i<=j)
        {
            int mid=(i+j)/2;
            int result=maxHour(piles,mid);
            if(result<=h)
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
    int maxHour(int[] arr,int speed)
    {
        double total=0;
        for(int i=0;i<arr.length;i++)
        {
            total=total+Math.ceil((double)arr[i]/(double)speed);
        }
        return (int)total;
    }
}
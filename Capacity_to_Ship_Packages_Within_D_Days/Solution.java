class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int low=0;
        for(int i=0;i<weights.length;i++)
        {
            max=max+weights[i];
            if(low<weights[i])
            {
                low=weights[i];
            }
        }
        int i=low;
        int j=max;
        int ans=0;
        while(i<=j)
        {
            int mid=(i+j)/2;
            int cap=cap(mid,weights);

            if(cap<=days)
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
    int cap(int num,int[] weights)
    {
        int max=0;
        int capacity=1;
        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]+max>num)
            {
                capacity++;
                max=weights[i];

            }
            else
            {
                max+=weights[i];
            }

        }

        return capacity;
    }
}
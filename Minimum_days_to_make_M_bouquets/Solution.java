class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max=0;
        int min=bloomDay[0];
        if(bloomDay.length<m*k)
        {
            return -1;
        }
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]>max)
            {
                max=bloomDay[i];
            }
            if(bloomDay[i]<min)
            {
                min=bloomDay[i];
            }
        }
        int i=min;
        int j=max;
        int result=0;
        int ans=0;
        while(i<=j)
        {
            int mid=(i+j)/2;
            result=bloomDay(bloomDay,mid,k);
            if(result>=m)
            {
                j=mid-1;
                ans=mid;
            }
            else
            {
                i=mid+1;
            }
        }
        if(ans==0)
        {
            return -1;
        }
        return ans;
    }
    int bloomDay(int[] arr,int day,int k)
    {
        int bouquet=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                if(count>=k)
                {
                    bouquet=bouquet+count/k;
                }
                count=0;
            }
        }
        if(count>=k)
        {
            bouquet=bouquet+count/k;
            count=0;
        }
        return bouquet;
    }
}
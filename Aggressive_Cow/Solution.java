class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[stalls.length-1]-stalls[0];
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(cowCal(stalls,mid,k))
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return high;

    }
    boolean cowCal(int[] arr,int d,int k)
    {
        int count=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]-last)>=d)
            {

                count++;
                last=arr[i];
            }
        }
        if(k<=count)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
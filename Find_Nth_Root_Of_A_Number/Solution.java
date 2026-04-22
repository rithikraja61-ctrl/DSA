class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int i=0;
        int j=m;
        int mid=0;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(Math.pow(mid,n)==m)
            {
                return mid;
            }
            else if(Math.pow(mid,n)>m)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return -1;
    }
}
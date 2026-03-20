class Solution {
    public static int gcd(int a, int b) {
        // code here
        int n=0;
        int r=0;
        if(a>b)
        {
            n=b;
        }
        else{
            n=a;
        }
        for(int i=n;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                r=i;
                break;
            }
        }
        return r;
    }
}
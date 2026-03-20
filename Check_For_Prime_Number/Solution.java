class Solution {
    static boolean isPrime(int n) {
        // code here
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                count++;
                if(n/i==i)
                {
                    return false;
                }
            }
            if(count==2)
            {
                return false;
            }
        }
        return true;
    }
}
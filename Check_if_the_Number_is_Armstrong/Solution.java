// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original=n;
        int sum=0;
        int length=String.valueOf(n).length();

        while(n!=0)
        {
            int temp=n%10;
            sum=sum+Solution.pow(temp,length);
            n=n/10;
        }
        if(original==sum)
        {
            return true;
        }
        else{
            return false;
        }

    }
    static int pow(int base,int power)
    {
        int total=base;
        for(int i=1;i<power;i++)
        {
            total=base*total;
        }
        return total;
    }
}

class Solution {
    public int reverse(int x) {
        boolean isPositive=true;
        if(x<0)
        {
            isPositive=false;
            x=-x;
        }
        String reverse="";
        while(x>0)
        {
            reverse=reverse+(x%10);
            x=x/10;
        }
        try{
            if(isPositive)
            {
                return Integer.parseInt(reverse);
            }
            else
            {
                return -Integer.parseInt(reverse);
            }
        }
        catch(Exception e)
        {
            return 0;
        }
    }
}
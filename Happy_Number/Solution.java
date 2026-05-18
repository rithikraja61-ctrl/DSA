class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();

        while(!set.contains(n))
        {
            set.add(n);
            n=happy(n);
            if(n==1)
            {
                return true;
            }
        }
        return false;
    }
    int happy(int a)
    {
        int sum=0;
        while(a>0)
        {
            sum+=Math.pow(a%10,2);
            a=a/10;
        }
        return sum;
    }
}
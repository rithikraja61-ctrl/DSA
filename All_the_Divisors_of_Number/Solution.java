class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                l.add(i);

                if(n/i!=i)
                {
                    l.add(n/i);
                }
            }
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}

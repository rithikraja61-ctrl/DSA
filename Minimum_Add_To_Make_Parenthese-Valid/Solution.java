class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int need=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;


            }
            else
            {
                if(open>0)
                {
                    open--;
                }
                else
                {
                    need++;
                }

            }
        }

        return Math.abs(open+need);
    }
}
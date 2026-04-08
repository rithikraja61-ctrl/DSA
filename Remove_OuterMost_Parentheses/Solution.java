class Solution {
    public static String removeOuter(String s) {
        // code here
        String temp="";
        int open=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;

                if(open!=1)
                {
                    temp=temp+s.charAt(i);
                }

            }
            else if(s.charAt(i)==')')
            {
                if(open!=1)
                {
                    temp=temp+s.charAt(i);
                }
                open--;
            }
            else{
                temp=temp+s.charAt(i);
            }

        }
        return temp;
    }
}

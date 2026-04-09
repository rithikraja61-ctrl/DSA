class Solution {
    public String reverseWords(String s) {
        // Code here
        String reverse="";
        String ans="";
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='.')
            {
                temp=temp+s.charAt(i);
            }
            if(s.charAt(i)=='.'&&temp!="")
            {

                temp=temp+".";
                reverse=temp+reverse;
                temp="";
            }
            if(i==s.length()-1&&temp!="")
            {
                temp=temp+".";
                reverse=temp+reverse;
            }
        }
        for(int i=0;i<reverse.length()-1;i++)
        {
            ans=ans+reverse.charAt(i);
        }
        return ans;
    }
}

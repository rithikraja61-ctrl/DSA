class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            String temp="";
            for(int j=i;j<s.length();j++)
            {
                temp=temp+s.charAt(j);
                sum=sum+beautyString(temp);
            }
            temp="";
        }
        return sum;
    }
    int beautyString(String s)
    {
        int letter[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            letter[s.charAt(i)-'a']++;
        }
        int min=letter[s.charAt(0)-'a'];
        int max=0;
        for(int i=0;i<letter.length;i++)
        {
            if(letter[i]>max)
            {
                max=letter[i];
            }
            if(letter[i]!=0&&letter[i]<min)
            {
                min=letter[i];
            }
        }
        return max-min;
    }
}
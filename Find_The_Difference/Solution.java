class Solution {
    public char findTheDifference(String s, String t) {
        int[] feq1=new int[26];
        int[] feq2=new int[26];
        for(int i=0;i<s.length();i++)
        {
            feq1[s.charAt(i)-'a']++;
            feq2[t.charAt(i)-'a']++;
        }
        feq2[t.charAt(s.length())-'a']++;
        for(char a:s.toCharArray())
        {
            feq2[a-'a']--;
        }
        char ans=' ';
        for(int i=0;i<feq2.length;i++)
        {
            if(feq2[i]==1)
            {
                ans=(char)(i+'a');
            }
        }
        return ans;
    }
}
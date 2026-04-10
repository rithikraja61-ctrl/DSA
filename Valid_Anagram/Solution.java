class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letter=new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            letter[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            letter[t.charAt(i)-'a']--;
        }
        for(int i=0;i<letter.length;i++)
        {
            if(letter[i]!=0)
            {
                return false;

            }
        }
        return true;
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=needle.length()-1;

        while(j<haystack.length())
        {

            if(haystack.charAt(i)==needle.charAt(0)&&haystack.charAt(j)==needle.charAt(needle.length()-1))
            {

                if(haystack.substring(i,j+1).equals(needle))
                {
                    return i;
                }
            }
            i++;
            j++;

        }
        return -1;
    }
}
class Solution {
    public String frequencySort(String s) {
        int[] hash=new int[256];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
        }
        String result="";
        boolean isEmpty=false;
        while(!isEmpty)
        {
            int index=max(hash);
            if(index==-1)
            {
                isEmpty=true;
                continue;
            }
            result=result+String.valueOf((char)(index)).repeat(hash[index]);
            hash[index]=0;
        }
        return result;

    }
    int max(int[] hash)
    {
        int max=0;
        int index=0;
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i]>max)
            {
                max=hash[i];
                index=i;
            }
        }
        if(max==0)
        {
            return -1;
        }
        return index;
    }
}
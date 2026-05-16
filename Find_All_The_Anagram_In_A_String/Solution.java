class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i=0;
        int j=p.length()-1;
        p=fequency(p);
        List<Integer> list=new ArrayList<>();
        while(j<s.length())
        {
            String temp=s.substring(i,j+1);
            if(p.equals(fequency(temp)))
            {
                list.add(i);
            }
            i++;
            j++;
        }
        return list;
    }
    String fequency(String str)
    {
        int[] characterFeq=new int[26];
        for(int i=0;i<str.length();i++)
        {

            characterFeq[str.charAt(i)-'a']++;
        }
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<characterFeq.length;i++)
        {
            if(characterFeq[i]==0)
            {
                continue;
            }
            str1.append((char)(i+'a'));
            str1.append(characterFeq[i]);
        }
        return str1.toString();
    }
}
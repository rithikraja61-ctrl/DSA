class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String fequency=feq(strs[i]);
            if(map.containsKey(fequency))
            {
                map.get(fequency).add(strs[i]);
            }
            else
            {
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                map.put(fequency,temp);
            }
        }
        List<List<String>> group=new ArrayList<>();
        for(String key:map.keySet())
        {
            group.add(map.get(key));
        }
        return group;
    }
    String feq(String str)
    {
        char[] charFeq=new char[26];
        for(int i=0;i<str.length();i++)
        {
            charFeq[str.charAt(i)-'a']++;
        }
        String str1="";
        for(int i=0;i<charFeq.length;i++)
        {
            str1=str1+i;
            str1=str1+charFeq[i];
        }

        return str1;
    }

}
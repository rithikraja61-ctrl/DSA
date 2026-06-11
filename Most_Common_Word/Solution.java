class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<banned.length;i++)
        {
            set.add(banned[i]);
        }
        Set<Character> sep=new HashSet<>();
        sep.add(' ');
        sep.add('!');
        sep.add('?');
        sep.add('\'');
        sep.add('\"');
        sep.add(',');
        sep.add(';');
        sep.add('.');
        Map<String,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<paragraph.length();i++)
        {
            if(sep.contains(paragraph.charAt(i)))
            {
                String temp=sb.toString();
                if(set.contains(temp)||temp.isEmpty())
                {
                    sb.setLength(0);
                    continue;
                }
                if(map.containsKey(temp))
                {
                    map.put(temp,map.get(temp)+1);
                }
                else
                {
                    map.put(temp,1);
                }
                sb.setLength(0);
            }
            else
            {
                if(paragraph.charAt(i)<97)
                {
                    sb.append((char)(paragraph.charAt(i)+32));
                }
                else
                {
                    sb.append(paragraph.charAt(i));
                }

            }
        }
        String temp=sb.toString();
        if(temp.length()!=0)
        {
            if(map.containsKey(temp))
            {
                map.put(temp,map.get(temp)+1);
            }
            else
            {
                map.put(temp,1);
            }
        }
        int max=0;
        String result="";
        for(String s:map.keySet())
        {
            if(map.get(s)>max)
            {
                max=map.get(s);
                result=s;
            }
        }
        return result;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        int maxFeq=0;
        while(j<s.length())
        {
            if(map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
            }
            else
            {
                map.put(s.charAt(j),1);
            }
            maxFeq=Math.max(maxFeq,map.get(s.charAt(j)));
            if((j-i+1)-maxFeq>k)
            {
                maxFeq=0;
                map.put(s.charAt(i),map.get(s.charAt(i))-1);

                i++;
            }


            if((j-i+1)-maxFeq<=k&&j-i+1>max)
            {
                max=j-i+1;
            }
            j++;
        }
        return max;
    }
}
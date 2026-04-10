class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> isomorphic = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!isomorphic.containsKey(original))
            {
                if(!isomorphic.containsValue(replacement))
                {
                    isomorphic.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char a=isomorphic.get(original);
                if(a!=replacement)
                {
                    return false;
                }
            }
        }
        return true;

    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        int i=0;
        int j=0;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(j<fruits.length)
        {
            if(map.containsKey(fruits[j]))
            {
                map.put(fruits[j],map.get(fruits[j])+1);
            }
            else
            {
                if(map.size()==2)
                {
                    map.clear();
                    int count=0;
                    int fruit=fruits[j-1];
                    i=j;
                    do
                    {
                        count++;
                        i--;
                    }while(fruits[i]==fruits[i-1]);
                    map.put(fruit,count);
                }

                map.put(fruits[j],1);

            }
            if(j-i+1>max)
            {
                max=j-i+1;
            }
            j++;
        }
        return max;
    }
}
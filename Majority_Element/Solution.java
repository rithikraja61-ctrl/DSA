class Solution {
    public int majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        Collections.sort(list);
        int count=0;
        int value=list.get(0);
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i).equals(list.get(i+1)))
            {
                count++;
            }
            else{
                count=0;
            }
            if(count>=list.size()/2)
            {
                value=list.get(i);
                break;
            }

        }
        return value;
    }
}
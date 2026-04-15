class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.containsKey(nums[i]))
            {
                return true;
            }
            else{
                hash.put(nums[i],1);
            }
        }
        return false;
    }
}
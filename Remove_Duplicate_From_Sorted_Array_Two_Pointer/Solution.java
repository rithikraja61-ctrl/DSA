class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        int counter=0;
        if(nums.length==1)
        {
            return nums[0];
        }

        List<Integer> list=new ArrayList<>();
        while(j!=nums.length)
        {
            if(nums[i]!=nums[j])
            {
                list.add(nums[i]);
                counter++;
                i=j;
                j=i+1;
            }
            else
            {
                i++;
                j++;
            }


        }

        list.add(nums[nums.length-1]);
        counter++;

        for(int k=0;k<counter;k++)
        {
            nums[k]=list.get(k);
        }
        System.out.println(counter);
        return counter;

    }
}
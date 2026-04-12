class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        Collections.sort(list);
        int i=0;
        int j=list.size()-1;
        int[] arr=new int[2];
        while(i!=j)
        {
            if(list.get(i)+list.get(j)==target)
            {
                int a=list.get(i);
                int b=list.get(j);
                boolean added=false;
                for(int k=0;k<nums.length;k++)
                {
                    if(a==nums[k]&&!added)
                    {
                        arr[0]=k;
                        added=true;
                    }
                    else if(b==nums[k])
                    {
                        arr[1]=k;
                    }
                }
                break;
            }
            else if(list.get(i)+list.get(j)>target)
            {
                j--;
            }
            else{
                i++;
            }


        }
        return arr;
    }
}
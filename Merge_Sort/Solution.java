class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    void mergesort(int[] array,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(high+low)/2;
        mergesort(array,low,mid);
        mergesort(array,mid+1,high);
        merge(array,low,mid,high);
    }
    void merge(int[] array,int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;
        List<Integer> list=new ArrayList<>();
        while(left<=mid&&right<=high)
        {
            if(array[left]>=array[right])
            {
                list.add(array[right]);
                right++;
            }
            else{
                list.add(array[left]);
                left++;
            }
        }
        while(left<=mid)
        {
            list.add(array[left]);
            left++;
        }
        while(right<=high)
        {
            list.add(array[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            array[i]=list.get(i-low);
        }
    }
}
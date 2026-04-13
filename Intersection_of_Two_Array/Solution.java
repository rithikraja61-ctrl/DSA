class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        for(int i=1;i<nums1.length;i++)
        {
            int key=nums1[i];
            int j=i-1;
            while(j>=0&&nums1[j]>key)
            {
                nums1[j+1]=nums1[j];
                nums1[j]=key;
                j--;
            }
            nums1[j+1]=key;
        }
        for(int i=1;i<nums2.length;i++)
        {
            int key=nums2[i];
            int j=i-1;
            while(j>=0&&nums2[j]>key)
            {
                nums2[j+1]=nums2[j];
                nums2[j]=key;
                j--;
            }
            nums2[j+1]=key;
        }
        int i=0;
        int j=0;
        List<Integer> list=new ArrayList<>();
        while(i!=nums1.length&&j!=nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                j++;
            }
            else if(nums2[j]>nums1[i]){
                i++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] num=new int[list.size()];
        for(int k=0;k<list.size();k++)
        {
            num[k]=list.get(k);
        }
        return num;
    }

}
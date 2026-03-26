class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
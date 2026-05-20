class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        int[] num=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(set.contains(A[i]))
            {
                count++;
            }
            else
            {
                set.add(A[i]);
            }
            if(set.contains(B[i]))
            {
                count++;
            }
            else
            {
                set.add(B[i]);
            }
            num[i]=count;
        }
        return num;
    }
}
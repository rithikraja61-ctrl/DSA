class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max=0;
        int cons=0;
        for(int i=0;i<arr.length;i++)
        {
            cons++;
            if(i==arr.length-1)
            {
                break;
            }
            else if(arr[i]!=arr[i+1])
            {
                cons=0;
            }
            if(cons>max)
            {
                max=cons;
            }

        }


        return max+1;
    }
}

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=0;
        int secondLargest=0;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(secondLargest<arr[i]&&largest>arr[i])
            {
                secondLargest=arr[i];
            }


        }
        if(secondLargest==0)
        {
            return -1;
        }
        return secondLargest;
    }
}
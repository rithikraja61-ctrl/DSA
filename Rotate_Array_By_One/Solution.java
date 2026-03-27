// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(i+1==arr.length)
            {
                temp[0]=arr[i];
            }
            else{
                temp[i+1]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
    }
}
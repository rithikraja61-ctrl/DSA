class Solution {
    int missingNum(int arr[]) {
        int total=0;
        for(int i=1;i<=arr.length+1;i++)
        {
            total=i+total;
        }
        int arrSum=0;
        for(int i=0;i<arr.length;i++)
        {
            arrSum=arr[i]+arrSum;
        }
        return total-arrSum;
    }
}
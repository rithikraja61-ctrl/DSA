class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int ans=0;
        for(int i=0;i<n;i+=2)
        {
            if(i==n-1)
            {
                break;
            }
            if(arr[i]!=arr[i+1])
            {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
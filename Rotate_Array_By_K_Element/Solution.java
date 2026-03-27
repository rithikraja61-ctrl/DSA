{
static void rotateArr(int arr[], int d) {
    // code here
    int[] temp=new int[arr.length];
    for(int i=0;i<d;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(j-1==-1)
            {
                temp[arr.length-1]=arr[j];
            }
            else{
                temp[j-1]=arr[j];
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            arr[k]=temp[k];
        }
    }


}
}
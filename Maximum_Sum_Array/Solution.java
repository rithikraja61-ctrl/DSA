// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int resultSum=0;
        ArrayList<Integer>  temp=new ArrayList<>();
        int tempSum=0;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<0)
            {
                if(tempSum>resultSum)
                {
                    resultSum=tempSum;
                    result=temp;
                }
                else if(tempSum==resultSum)
                {
                    if(temp.size()>result.size())
                    {
                        result=temp;
                    }
                }

                temp=new ArrayList<>();
                tempSum=0;
                continue;
            }
            tempSum=tempSum+arr[i];
            temp.add(arr[i]);
        }
        if(tempSum>resultSum)
        {
            result=temp;
        }
        else if(resultSum==0)
        {
            result.add(-1);
        }
        return result;
    }

}
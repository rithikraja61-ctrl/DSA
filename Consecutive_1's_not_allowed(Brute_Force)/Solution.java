class Solution {
    int total=0;
    int countStrings(int n) {
        // code here
        con(0,n,false);
        return total;
    }
    void con(int l,int n,boolean isOnes)
    {
        if(l==n)
        {
            total++;
            return;
        }

        con(l+1,n,false);
        if(!isOnes)
        {
            con(l+1,n,true);
        }

    }
}
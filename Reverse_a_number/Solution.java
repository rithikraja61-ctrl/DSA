// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        String result="";
        while(n!=0)
        {
            int temp=n%10;
            n=n/10;
            result= result+temp;
        }
        return Integer.parseInt(result);
    }
}
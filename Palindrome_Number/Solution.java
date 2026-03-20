class Solution {
    public boolean isPalindrome(int n) {
        // code here
        String reverse="";
        String original=String.valueOf(n);
        while(n!=0)
        {
            reverse=reverse+n%10;
            n=n/10;
        }
        return reverse.equals(original);
    }
}
import java.math.*;
class Solution {
    public String largestOddNumber(String num) {
        int i=0;
        int j=1;
        BigInteger max=new BigInteger("0");
        if(num.length()==1)
        {
            if(Long.parseLong(num)%2==0)
            {
                return "";
            }
            return num;
        }
        long check=Long.parseLong(""+num.charAt(i));
        if(check%2!=0)
        {
            max=BigInteger.valueOf(check);
        }
        while(i!=j)
        {
            String a=""+num.charAt(i);
            String b=""+num.charAt(j);
            String temp="";
            for(int k=i;k<=j;k++)
            {
                temp=temp+num.charAt(k);
            }
            BigInteger big=new BigInteger(temp);
            if(big.testBit(0))
            {
                if(big.compareTo(max)==1)
                {
                    max=big;
                }
            }
            if(j!=num.length()-1)
            {
                j++;
            }
            else{
                if(max.toString().length()>=num.length()/2)
                {
                    break;
                }
                i++;
            }


        }
        if(max.compareTo(BigInteger.valueOf(0))==0)
        {
            return "";
        }
        return String.valueOf(max);
    }
}
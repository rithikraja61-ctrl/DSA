class Solution {
    public String getHint(String secret, String guess) {
        int correct=0;
        int incorrect=0;
        int[] correctFeq=new int[10];
        int[] guessFeq=new int[10];
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                correct++;
            }
            else
            {
                correctFeq[secret.charAt(i)-'0']++;
                guessFeq[guess.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<correctFeq.length;i++)
        {
            incorrect+=Math.min(correctFeq[i],guessFeq[i]);
        }
        return correct+"A"+incorrect+"B";
    }
}
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leader=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        int currentLeader=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=currentLeader)
            {
                currentLeader=arr[i];
                leader.add(currentLeader);
            }

        }
        for(int i=leader.size()-1;i>=0;i--)
        {
            list.add(leader.get(i));
        }
        return list;
    }
}

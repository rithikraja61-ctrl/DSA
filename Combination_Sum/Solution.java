class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list =new ArrayList<>();
        combo(0,candidates,target,list,new ArrayList<>());
        return list;
    }
    public void combo(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> c)
    {
        if(ind==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(c));
            }
            return;
        }
        if(arr[ind]<=target)
        {
            c.add(arr[ind]);
            combo(ind,arr,target-arr[ind],ans,c);

            c.removeLast();

        }
        combo(ind+1,arr,target,ans,c);


    }

}
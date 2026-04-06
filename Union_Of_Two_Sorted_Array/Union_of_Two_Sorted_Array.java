class Solution {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            temp.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            temp.add(b[i]);
        }
        Collections.sort(temp);
        ArrayList<Integer> union=new ArrayList<>();
         if(temp.get(0)==temp.get(1))
        {
            union.add(temp.get(0));
        }
        for(int i=1;i<temp.size();i++)
        {

            if(!temp.get(i-1).equals(temp.get(i)))
            {
                if(i==1)
             {
                 union.add(temp.get(0));
             }
                union.add(temp.get(i));

            }

        }

        return union;
    }
}

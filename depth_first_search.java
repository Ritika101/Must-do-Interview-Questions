class Traversal
{
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
        if(vis[src]==true)//base case if already visited return
          return;
          System.out.print(src+" ");//else print the current node
          vis[src]=true;//set the boolean value to true
        Iterator <Integer>itr= list.get(src).listIterator();//iterate over all the nodes connected to "src"
        while(itr.hasNext()==true)
        {
            int i=itr.next();
            dfs(i,list,vis);
        }
       
    }
}

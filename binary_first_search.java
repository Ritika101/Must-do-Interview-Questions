class Traversal {
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[]
             ) {
        // add your code here
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(s);
        while(q.isEmpty()!=true)
        {
            s=q.peek();
            Iterator <Integer> itr=list.get(s).listIterator();
            //System.out.println("q="+q);
            while(itr.hasNext()==true)
            {
                int n=itr.next();
                if(vis[n]==false && q.contains(n)==false)
                {
                //vis[n]=true;
                q.add(n);
                }
            }
            
            s=q.poll();
            vis[s]=true;
           // vis[s]=true;
            System.out.print(s+" ");
            
        }
        //System.out.print(list);
    }
}

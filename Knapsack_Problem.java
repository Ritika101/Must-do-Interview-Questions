import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    static int dp[][] = new int[1001][1001];
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            for(int i=0;i<=n;i++)
          {
            
            for(int j=0;j<=w;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
                else if(wt[i-1]<=j)
                {
                    dp[i][j] = Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                }
                else
                dp[i][j]=dp[i-1][j];
            }
          }
          System.out.println(dp[n][w]);
        }
    }
}

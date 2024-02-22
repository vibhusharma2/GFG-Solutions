//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
     public int TotalWays(int N)
    {
        // Code here
        
        long res[] = new long[N + 1];
        
        res[0] = 1;
        res[1] = 1;
        
        for(int i = 2;i < N + 1; i++) {
            res[i] = (res[i - 1] + res[i - 2]) % 1000000007;
        }
        
        long ans = res[N] + res[N - 1];
        
        return (int)((ans * ans) % 1000000007);
        
    }
}
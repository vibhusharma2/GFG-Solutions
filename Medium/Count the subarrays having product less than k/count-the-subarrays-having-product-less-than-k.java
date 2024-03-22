//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            out.println(obj.countSubArrayProductLessThanK(a, n, k));
        }
        out.close();
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
   public long countSubArrayProductLessThanK(long a[], int n, long k)
    {
        // code here 
        int l=0,r=0;
        long ans=0;
        long pro=a[0];
        while(r<n){
            if(pro<k){
                ans+=(r-l+1);
                r++;
                if(r<n)
                {
                    pro*=a[r];
                    
                }
            }
            else{
                pro/=a[l];
                if(l==r){
                    ++r;
                    if (r<n)
                {
                    pro*=a[r];
                    
                }
                }
                ++l;
                
            
            }
        }
        return ans;
    }
}
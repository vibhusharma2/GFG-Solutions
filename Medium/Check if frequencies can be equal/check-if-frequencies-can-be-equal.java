//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   boolean sameFreq(String s) {
    // code here

    int[] arr = new int[26];

    for (int i = 0; i < s.length(); i++) 
       arr[s.charAt(i) - 'a']++;
       
    int min = s.length(), max = 0;

    for (int i: arr) {
        
      if (i != 0) {
        min = Math.min(min, i);
        max = Math.max(max, i);
      }
    }

    int count = 0;
    
    for (int i: arr)
      if (i == max) count++;

    if (max != min && min != 1)
      if (count > 1) 
        return false;

    return (max - min) <= 1 ? true : false;
    
  }
}
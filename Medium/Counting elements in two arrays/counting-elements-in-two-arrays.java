//{ Driver Code Starts
import java.util.*;

class Count
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


// Complete the function given below
class Solution
{
    public static int fn(int ele, int[] arr2) {
        
        int low = 0, high = arr2.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr2[mid] <= ele)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return low;
    }
    
    public static ArrayList < Integer > countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {

        Arrays.sort(arr2);
        ArrayList < Integer > ans = new ArrayList < > ();
        
        for (int i = 0; i < arr1.length; i++)
            ans.add(fn(arr1[i], arr2));

        return ans;
    }
}
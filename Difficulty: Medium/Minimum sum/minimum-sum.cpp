//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++
class Solution {
  public:
    string minSum(vector<int> &arr) {
        // code here
        // approach arhega ki
        // pahle sort karo
        //  odd wale ko alag 
        //  even wale ko alg num 1 and num2 me add kro as a string not int
        //  un num1 and num 2 me temp point kro last elemnt se aur i-- j-- krte raho untill i>-1 or j>-1 or existing of carry
        // tab num me num1 and num 2 ko string me badal ke add kr denege
        // then carry ko bhi dhyan me rakh ke add kr deneg
        // then lastly we will reverse the all ans 
        
        
        
        int n = arr.size();
        string  num1 = "" , num2= "";
        sort(arr.begin(), arr.end());
        for(int i =0; i<n; i++){
            if(i%2==0) {
                num1 += '0' +arr[i];    
            }
            else{
                num2+= '0'+arr[i];
            }
            // num 1 and num 2 me number aa gaya all even odd position wale element
        }
        
        int sizeNum1 = num1.size();
        int sizeNum2 = num2.size();
        int i = sizeNum1-1;
        int j = sizeNum2-1;
        int carry = 0;
        string ans ="";
        
         while(i>-1 || j>-1 || carry){
         int temp1= i>-1? num1[i]-'0': 0;
         int temp2 = j>-1? num2[j]-'0': 0;
         int num = temp1+ temp2 + carry;
            ans+= '0'+num%10;
            carry = num/10;
            i--;
            j--;
        }
        reverse(ans.begin(), ans.end());
        // baki ans aane ke baad kuch kuch dummy character aayenge use break krne ke liye
        for( i =0; i<ans.length(); i++){
            if(ans[i]!='0') break;
        }
        return ans.substr(i);
        
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> a;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            a.push_back(number);
        }

        Solution ob;
        string ans = ob.minSum(a);
        cout << ans << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends
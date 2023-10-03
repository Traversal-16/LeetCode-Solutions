//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution {
  public:
     int romanToDecimal(string &str) {
       
        int n= str.size();
        vector<int> v;
        for(int i=0;i<n;i++)
        {
            if(str[i]=='I') v.push_back(1);
            if(str[i]=='V') v.push_back(5);
            if(str[i]=='X') v.push_back(10);
            if(str[i]=='L') v.push_back(50);
            if(str[i]=='C') v.push_back(100);
            if(str[i]=='D') v.push_back(500);
            if(str[i]=='M') v.push_back(1000);
        }
        
        int ans=v[0];
      
        for(int i=1;i<v.size();i++)
        {
            if(v[i]<=v[i-1]) ans+=v[i];
            else {
                ans+=(v[i]-(2*v[i-1]));
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        Solution ob;
        cout << ob.romanToDecimal(s) << endl;
    }
}
// } Driver Code Ends
//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
class Solution{
public:
    int maxIndexDiff(int arr[], int n) {
        // code here
        vector<int>suf(n,0);
        vector<int>pre(n,0);
        int mini=INT_MAX;
        for(int i=0;i<n;i++)
        {
            mini=min(mini,arr[i]);
            pre[i]=mini;
        }
        int maxi=INT_MIN;
        for(int i=n-1;i>=0;i--)
        {
            maxi=max(maxi,arr[i]);
            suf[i]=maxi;
        }
        int low=0;
        int high=0;
        int ans=0;
        while(low<n && high<n)
        {
            if(pre[low]<=suf[high])
            {
                ans=max(ans,high-low);
                high++;
            }
            else
            low++;
        }
        return ans;
    }

};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        int a[n];
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        auto ans = ob.maxIndexDiff(a, n);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends
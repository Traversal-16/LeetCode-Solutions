//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
	public:
		void solve(string s, set<string> & ans,int index)

 {

     if (index>=s.size()){

         ans.insert(s);

         return;

     }

     

     for (int j=index;j<s.size();j++){

         swap (s[index],s[j]);

         solve(s,ans,index+1);

         // backtracking

         swap(s[index],s[j]);

     }

 }

  vector<string>find_permutation(string s)

  {

      set<string> ans;

      int index=0;

      solve(s,ans,index);

      vector<string > result;

      for (auto it :ans){

          result.push_back(it);

      }

      return result;

  }
};



//{ Driver Code Starts.
int main(){
    int t;
    cin >> t;
    while(t--)
    {
	    string S;
	    cin >> S;
	    Solution ob;
	    vector<string> ans = ob.find_permutation(S);
	    sort(ans.begin(),ans.end());
	    for(auto i: ans)
	    {
	    	cout<<i<<" ";
	    }
	    cout<<"\n";
    }
	return 0;
}

// } Driver Code Ends
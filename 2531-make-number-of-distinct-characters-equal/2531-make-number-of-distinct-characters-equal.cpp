class Solution {
public:
    bool isItPossible(string word1, string word2) 
    {
        map<char,int> map1,map2;
        int m=word1.size();
        int n=word2.size();
        for (int i=0;i<m;i++)
        {
            map1[word1[i]]++;
        }
        for (int j=0;j<n;j++)
        {
            map2[word2[j]]++;
        }
        for (auto it1:map1)
        {
            for (auto it2:map2)
            {
                map<char,int> a=map1,b=map2;
                a[it2.first]++;
                b[it1.first]++;
                a[it1.first]--;
                b[it2.first]--;
                
                  if(a[it1.first]==0){
                    a.erase(it1.first);
                }
                if(b[it2.first]==0){
                    b.erase(it2.first);
                }
                if(a.size()==b.size()){
                    return true;
                }
            }

        }
        return false;
    }
};
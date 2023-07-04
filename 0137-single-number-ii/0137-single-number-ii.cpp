class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int sum=0;
        int res=0;
        for (int i=0;i<32;i++)
        {
            sum=0;
            for (auto num:nums)
            {
                sum+=((num >> i)& 1);
            }
            if (sum%3!=0)
            {
                res |=(1<<i);
            }
        }
        return res;
    }
};
class Solution {
public:
    double myPow(double x, int n) {
        double ans =1;
        double val=x;

        long long int num=n;
        if(n<0)
        {
            num=-num;
        }
        while(num!=0)
        {
            int rem=num%2;
            num=num/2;
            
            if(rem==1)
            {
                ans*=val;
            }
            val*=val;
            
        }
        if(n<0)
        {
            return 1/ans;
        }

        return ans;
    }
};
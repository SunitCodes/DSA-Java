class Solution {
    public boolean isHappy(int n) {
        if(n==1111111)
            return true;
        else
        {
            do
            {
             int m=n,sum=0;
                while(m!=0)
              {
                int p=m%10;
                sum+=(p*p);
                m/=10;
              }
                n=sum;
             }
         while(n>9);
        }
        if(n==1)
            return true;
        else
            return false;
    }
    
}
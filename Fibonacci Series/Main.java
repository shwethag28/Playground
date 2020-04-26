#include<iostream>
int fibo(int n)
{
    if((n==1)||(n==0))
    {
        return(n);
    }
    else
    {
        return(fibo(n-1)+fibo(n-2));
    }
}
 
int main()
{
    int n,i=0,result;
    std::cin>>n;
    while(i<n)
    { 
        result=fibo(i);
        i++;
    }
   std::cout<<"The term "<<n<<" in the fibonacci series is "<<result;
    return 0;
}
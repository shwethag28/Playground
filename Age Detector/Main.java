#include<iostream>
using namespace std;
int main()
{
  int b_year,c_year,age;
  std::cin>>b_year>>c_year;
  if(b_year>c_year)
    age=(100-b_year)+c_year;
  else
    age=c_year-b_year;
  std::cout<<age;
}
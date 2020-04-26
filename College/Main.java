#include<iostream>
using namespace std;
struct College {
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
};
int main()
{
  int n,i;
  std::cout<<"Enter the number of colleges";
  std::cin>>n;
  College col[n];
  for(i=0;i<n;i++)
  {
    std::cout<<"\nEnter the details of college "<<i+1
             <<"\nEnter name";
    std::cin>>col[i].name;
    std::cout<<"\nEnter city";
    std::cin>>col[i].city;
    std::cout<<"\nEnter year of establishment";
    std::cin>>col[i].establishmentYear;
    std::cout<<"\nEnter pass percentage";
    std::cin>>col[i].passPercentage;
  }
  std::cout<<"\nDetails of colleges";
  for(i=0;i<n;i++)
  {
    std::cout<<"\nCollege:"<<i+1
             <<"\nName:"<<col[i].name
             <<"\nCity:"<<col[i].city
             <<"\nYear of establishment:"<<col[i].establishmentYear
             <<"\nPass percentage:"<<col[i].passPercentage;
  }
}
#include<iostream>
using namespace std;
struct employee{
  char name[30];
  int id;
  int age;
  char designation[20];
  int salary;
};
int main()
{
  employee emp;
  std::cout<<"Enter name:";
  std::cin>>emp.name;
  std::cout<<"\nEnter ID:";
  std::cin>>emp.id;
  std::cout<<"\nEnter age:";
  std::cin>>emp.age;
  std::cout<<"\nEnter designation:";
  std::cin>>emp.designation;
  std::cout<<"\nEnter Salary:";
  std::cin>>emp.salary;
  
  std::cout<<"\nEmployee Details"
           <<"\nName of the Employee : "<<emp.name
           <<"\nID of the Employee : "<<emp.id
           <<"\nAge of the Employee : "<<emp.age
           <<"\nDesignation of the Employee : "<<emp.designation
           <<"\nSalary of the Employee : "<<emp.salary;
}
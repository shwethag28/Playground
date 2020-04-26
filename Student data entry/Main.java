#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   student std1;
  std::cin.getline(std1.name,50);
  std::cin>>std1.roll>>std1.marks;
  std::cout<<"\nStudent Details"
           <<"\nName: "<<std1.name
           <<"\nRoll: "<<std1.roll
           <<"\nMarks: "<<std1.marks;
}
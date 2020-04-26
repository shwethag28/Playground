#include <iostream>
#include<string.h>
int main()
{
char str[100], rev[100];     
int count = 0, end=0, i;
 std::cin.getline(str,100);
 while(str[count]!='\0')
 { end++;
  count++;
 }
for(i=0;i<end;i++)
{
  rev[end-i]=str[i];
}
  for(i=1;i<=end;i++)
   std::cout<<rev[i];
}
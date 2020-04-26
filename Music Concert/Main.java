#include<iostream>
int main(){
  int *a;
  int n,female=0,male=0;
  std::cin>>n;
  a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++){
    std::cin>>*(a+i);
  if(*(a+i)%2==0)
    female+=1;
  else
    male+=1;}
  std::cout<<male<<"\n"<<female;
  return 0;
}
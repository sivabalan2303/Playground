#include<stdio.h>
int main()
{
 int n,nt;
  scanf("%d",&n);
  if(n%2==0)
  {nt=1*pow(3,(n/2)-1);
  }
  else
  {nt=1*pow(2,((n+1)/2)-1);}
  printf("%d",nt);
  
  return 0;
}
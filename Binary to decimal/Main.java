#include<stdio.h>
int main()
{
  int a,b,c=0,i=0;
  scanf("%d",&a);
  while(a!=0)
  {b=a%10;
   c=c+(b*pow(2,i));
   a=a/10;
   i++;
  }
  printf("%d",c);
  
  return 0;
}
#include<stdio.h>
int main()
{
  int a,i=0,b[10],c;
 scanf("%d",&a);
  while(a!=1)
  {c=a%2;
   b[i]=c;
   a=a/2;
   i++;
  }
  b[i]=1;
  for (int j=i;j>=0;j--)
  {printf("%d",b[j]);
  }
   
  return 0;
}
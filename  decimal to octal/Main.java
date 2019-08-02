#include<stdio.h>
int main()
{
  int a,b[10],i=0;
  scanf("%d",&a);
  if(a<8)
  {printf("%d",a);}
  else
  {
    while(a!=0)
  {b[i]=a%8;
   a=a/8;
   i++;
  }
  }
  for(int j=i-1;j>=0;j--)
  {printf("%d",b[j]);
  }
   
  return 0;
}
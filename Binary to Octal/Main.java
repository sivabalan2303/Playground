#include<stdio.h>

int main()
{
  long int a,b,c=0,i=0,d,x,o[10],j=0;
  scanf("%ld",&a);
  while(a!=0)
  { b=a%10;
    c=c+(b*pow(2,i));
    i++;
    a=a/10;}
  while(c!=0)
  { o[j++]=c%8;
   c=c/8;
  }
  for(x=j-1;x>=00;x--)
  {printf("%ld",o[x]);
  }
  
}

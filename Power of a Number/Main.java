#include <stdio.h>
#include <math.h>
int main()
{
  int b,p,c,a=1;
  scanf("%d\n%d",&b,&p);
  if(p<0)
  {printf("Wrong input");
  }
  else
  {
  for(int i=1;i<=p;i++)
  {a=a*b;
  }
  printf("%d",a);
  }
  return 0;
}
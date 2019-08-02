#include<stdio.h>

int main()
{
  int a,b,c,d,x,y,s;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  x=a<b?a:b;
  y=c<d?c:d;
  s=x<y?x:y;
  printf("%d",s);
}
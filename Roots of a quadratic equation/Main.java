#include<stdio.h>
int main()
{
int a,b,c,d;
  float e,r1,r2,f,i,r;
  scanf("%d\n%d\n%d",&a,&b,&c);
  d=(b*b)-4*a*c;
  if (d>0)
  {
    f=(float)sqrt(d);
    r1=(float)((-b+f)/2*a);
  r2=(float)((-b-f)/2*a);
  printf("root1 = %.2f  root2 = %.2f",r1,r2);
}
  else if(d<0)
  {r=(float)-b/(2*a);
   i=(float)sqrt(-d)/(2*a);
     printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",r,i,r,i);
    
  }
  else
  {printf("root1 = %.2f  root2 = %.2f",(float)-b/(2*a),(float)-b/(2*a));
  }}
#include<stdio.h>
int main()
{
  float a,b,c;
  scanf("%f\n%f",&a,&b);
  c=sqrt(pow(a,2)+pow(b,2));
  printf("%.2f",c);
  return 0;
}
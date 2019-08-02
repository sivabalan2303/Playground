#include <stdio.h>
int main()
{
int num;
scanf("%d",&num);
int i,count = 0;
for(i = 1;i <= num; i++)
{
   if(num % i == 0)
{
++count;
printf("%d\n",i);

   }}
return 0;
}
  

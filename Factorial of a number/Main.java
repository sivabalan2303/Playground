#include <stdio.h>
int factorial_of_a_number(int n)
{
if(n == 0)
return 1;
if(n < 0)
printf("Invalid input\n");
int fact = 1, i;
for(i = 1; i <= n; i++)
{
fact = fact * i;
}
return fact;
}
int main()
{
int n;
scanf("%d",&n);
printf("%d",factorial_of_a_number(n));
return 0;
}

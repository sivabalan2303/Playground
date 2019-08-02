#include<stdio.h>
#include<math.h>
int main()

{
int number, temp, remainder, result = 0, n = 0 ;
scanf("%d", &number);
temp = number;
// Finding the number of digits
while (temp != 0)
{
temp /= 10;
++n;
}
temp = number;
// Checking if the number is armstrong
while (temp != 0)
{
remainder = temp%10;
result += pow(remainder, n);
temp /= 10;
}
if(result == number)
printf("Armstrong Number\n");
else
printf("Not an Armstrong Number\n");

	return 0;
}
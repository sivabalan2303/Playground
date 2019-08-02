#include<stdio.h>
int main()
{
	char a[100];
  int i=0,count=1,b;
  scanf("%s",a);
  b=strlen(a);
  if (b>20)
  {printf("Invalid Input");
  }
  else
  {while(a[i]!='\0')
  { while(a[i]==a[i+1])
   {count++;
   i++;}
   printf("%c%d",a[i],count);
   count=1;
   i++;
  }}
 
  
}
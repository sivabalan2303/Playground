#include<stdio.h>

int main()
{
  char st[100];
  int i,a=0;
  scanf("%[^\n]s",st);
   for(i=0;st[i]!='\0';i++)
   {if(st[i]==' ')
   {a++;
   }
   }
  a++;
  printf("%d",a);
  
}
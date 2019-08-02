#include<stdio.h>
int main()
{
  char s[50];
  int a;
  scanf("%[^\n]s",s);
  a=strlen(s);
  printf("%d",a);
  return 0;
}
#include<stdio.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
   for(int i=0;!str[i]=='\0';i++)
  {if(str[i]=='A'||str[i]=='a'||str[i]=='O'||str[i]=='o'||str[i]=='I'||str[i]=='i'||str[i]=='E'||str[i]=='e'||str[i]=='U'||str[i]=='u')
  {
  }
   else 
   {printf("%c",str[i]);}}
  
  
  
 
  return 0;
}
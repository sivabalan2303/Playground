#include<stdio.h>
int main()
{
 char a[10],b[10],c[10];
  scanf("%s\n%s\n%s",a,b,c);
  for(int i=0;a[i]!=0;i++)
  {if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')
  {printf("$");
  }
   else
   {printf("%c",a[i]);
   }}
  for(int i=0;b[i]!=0;i++)
    {if(!(b[i]=='a'||b[i]=='A'||b[i]=='e'||b[i]=='E'||b[i]=='i'||b[i]=='I'||b[i]=='o'||b[i]=='O'||b[i]=='u'||b[i]=='U'))
  {printf("#");
  }
   else
   {printf("%c",b[i]);
   }}
 for(int i=0;c[i]!=0;i++)
 {if (c[i]<=90&&c[i]>=65)
 {printf("%c",c[i]);}
 else
 {printf("%c",c[i]-32);}}}
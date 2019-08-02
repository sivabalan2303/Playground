#include<stdio.h>
int main()
{
  int a[20],n,b,c,d=-1,e=-1;
  scanf("%d\n",&n);
  for(int i=0;i<n;i++)
  {scanf("%d",&a[i]);
  }
  scanf("%d%d",&b,&c);
  for(int i=0;i<n;i++)
  {if (a[i]==b&&d==-1)
  { d=i;
   printf("Element 1 index = %d\n",d);
  
  }}
   if(d==-1)
  {printf("Element 1 index = -1\n");
  }
   for(int i=0;i<n;i++)
  {if (a[i]==c&&e==-1)
  { e=i;
   printf("Element 2 index = %d",e);
   break;
  }}
  if (e==-1)
  {printf("Element 2 index = -1");
  }
  
  
}
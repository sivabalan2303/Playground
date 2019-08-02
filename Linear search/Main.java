#include<stdio.h>
int main()
{
  int a[20],n,e,d=0;
  scanf("%d\n",&n);
  for (int i=0;i<n;i++)
  {scanf("%d",&a[i]);
  }
  scanf("\n%d",&e);
   for (int i=0;i<n;i++)
   { if(e==a[i]&&d==0)
    {printf("%d",i+1);
     d=1;}
   }
  if(d==0)
  {printf("%d isn't present in the array.",e);
  }
    
  return 0;
}
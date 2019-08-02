#include <stdio.h>
int main()
{ int a,n,factor,sum=0;
 scanf("%d",&n);
 for (int y=2;y<=n;y+=1)
 {
     factor=0;
  for (int x=1;x<=y;x+=1)
  {  a=y%x;
  
    if(a==0)
    {factor=factor+1;
    }
    
  }
   if(factor==2)
 {sum=sum+y;
  }
 }
  printf("%d",sum);
 
 
   return 0;
}
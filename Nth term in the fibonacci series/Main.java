#include<stdio.h>
int main ()
{
  int a[50],n ;
  a[0]=1;
  a[1]=2;
 scanf("%d",&n);
    if(n==1)
    {printf("%d",a[n-1]); }
    else if(n==2)
    {printf("%d",a[n-1]); }
    
else 
{
  for(int x=2;x<n;x+=1)
  { a[x]=a[x-1]+a[x-2];
  }
      
  printf("%d",a[n-1]);
    }
  
    
  return 0;
}

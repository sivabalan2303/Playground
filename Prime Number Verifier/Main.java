// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{ int a,n,x,factor;
 scanf("%d",&n);
 if(n!=0)
 {
  for (int x=1;x<=n;x+=1)
  { a=n%x;
     if(a==0)
    {factor=factor+1;
    }
  }
   if(factor==2)
 {printf("prime");
 }
 else
 printf("composite");
 }
 else
   printf("neither");
   return 0;
}
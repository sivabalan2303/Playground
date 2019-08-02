// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
int a,b,i;
  scanf("%d\n%d",&a,&b);
  if(a>b)
  { for(i=b;i>=1;i--)
   {if(a%i==0&&b%i==0)
   {printf("%d",i);
    break;
   }}
  }
  else
  { for(i=a;i>=1;i--)
    {if(a%i==0&&b%i==0)
      {printf("%d",i);
       break;
      }
    }
  }
  
   return 0;
}
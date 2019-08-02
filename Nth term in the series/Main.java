#include <stdio.h>
int main() {
int n,a=1;
  scanf("%d",&n);
  if(n%2==0)
  { for(int x=1;x<n/2;x+=1)
    {a=a*3;
    }
   printf("%d",a);//Type your code here
  }
  else
  { for(int y=1;y<(n+1)/2;y+=1)
    {a=a*2;
    }
   printf("%d",a);//Type your code here
  }
    
  return 0;
}
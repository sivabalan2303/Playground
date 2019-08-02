#include<stdio.h>
int main()
{ long int n,fac=1;
  scanf("%ld",&n);
 if(n!=0)
 {
  for(int i=1;i<=n;i+=1)
  {fac=i*fac;
  }
 }
 printf("%ld",fac);
 return 0;
	
}
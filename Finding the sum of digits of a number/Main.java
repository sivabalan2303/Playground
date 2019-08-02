#include <stdio.h>
int main() {
  int a,b,c;
  c=0;
  scanf("%d",&a);
	while(a>1)
    {
      b=a%10;
      c=c+b;
      a=a/10;
    }
  printf("%d",c);//Type your code
	return 0;
}
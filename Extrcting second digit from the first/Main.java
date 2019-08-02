#include <stdio.h>
int main() {
	int a,b,c;
  scanf("%d",&a);
      b=a;
      while(b>99)
  {
     b=b/10;   
}
  c=b%10;
  printf("%d",c);
  return 0;
}
#include <stdio.h>
int main() {
  int a,b,c,d;
  scanf("%d",&a);
      b=a;
  d=a%10;
      while(b>99)
  {
     b=b/10;
       
}
  c=b/10;

  printf("%d",c+d);
	//Type your code
	return 0;
}
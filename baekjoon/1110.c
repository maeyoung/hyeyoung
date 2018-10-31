#include <stdio.h>

int main()
{
  int N,result,a,b,c;
  int num = 0;
  scanf("%d", &N);
  result = N;
  while (N >= 0 && N <= 99) {
    a = N/10;
    b = N%10;
    c = (a+b)%10;
    N = (10*b)+c;
    num += 1;
    if (N == result) {
      printf("%d\n",num);
      break;
    }
  }
  return 0;
}

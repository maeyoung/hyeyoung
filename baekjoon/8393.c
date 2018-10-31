#include <stdio.h>

int main()
{
  int N,sum,i;
  sum = 0;
  scanf("%d", &N);
  for (i=1;i<=N;i++) {
    sum += i;
  }
  printf("%d\n", sum);

  return 0;
}

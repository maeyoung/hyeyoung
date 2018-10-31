#include <stdio.h>

int main()
{
  int N,a,b,i;
  int sum[1000000] = {0, };

  scanf("%d", &N);
  for (i=0; i<N; i++) {
    scanf("%d %d", &a, &b);
    sum[i] = a+b;
  }
  for (i=0; i<N; i++) {
    printf("%d\n", sum[i]);
  }
  return 0;
}

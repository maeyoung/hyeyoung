#include <stdio.h>

int main()
{
  int N,i,sum;
  char input[100] = {0, };
  sum = 0;
  
  scanf("%d", &N);
  scanf("%s", input);

  for (i=0; i<N; i++) {
    sum += (input[i] - '0');
  }

  printf("%d\n", sum);

  return 0;
}

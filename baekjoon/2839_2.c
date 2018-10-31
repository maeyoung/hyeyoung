#include <stdio.h>

int main()
{
  int i,N;
  scanf("%d", &N);
  for(i=N/5; i>=0; i--) {
    if ((N-(i*5))%3==0) {
      return printf("%d\n", i+(N-(i*5))/3);
    }
  }
  return printf("-1\n");
}

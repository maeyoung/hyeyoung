#include <stdio.h>

int main()
{
  int n,x,i;
  int num[10000] = {0, };

  scanf("%d %d", &n, &x);

  for (i=0; i<n; i++) {
    scanf("%d", &num[i]);
  }

  for (i=0; i<n; i++) {
    if (num[i] < x) {
      printf("%d ", num[i]);
    }
  }
  printf("\n");
  return 0;
}

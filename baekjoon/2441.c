#include <stdio.h>

int main()
{
  int N,i,j,k;
  scanf("%d", &N);
  for (i=N; i>0; i--) {
    for (k=0; k<N-i; k++) {
      printf(" ");
    }
    for (j=i; j>0; j--) {
      printf("*");
    }
    printf("\n");
  }

  return 0;
}

#include <stdio.h>

int main()
{
  int N,i,j,k;
  scanf("%d", &N);
  for (i=0; i<N; i++) {
    for(j=N-i; j>1; j--) {
      printf(" ");
    }
    for(k=0; k<=i; k++) {
      printf("*");
    }
    printf("\n");
  }

  return 0;
}

#include <stdio.h>

int main()
{
  int N, i, j, a, s;
  s = 3000;
  scanf("%d", &N);
  for (i=0; i<1000;i++){
    for (j=0; j<1666; j++){
      if (N == (5*i)+(3*j)) {
        a = i+j;
        if (s > a) { s = a; }
      }
    }
  }
  if (s == 3000) { s = -1; }
  
  printf("%d\n", s);

  return 0;
}

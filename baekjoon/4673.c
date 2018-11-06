#include <stdio.h>

int num[10001] = {0, };

int noself(int n)
{
  int sum = n;

  while (1) {
    if(n == 0) break;
    sum += n%10;
    n = n/10;
  }
  return sum;
}

int main()
{
  for(int i=1; i<10001; i++) {
    int index = noself(i);
    if (index < 10001) {
      num[index] = 1;
    }
  }

  for(int i=1; i<10001; i++) {
    if(num[i]!=1)
      printf("%d\n", i);
  }

  return 0;
}

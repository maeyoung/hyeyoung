#include <stdio.h>

int main()
{
  int N,i;
  double mean = 0;
  double score[1001] = {0, }; // double score[N-1];은 됨 왜죠?
  int max = 0;
  scanf("%d", &N);

  for (i=0; i<N; i++) {
    scanf("%lf",&score[i]);
    if (max < score[i])
      max = score[i];
  }

  for (i=0; i<N; i++) {
      mean += score[i]/max*100;
  }
  mean = mean/N;
  printf("%0.2lf\n", mean);

  return 0;
}

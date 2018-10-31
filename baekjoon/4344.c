#include <stdio.h>

int main()
{
  int C,N;
  double mean;
  scanf("%d", &C);
  double ratio[C-1];

  for (int i=0; i<C; i++) {
    scanf("%d", &N);
    int score[1001] = {0, };
    int sum = 0;
    for (int j=0; j<N; j++) {
      scanf("%d", &score[j]);
      sum += score[j];
    }
    mean = sum/N;

    double num = 0;
    for (int j=0; j<N; j++) {
      if (score[j] > mean)
        num += 1;
    }

    ratio[i] = num/N*100;
    printf("%.3lf%%\n", ratio[i]);

  }

/*  for (int j=0; j<C; j++) {
    printf("%lf\n", ratio[j]);
    printf("%.3lf\n", ratio[j]);
  }

*/
  return 0;

}

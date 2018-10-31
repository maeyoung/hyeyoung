#include <stdio.h>
#include <string.h>

int main()
{
  int x,y,i,sum,result;
  char day[][7] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

  scanf("%d %d", &x, &y);

  sum = y;
  for (i = 1; i < x; i++) {
    if (i == 2) {
      sum += 28;
    }
    else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
      sum += 31;
    }
    else {
      sum += 30;
    }
  }

  result = sum%7;

  printf("%s\n", day[result]);


  return 0;

}

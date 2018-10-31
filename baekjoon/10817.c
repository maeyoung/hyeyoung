#include <stdio.h>

int main()
{
  int a,b,c,i,j,temp;
  scanf("%d %d %d",&a,&b,&c);
  int num[3] = {a,b,c};

  for(i=0;i<3;i++) {
    for(j=0;j<2;j++) {
      if (num[j] >= num[j+1]) {
        temp = num[j];
        num[j] = num[j+1];
        num[j+1] = temp;
      }
    }
  }

  printf("%d\n", num[1]);
  return 0 ;
}

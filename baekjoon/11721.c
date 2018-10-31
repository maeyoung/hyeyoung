#include <stdio.h>
#include <string.h>

int main()
{
  char input[100];
  int i,j;

  scanf("%s", input);
  int length = strlen(input);

  for (i=0; i<length; i++) {
    printf("%c", input[i]);
    if ((i+1)%10 == 0) {
      printf("\n");
    }
  }

  return 0;
}

#include <stdio.h>

int main()
{
  char words[1000003] = {0};
  int num = 1;

  fgets(words, sizeof(words), stdin); //stdin:use keyboard

  
  for (int i=1; words[i] != '\n'; i++) {
    if (words[i] == ' ' && words[i+1] != '\n') num++;
  }
  
  if (words[0] == ' ' && words[1] == '\n') {
    num = 0;
  }

  printf("%d\n", num);
  return 0;
}

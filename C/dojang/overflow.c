#include <stdio.h>

int main()
{
	char num1 = -129;  // underflow num1 = 127(최댓값)
	unsigned char num2 = 256;  // overflow num2 = 0(최솟값)

	printf("%d %u\n", num1, num2);

	return 0;
}
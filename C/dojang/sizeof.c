#include <stdio.h>

int main() 
{
	int num1 = 0;
	int size;

	size = sizeof num1; // sizeof : 자료형의 크기를 byte단위로 구함
	printf("num1의 크기: %d\n", size); // 4

	size = sizeof(num1);
	printf("num1의 크기: %d\n", size); // 4

	size = sizeof(char);
	printf("char의 크기: %d\n", size); // 1

	printf("short: %d, int: %d, long: %ld, long long: %lu\n",
		sizeof(short),
		sizeof(int),
		sizeof(long),
		sizeof(long long)
		);

	return 0;
}
#include <stdio.h>
#include <limits.h> // 자료형의 최댓값과 최솟값이 정의된 헤더 파일

int main()
{
	char num1 = CHAR_MIN;
	short num2 = SHRT_MIN;
	int num3 = INT_MIN - 1; // underflow
	long num4 = LONG_MIN;
	long long num5 = LLONG_MAX + 1; // overflow

	printf("%d %d %d %ld %lld\n", num1, num2, num3, num4, num5);

	unsigned char num6 = UCHAR_MAX + 1; // overflow
	unsigned long long num7 = ULLONG_MAX + 1; // overflow

	printf("%d %lld\n", num6, num7);

	return 0;

}
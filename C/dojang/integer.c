#include <stdio.h>

//integer
/*int main()
{
	char num1 = -10;
	short num2 = 30000;
	int num3 = -1234567890;
	long num4 = 1234567890;
	long long num5 = -1234567890123456789;

	printf("%d %d %d %ld %lld\n",num1,num2,num3,num4,num5);

	return 0;
}
*/

// unsigned_integer
/*int main()
{
	unsigned char num1 = 200;
	unsigned short num2 = 60000;
	unsigned int num3 = 4123456789;
	unsigned long num4 = 4123456789;
	unsigned long long num5 = 12345678901234567890ULL;

	printf("%u %u %u %lu %llu\n", num1,num2,num3,num4,num5);
	return 0;
}
*/

// integer_overflow
/*int main()
{
	char num1 = 128; // overflow 발생 	
	unsigned char num2 = 256; // overflow 발생 	
	printf("%d %u\n",num1,num2); // 최솟값부터 다시 시작 
	return 0;
}
*/

// integer_sizeof
/*int main()
{
	int num1 = 0;
	int size;

	size = sizeof num1;

	printf("num1의 크기: %d\n", size);

	return 0;
}
*/

// integer_type_sizeof
/*
int main()
{
	printf("char: %u, short: %d, int: %d, long: %d, longlong: %d\n",
		sizeof(char),
		sizeof(short),
		sizeof(int),
		sizeof(long),
		sizeof(long long)
	);

	return 0;
}
*/

// integer_min
/*
#include <limits.h> // 자료형의 최댓값과 최솟값이 정의된 헤더 파일 
int main()
{
	char num1 = CHAR_MIN;
	short num2 = SHRT_MIN;
	int num3 = INT_MIN;
	long num4 = LONG_MIN;
	long long num5 = LLONG_MIN;

	printf("%d %d %d %ld %lld\n", num1,num2,num3,num4,num5);

	return 0;
}
*/

// integer_max_overflow
/*
#include <limits.h>
int main()
{
	char num1 = CHAR_MAX+1;
	short num2 = SHRT_MAX+1;
	int num3 = INT_MAX+1;
	long long num4 = LLONG_MAX+1;

	printf("%d %d %d %lld\n",num1,num2,num3,num4);

	unsigned char num5 = UCHAR_MAX+1;
	unsigned short num6 = USHRT_MAX+1;
	unsigned int num7 = UINT_MAX+1;
	unsigned long long num8 = ULLONG_MAX+1;

	printf("%u %u %u %llu\n",num5,num6,num7,num8);

	return 0;
}
*/

// interger_min_underflow
/*
#include <limits.h>
int main()
{
	char num1 = CHAR_MIN - 1;
	short num2 = SHRT_MIN - 1;
	int num3 = INT_MIN - 1;
	long long num4 = LLONG_MIN - 1;

	printf("%d %d %d %lld\n",num1,num2,num3,num4);

	unsigned char num5 = 0 - 1;
	unsigned short num6 = 0 - 1;
	unsigned int num7 = 0 - 1;
	unsigned long long num8 = 0 - 1;

	printf("%u %u %u %llu\n",num5,num6,num7,num8);

	return 0;
}
*/

// integer_stdint
/*
#include <stdint.h> // 크기별로 정수 자료형이 정의된 헤더 파일 
int main()
{
	int8_t num1 = -128;
	int16_t num2 = 32767;
	int32_t num3 = 2147483647;
	int64_t num4 = 9223372036854775807;

	printf("%d %d %d %lld\n",num1,num2,num3,num4);

	uint8_t num5 = 255;
	uint16_t num6 = 65535;
	uint32_t num7 = 4294967295;
	uint64_t num8 = 18446744073709551615;

	printf("%u %u %u %llu\n",num5,num6,num7,num8);

	return 0;
}
*/

















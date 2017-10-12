#include <stdio.h>

//real_number
/*
int main()
{
	float num1 = 0.1f;
	double num2 = 3867.215820;
	long double num3 = 9.327513l;

	printf("%f %f %Lf\n",num1,num2,num3);

	return 0;
}
*/

//real_number_exponential_notation
/*
int main()
{
	float num1 = 3.e5f;
	double num2 = -1.3827e-2;
	long double num3 = 5.21e+9l;

	printf("%f %f %Lf\n", num1, num2, num3);

	printf("%e %e %Le\n", num1, num2, num3);

	return 0;
}
*/

//real_number_sizeof
/*
int main()
{
	float num1 = 0.0f;
	double num2 = 0.0;
	long double num3 = 0.01;

	printf("float: %d, double: %d, long double: %d\n",
		sizeof(num1),
		sizeof(num2),
		sizeof(num3)
	);

	return 0;
}
*/

//real_number_min_max
/*
#include <float.h>

int main()
{
	float num1 = FLT_MIN;
	float num2 = FLT_MAX;
	double num3 = DBL_MIN;
	double num4 = DBL_MAX;
	long double num5 = LDBL_MIN;
	long double num6 = LDBL_MAX;

	printf("%.49f %.2f\n",num1,num2);
	printf("%e %e\n", num3,num4);
	printf("%Le %Le\n",num5,num6);

	return 0;
}
*/

//real_number_overflow_underflow
#include <float.h>

int main()
{
	float num1 = FLT_MIN;
	float num2 = FLT_MAX;

	num1 = num1 / 100000000.0f; // 0 또는 쓰레기 값 처리 

	num2 = num2 * 1000.0f; // 무한대(infinite)처리 

	printf("%e %e\n", num1,num2);

	return 0;
}






























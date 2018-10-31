#include <stdio.h>
void c01();
void c03();
void c05();
int main(){
	c05();
}	

void c01()
{
	int birth_year, age;
	printf("태어난 년도를 입력하세요.");
	scanf("%d", &birth_year);
	age = 2017- birth_year + 1;
	if (age < 7) {
		printf("유아입니다.");
	}
	else if (age >= 7 && age < 13) {
		printf("어린이입니다.");
	}
	else if (age >= 13 && age < 20) {
		printf("청소년입니다.");
	}
	else if (age >= 20 && age < 30) {
		printf("청년입니다.");
	}
		else if (age >= 30 && age < 60) {
		printf("중년입니다.");
	}
	else {
		printf("노년입니다.");
	}
}

	
void c03()
{
	int width,height;
	printf("직사각형의 가로크기를 입력하시오.");
	scanf("%d",&width);
	printf("직사각형의 세로크기를 입력하시오.");
	scanf("%d",&height);

	if (width == height) {
		printf("정사각형입니다.");
	}
	else if (width >= 2*height) {
		printf("좌우로 길쭉한 직사각형입니다.");
	}
	else if (height >= 2*width) {
		printf("위아래로 길쭉한 직사각형입니다.");
	}
	else if (width >= height) {
		printf("일반적인 가로형 직사각형입니다.");
	}
	else {
		printf("일반적인 세로형 직사각형입니다.");
	}
}


void c05()
{
	int month, day;
	int day_count;
	printf("월을 입력하시오.");
	scanf("%d", &month);
	printf("일을 입력하시오.");
	scanf("%d", &day);

	switch (month) {
		case 1: printf("이 날짜는 1년 중 %d 번째 날에 해당됩니다.", &day);
		break;
			
		default: printf("잘못입력하셨습니다.");


		
	}

}
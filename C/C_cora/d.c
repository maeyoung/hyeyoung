#include <stdio.h>
void d01();
void d02();
int main(){
	d02();
}


void d01(){
	int number, i;
	printf("숫자를 입력하세요.");
	scanf("%d", &number);
	int totalsum=0;

	for(i=0; i < number; i++){
		totalsum = totalsum + i+1;
	}
	printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다.\n",totalsum);
	printf("계속하려면 아무 키나 누르십시오...");
}

void d02(){
	int number;
	int max_num = 0;
	int min_num = 100;
	do {
		printf("0부터 100사이의 숫자를 입력하세요.");
		scanf("%d",&number);
		if (number < 0 || number > 100) {
			break;
		}
		if (number > max_num){
			max_num = number;
		}
		if (number < min_num) {
			min_num = number;
		}

	}while (number >= 0 && number <=100);

	printf("입력된 숫자들 중 가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.",max_num,min_num);

}
//  \t = tab




























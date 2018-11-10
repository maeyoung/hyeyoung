#include <stdio.h>

int main()
{
    int A,B,C;
    scanf("%d %d %d",&A,&B,&C);
    int num = A*B*C;

    char multi[11];
    sprintf(multi, "%1d", num); // %1d를 지정하여 정수를 문자열로 저장 

    for (int i=0; i<10; i++) {
        int count = 0;
        for(int j=0; j<11; j++) {
            if (multi[j] == i+48) {
               count++; 
            }
        }
        printf("%d\n", count);
    }

    return 0;
}
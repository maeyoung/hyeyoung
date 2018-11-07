#include <stdio.h>

int sequence()
{
    int N; // N <= 1000
    int num = 0;
    scanf("%d", &N);
    if (N > 99){
        for(int i=100; i<=N; i++) {
            if (i == 1000) break;
            else{
                int j = i/100;
                int k = (i%100)/10;
                int l = (i%100)%10;
                if ((j-k) == (k-l)) num++;
            }
        }
        num = 99+num; 
    }
    else num = N;
       
    return num;
}

int main()
{
    int num = sequence();
    printf("%d\n", num);
}

/*
100자리수 + 1000(한수아님)
*/
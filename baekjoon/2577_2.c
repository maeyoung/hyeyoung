#include <stdio.h>

int main(){
    int A, B, C;
    scanf("%d %d %d", &A, &B, &C);
    int mul = A*B*C;
    int ans[10] = {0, };

    while (mul > 0){
        ans[mul%10] ++;
        mul = mul/10;
    }

    for(int i=0;i<10;i++){
        printf("%d\n", ans[i]);
    }
    return 0;
}

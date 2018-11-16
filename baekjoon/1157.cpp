#include <iostream>
#include <string>
#include <cstdio>
using namespace std;

int main()
{
    char word[1000001];
    int alpha[26] = {0};

    scanf("%s",word);

    for(int i=0; word[i]!='\0'; i++) {
        for(int j=0; j<=25; j++) {
            if(word[i]==(char)j+65 or word[i]==(char)j+97) {
                alpha[j]++;
            }
        }
    }

    int max = alpha[0]; 
    int index = 0;
    int same = 0;
    for(int i=1; i<26; i++) {
        if (max < alpha[i] ){
            max = alpha[i]; // 많이 나온 알파벳의 횟수  
            index = i; // 그 횟수의 index 
        }  
    }

    for(int i=0; i<26; i++) {
        if (max==alpha[i]){
            if(index!=i) same++;
        }     
    }

    if (same>=1) cout << "?\n";
    else printf("%c\n", index+65);

    return 0; 
}

//  A=65, Z=90
//  a=97, z=122
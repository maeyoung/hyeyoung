#include <iostream>
#include <string>
using namespace std;

int main()
{
    string word;
    int alphabet[26];
    fill_n(alphabet, 26, -1); 
    // alphabet[26]을 전부 -1로 채워주는 함수 std::fill_n(함수이름, 배열크기, 채울숫자);
    cin >> word;
    for(int j=0; j<26; j++) {
        for (int i=0; i<word.length(); i++) {
            if(word[i] == j+97) {
                alphabet[j] = i;
                break;
            }    
        }
        cout << alphabet[j] << ' ';
    }
    cout << '\n';

    return 0;
}

// a = 97, z = 122
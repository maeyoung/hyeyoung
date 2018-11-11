#include <iostream>
#include <string>
using namespace std;

int main()
{
    int N;
    cin >> N;
    string test;

    for (int i=0; i<N; i++) {
        cin >> test;
        int total = 0;
        int score = 1;
        for (int j=0; j<81; j++) {

            if(test[j] == 'O') {
                total += score;
                score++;
            }

            else if(test[j] == 'X') {
                score = 1;
            }

            else {
                cout << total << '\n';
                break;
            }
        }
    }

    return 0;
}
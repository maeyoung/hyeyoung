#include <iostream>
using namespace std;

int main()
{
    int N, next;
    cin >> N;
    int up = 0;
    int down = 0;

    for(int i=2; i<=8; i++) {
        cin >> next;
        if (next > N) {
            up++;
        }
        else if (next < N) {
            down++;
        }
        N = next;
    }

    if (up == 7) cout << "ascending" << '\n';
    else if (down == 7) cout << "descending" << '\n';
    else cout << "mixed" << '\n';

    return 0;
}
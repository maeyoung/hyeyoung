#include <iostream>
#include <string>
using namespace std;

int main()
{
    int T, N;
    string test;
    cin >> T;
    
    for(int i=0; i<T; i++) {
        cin >> N >> test;
        for (int j=0; j<test.length(); j++) {
            for (int k=0; k<N; k++) {
                cout << test[j];
            }
        }
        cout << '\n';
    }

    return 0;
}
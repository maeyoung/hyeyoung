#include <iostream>
using namespace std;

int main()
{
    int num = 0;

    cout << "write number. \n";

    // 키보드 입력을 기다리는 상태 (standard input)
    cin >> num;  // >> : 키보드 입력을 지정한 변수로 보냄 

    cout << num << " is written.\n";

    return 0;
}
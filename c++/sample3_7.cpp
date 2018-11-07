#include <iostream>
using namespace std;

int main()
{
    const double pi = 3.1415; // const를 사용하여 pi 초기화 (초기화 작업이 반드시 필요함)
    // 변수 pi 값을 변경할 수 없게 된다. (constant)

    cout << "circle rate is " << pi << '\n';
    cout << "circle rate is not changed.\n";

    return 0;
}
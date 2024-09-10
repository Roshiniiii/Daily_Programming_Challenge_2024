#include <iostream>
using namespace std;
void sort012(int a[], int n)
{
    int c0 = 0, c1 = 0, c2 = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] == 0) {
            c0 += 1;
        }
        else if (a[i] == 1) {
            c1 += 1;
        }
        else {
            c2 += 1;
        }
    }

    int idx = 0;
    for (int i = 0; i < c0; i++)
        a[idx++] = 0;
    for (int i = 0; i < c1; i++)
        a[idx++] = 1;
    for (int i = 0; i < c2; i++)
        a[idx++] = 2;
}

int main()
{
    int a[] = {0,1,2,1,0,2,1,0};
    int n = sizeof(a) / sizeof(a[0]);
    sort012(a, n);
    for (int i = 0; i < n; i++)
        cout << a[i] << " ";
    return 0;
}

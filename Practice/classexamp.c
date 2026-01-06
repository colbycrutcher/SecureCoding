#include <stdio.h>

int main() {
    int x = 1, y = 2, arr[10] = {3, 4, 5, 6, 7};

    int *p = &x;      // p points to x
    p = &y;           // now p points to y
    *p = 200;         // sets y = 200
    p = arr;          // now p points to arr[0]

    int **q = &p;     // q points to p

    printf("x=%d y=%d arr[0]=%d\n", x, y, arr[0]);
    printf("*p=%d **q=%d\n", *p, **q);
    return 0;
}

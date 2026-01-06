#include <stdio.h>


int main(){
    int a = 5;
    double b = 2.0;

    printf("Address of a: %p\n", &a);
    printf("Value of a: %d\n", a);


    printf("Address of b: %p\n", &b);
    printf("Value of b: %f\n", b);

    return 0;
}
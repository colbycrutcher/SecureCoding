#include <stdio.h>


int main(){
    int a = 5;
    double b = 2.0;

    printf("Address of a: %p\n", &a);
    printf("Value of a: %d\n", a);
    printf("Amount of Memory for a: %ld bytes\n", sizeof(a));


    printf("Address of b: %p\n", &b);
    printf("Value of b: %f\n", b);
    printf("Amount of Memory for a: %ld bytes\n", sizeof(b));


    return 0;
}
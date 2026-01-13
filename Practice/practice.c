#include <stdio.h>
#include <stdlib.h>

int main(){

    int a, b, sum;

    int *pA = &a;

    printf("Enter 2 numbers \n");
    scanf("%d %d", &a, &b);

    sum = a + b;
    printf("Sum = %d\n", sum);
    printf("a = %d\n", *pA);
}



//Number Conversions binary / hex
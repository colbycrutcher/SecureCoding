#include <stdio.h>

void swap(double a, double b){
    double temp;
    temp = a;
    a = b;
    b = temp;
    printf("After swap: a = %f, b = %f\n", a, b);
}



int main(){
    
    double x = 3.5;
    double y = 7.1;

    printf("Before swap: x = %f, y = %f\n", x, y);

    swap(x, y);

    return 0;
}
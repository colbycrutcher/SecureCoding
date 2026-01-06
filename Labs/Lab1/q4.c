#include <stdio.h>

void swap(double a, double b){
    double temp;
    temp = a;
    a = b;
    b = temp;
    printf("a = %f, b = %f\n", a, b);
}



int main(){
    
    swap(3.5, 7.2);
    return 0;
}
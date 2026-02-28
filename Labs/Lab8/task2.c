#include <limits.h>
#include <stdio.h>


// void fun2 (int x, int y) { 
// int diff; 
// diff = x - y; 
// printf("Result = %d\n", diff); 
// }

void fun2(int x, int y) {
    // Check for negative overflow 
    if ((y > 0) && (x < INT_MIN + y)) {
        printf("Error: Integer negative overflow (underflow) detected!\n");
    }
    // Check for positive overflow
    else if ((y < 0) && (x > INT_MAX + y)) {
        printf("Error: Integer positive overflow detected!\n");
    }
    // If it passes the checks, it is safe to subtract
    else {
        int diff = x - y;
        printf("Result = %d\n", diff);
    }
}


int main() {
    //  values that cause an overflow/underflow
    printf("Test 1 (Overflow): INT_MIN and 1\n");
    fun2(INT_MIN, 1);

    //  normal values that do not cause an overflow
    printf("\nTest 2 (Safe Positive): 100 and 50\n");
    fun2(100, 50);

    // normal values that do not cause an overflow
    printf("\nTest 3 (Safe Mixed): -50 and 20\n");
    fun2(-50, 20);

    return 0;
}
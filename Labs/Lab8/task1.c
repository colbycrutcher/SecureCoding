// #include <limits.h>
#include <stdio.h>
#include <limits.h>

// void fun1 (int a, int b) { 
// // int sum; 
// // sum = a + b; 
// // printf("Result = %d\n", sum); 
// // }

// void main() {
// int x = INT_MAX;
// int y = 1;  
// fun1(x, y); 
// }




void fun1(int a, int b) {
    // Check for positive overflow
    if ((a > 0) && (b > INT_MAX - a)) {
        printf("Error: Integer positive overflow detected!\n");
    }
    // Check for negative overflow (underflow)
    else if ((a < 0) && (b < INT_MIN - a)) {
        printf("Error: Integer negative overflow (underflow) detected!\n");
    }
    // If it passes the checks, it is safe to add
    else {
        int sum = a + b;
        printf("Result = %d\n", sum);
    }
}

int main() {
    // 1.values that cause an overflow
    printf("Test 1 (Overflow): INT_MAX and 1\n");
    fun1(INT_MAX, 1);

    // 2. Normal values that do not cause an overflow
    printf("\nTest 2 (Safe Positive): 100 and 200\n");
    fun1(100, 200);

    // 3. Normal values that do not cause an underflow
    printf("\nTest 3 (Safe Negative): -50 and -75\n");
    fun1(-50, -75);

    return 0;
}

// #include <stdio.h>

// int fun(double *to, double *from, int pos, int n)
// {
//     int k;
//     for (k = 0; k < n; k++) {
//         to[pos] = from[k];
//         pos++;
//     }
//     return pos;
// }

// int main(void) {
//     double to[5]   = {0, 0, 0, 0, 0};
//     double from[5] = {1.1, 2.2, 3.3, 4.4, 5.5};

//     // Safe test case
//     fun(to, from, 1, 3);   // writes to[1..3]
//     printf("Safe:  %.1f %.1f %.1f %.1f %.1f\n", to[0], to[1], to[2], to[3], to[4]);

//     // Overflow test case (writes past to[4])
//     fun(to, from, 4, 3);   // tries to write to[4], to[5], to[6] (overflow)
//     printf("After overflow attempt: %.1f %.1f %.1f %.1f %.1f\n",
//            to[0], to[1], to[2], to[3], to[4]);

//     return 0;
// }

#include <stdio.h>

int fun(double *to, int to_len, double *from, int pos, int n)
{
    int k;

    // Clamp pos to valid range
    if (pos < 0) pos = 0;
    if (pos > to_len) pos = to_len;

    // Clamp n so we never write past to[to_len-1]
    if (n < 0) n = 0;
    if (pos + n > to_len) {
        n = to_len - pos;
    }

    for (k = 0; k < n; k++) {
        to[pos] = from[k];
        pos++;
    }
    return pos;
}



int main(void) {
    double to[5]   = {0, 0, 0, 0, 0};
    double from[5] = {1.1, 2.2, 3.3, 4.4, 5.5};

    fun(to, 5, from, 1, 3);
    printf("Safe:  %.1f %.1f %.1f %.1f %.1f\n", to[0], to[1], to[2], to[3], to[4]);

    // Same overflow attempt now becomes safe (copy is clamped)
    fun(to, 5, from, 4, 3);
    printf("After clamped copy: %.1f %.1f %.1f %.1f %.1f\n",
           to[0], to[1], to[2], to[3], to[4]);

    return 0;
}

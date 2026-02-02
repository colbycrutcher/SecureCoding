// # include <stdio.h> 
// int main() 
// { 
// char buf[8]; 
// int i = 0; 
// char c; 
// while ((c = getchar()) != '\n') { 
// buf[i++] = c; 
// } 
// buf[i] = '\0'; 
// printf("%s\n", buf); 
// return 0; 
// }

#include <stdio.h>

int main() {
    char buf[8];
    int i = 0;
    int c;

    while ((c = getchar()) != '\n' && c != EOF) {
        if (i < (int)sizeof(buf) - 1) {
            buf[i++] = (char)c;
        } 
        // else: ignore extra chars until newline
    }

    buf[i] = '\0';
    printf("%s\n", buf);
    return 0;
}

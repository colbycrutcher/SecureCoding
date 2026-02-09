#include <stdio.h>

void accessVault(int first, int second) {
    if (first == 0x0000FF1CE && second == 0xC00010FF) {
        FILE *fp;
        int c;

        // Directly attempt to open the flag file within the 'accessVault' function
        fp = fopen("flag.txt", "r");
        if (fp) {
            printf("Access granted. The flag is:\n");
            while ((c = getc(fp)) != EOF) {
                putchar(c);
            }
            fclose(fp);
        } else {
            printf("Failed to retrieve the flag. Please ensure you have the correct access rights.\n");
        }
    } else {
        printf("Intrusion detected! Secure protocols activated!!\n");
    }
}

void initiateHack() {
    char buffer[32];

    printf("Enter your hacker alias:\n");
    scanf("%s", buffer);
    printf("Welcome, %s! Initiating the cybersecurity vault access sequence...\n", buffer);

}

int main() {
    initiateHack();
    return 0;
}

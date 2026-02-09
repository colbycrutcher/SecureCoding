#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void revealMissionDetails() {
    FILE *fp;
    int c;

    // Attempt to open the mission's secret file
    fp = fopen("mission_flag.txt", "r");
    if (fp) {
        printf("Mission launched! Revealing mission details:\n");
        while ((c = getc(fp)) != EOF) {
            putchar(c);
        }
        fclose(fp);
    } else {
        printf("Mission launch successful, but the mission details file is missing.\n");
    }
}

void checkLaunchCode(){
    int launchCode = 0x12345678;
    char buffer[25];
    printf("Enter launch code: ");
    fflush(stdout);
    gets(buffer);
    if(launchCode == 0xdeadfa11){
        printf("Launch code accepted!\n");
        revealMissionDetails();
    }
    else{
        printf("Incorrect launch code: %04x\n", launchCode);
        printf("Mission aborted...\n");
        fflush(stdout);
    }
}

int main(int argc, char* argv[]){
    checkLaunchCode();
    return 0;
}

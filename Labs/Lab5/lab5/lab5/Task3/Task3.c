#include <stdio.h>

void revealArtifact() {
    FILE *fp;
    int c;

    // Attempt to open the artifact's secret file
    fp = fopen("artifact_flag.txt", "r");
    if (fp) {
        printf("You've successfully uncovered the Ancient Artifact of Code! Its secrets are now yours:\n");
        while ((c = getc(fp)) != EOF) {
            putchar(c);
        }
        fclose(fp);
    } else {
        printf("Artifact uncovered, but the secret scroll seems to be missing.\n");
    }
}

void discoverArtifact() {
    char buffer[20];

    printf("Enter the name of the explorer:\n");
    scanf("%s", buffer);
    printf("Welcome, %s! Let's see if you've found anything...\n", buffer);
}

int main() {
    discoverArtifact();
    return 0;
}

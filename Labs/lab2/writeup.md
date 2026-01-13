Colby Crutcher

Lab2

Secure Coding


1. (5 points) What type of file is this, and what kind of security does it have?

- An exe file, and just has read permissions for regular users.


2. (5 points) What are the files that make up this binary, and which one contains main?

- cscd437main.c, cybr437lab2.c, cybr437.h.

cscd437main.c contains teh main function.

3. (5 points) What are the type(s) and name(s) of parameter(s) being passed to main?



4. (5 points) Set a breakpoint on each function and display the breakpoints.
5. (5 points) Begin running the program. How many arguments are passed to main?
6. (5 points) Step twice and display the contents of the constant and two variables in main.
7. (5 points) Step until you enter the first function called in main. What is the type and name of
the constant? Where is the constant declared?
8. (5 points) Explain the difference between printing var and var[x]?
9. (5 points) Instead of continuing this function, return to main and print the current line.
10. (5 points) Step into the second function called from main. What is the name and starting value
of the counting variable?
11. (5 points) Use the disassemble command in GDB to display the assembly code for the function.
What does the output show, and how does it correlate with the C source code?
Page 2 of 2
12. (5 points) Delete the breakpoint for the first function called in main and disable the breakpoint
for the last function called.
13. (5 points) Without starting over, AKA your current location in a function that is not main, print
the memory location of the first variable passed to main.
14. (5 points) Print the information on the current running threads. How many threads are running?
15. (5 points) Enable the breakpoint for the third function called by main. What is the type, name,
and memory location of the variable passed to it?
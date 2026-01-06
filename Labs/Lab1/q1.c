#include <stdio.h> 
 
int main() 
{ 
 char c = 'C'; 
 char *p = &c; 
//   int c = 1;
//   int *p = &c;
//   double c = 1.23;
//   double *p = &c;

  printf("p is %p\n", p); 
  printf("The value at p is %c\n", *p); 
  
  /* Pointer arithmetic to find what p+1 is */ 
  p = p + 2; 
  printf("Now p is %p\n", p); 
 
  return 0; 
} 
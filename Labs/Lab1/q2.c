#include <stdio.h> 
 
void fun1(int xval) 
{ 
  int x; 
  x = xval; 
  /* print the address and value of x here */ 
  printf("Address of x: %p\n", &x); 
  printf("Value of x: %d\n", x);
   
} 
 
void fun2() 
{ 
  int y = 10; 
  /* print the address and value of y here */ 
  printf("Address of y: %p\n", &y);
  printf("Value of y: %d\n", y);
   
} 
 
int main() 
{ 
  fun1(5); 
  fun2(); 
  return 0; 
} 
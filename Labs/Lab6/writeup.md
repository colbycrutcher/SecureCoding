Colby Crutcher

Lab 6

Secure Coding


## Task 1

![File1 endianness](image-2.png)


![File1 Checksec](image-3.png)

Disassembling main, we can see that the function 'welcome' is being called.

<!-- Make your own offset -->
<!-- Use the python from last lab -->

![](image.png)

Disassembling welcome: 

![](image-1.png)

We now need to find the offset. ($0x18$) below the Base Pointer We need 28 bytes of padding.

![cyclic 50 run](image-5.png)

Running this into the program causes a seg fault, but doesn't break the code to print the function twice.

![Failed run](image-6.png)

We now need to find the offset. ($0x18$) below the Base Pointer We need 28 bytes of padding.

![Found in backtrace](image-8.png)

![28 byte offset](image-7.png)

We need to calculate the vmmap.

![vmmap](image-9.png){width=70%}

By overwriting the return address with the absolute address of secret, control flow is redirected after welcome returns

![Final output with exploit](image-12.png)

## Task 2

![File1 endianness (Same as task 1)](image-11.png)

![File1 Checksec (same as task 1)](image-10.png)

We need more info about the secret since it isn't called in main.

![info functions](image-13.png)

secret function is located at offset 0x0000119d

From task1, vmmap and disas main, our base is 0x56555000.

0x56555000 + 0x119d = 0x5655619d.

![Final output](image-14.png)
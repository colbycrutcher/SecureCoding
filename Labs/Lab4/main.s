    .section .rodata
fmt:
    .string "Result: %ld\n"

    .text
    .globl main
    .type main, @function

main:
    endbr64

    push    %rbp
    mov     %rsp, %rbp
    sub     $16, %rsp        # align stack for printf

    # int a = 25
    movl    $0x19, -0x4(%rbp)

    # int b = 30
    movl    $0x1e, -0x8(%rbp)

    # long c = 45
    movq    $0x2d, -0x10(%rbp)

    # a + b
    mov     -0x4(%rbp), %edx
    mov     -0x8(%rbp), %eax
    add     %edx, %eax
    cltq

    # (a + b) - c
    sub     -0x10(%rbp), %rax
    mov     %rax, -0x10(%rbp)

    # -------- printf("Result: %ld\n", c) --------
    mov     -0x10(%rbp), %rsi    # 2nd arg: value
    lea     fmt(%rip), %rdi      # 1st arg: format string
    mov     $0, %eax             # required for variadic funcs
    call    printf
    # --------------------------------------------

    mov     $0, %eax
    leave
    ret


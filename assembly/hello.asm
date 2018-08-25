    .MODEL  SMALL 
    .STACK 100h;
 
    .DATA
 Message DB 'hello, my name',13,10,'$'   
    .CODE   
Hello Proc
mov ax, @data
mov ds, ax
mov dx, OFFSET Message
mov ah, 9h
int 21h
mov al,0
mov ah, 04ch
int 21h
Hello ENDP
END Hello
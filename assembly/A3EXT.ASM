; SCREEN.ASM - separately compiled file. 
        .model  small 
        .DATA
        Message DB 'Division by zero attempted.', 10, 13,'$'
        Emptymessage DB ' ', 10, 13,'$'
        Long_message DB 'Greatest common denominator = ','$'
        .CODE 
        PUBLIC  UP_CASE, ERROR, PRINT, GCDrec  
; allow external use 
; whoever call up_case proc must push a char
; that need to be convert on to the stack using
; A register
; MOV AX, Y_N
; PUSH AX
; CALL UP_CASE
; MOV Y_N, AX ; return is AX
_PutStr MACRO TheString
MOV DX,OFFSET TheString
MOV AH,09H
INT 21H
ENDM
 
UP_CASE PROC
    push    bp      ; save the current bp (stack frame)
    mov bp, sp      ; create new bp from sp (top)
    mov ax, word ptr [bp+4]
    CMP AL, 'a'
    JL not_lower_case
    CMP AL, 'z'
    JG not_lower_case
    SUB AL, 32
    SUB AH, AH

    POP BP
    RET 2
not_lower_case:     
    POP BP
    RET 2

UP_CASE ENDP 
 
ERROR PROC 
PUSH AX 
mov dx, OFFSET Message ; same as LEA Message    
mov ah, 9h   
int 21h
POP AX
RET
ERROR ENDP

; MOV AX, GCD
; PUSH AX
; CALL PRINT

PRINT PROC
push    bp      ; save the current bp (stack frame)
mov bp, sp      ; create new bp from sp (top)

push ax
mov dx, offset Long_message    ;copy address into dx 
mov ah, 9h  ;display string
int 21h     ; DOS I/O
pop ax

mov cx,0
mov bx,10
mov dx,0

ploop:
     DIV bx
     PUSH dx
     INC cx
     CMP ax,0
     JG ploop
    
ploop2:
     pop ax
     add al,48
     mov dl,al
     mov ah,02h
     int 21h
     DEC CX
     cmp CX,0
     JG ploop2

push ax
_PutStr Emptymessage
pop ax

POP BP
RET 2
PRINT ENDP

GCDrec  PROC 
    push BP      ; save current stack frame
    mov BP,SP  ; top of stack is new frame
    sub SP,2   ; one local int var remain

    mov word ptr [bp-2],0      ; var = ?

    mov AX, word ptr [BP+4] ; put n into ax
    cmp AX, 0       ; compare against 0 n = 0
    JE n_is_zero        ; div by zero

    MOV AX, word ptr [BP+6] ; mov m into al
    CWD
    IDIV word ptr [BP+4]     ; div by n
    MOV [BP-2], DX  ; save the remain
    cmp word ptr [BP-2], 0   ; remain is zero or not
    JE remain_zero
    
    mov ax, word ptr [BP+4]  ; new m is old n
    push ax   
    mov ax, word ptr [BP-2]  ; new n is result of old mod 
    push ax 
    call GCDrec

    JMP theend

n_is_zero: ;call error return 0
    call ERROR
    mov AX, 0
    JMP theend    
 
remain_zero: ; return n
    MOV AX, word ptr [BP+4]
    JMP theend

theend:
    mov sp, bp    ; destroy local var 
    pop bp        ; restore old stack frame 
    ret 4

    
GCDrec ENDP

      END   ; NO LABEL

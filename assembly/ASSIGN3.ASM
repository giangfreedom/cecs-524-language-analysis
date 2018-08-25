; tlink /t a3ext.obj 
    .MODEL  SMALL 
    .STACK 100h;
 
    .DATA
    Message DB 'Division by zero attempted.', 10, 13,'$'
    Long_message DB 'Greatest common denominator = ', 10, 13,'$'
    mystring db 5
             db ?
             db 5 dup (?)
    M DW ?
    N DW ?
    GCD DW ?
    Y_N DW  'Y'
    EnterM  DB 'Enter M:', 13, 10, '$'
    EnterN  DB 'Enter N:', 13, 10, '$'
    Message2 DB 'Do another? (Y/N)', 10, 13,'$'
    Message3 DB 'Input is: ', 10, 13,'$'
    counter DB ?
    accumulator DB 0
    E DB 10
                    
    .CODE         ; begin the code segment
    extrn   UP_CASE : near, ERROR : near, GCDrec : near, PRINT : near
; PROC names follow the same rules as labels

_PutStr MACRO TheString
MOV DX,OFFSET TheString
MOV AH,09H
INT 21H
ENDM

_getch  MACRO   ;output  AL 
MOV AH,01H
INT 21H
ENDM

getdec PROC
    mov dx, OFFSET mystring
    mov ah,0Ah
    int 21h
 
    mov SI, offset mystring+1
    mov bl, [si]
    mov bh, 0
    mov counter, bl

 Loop1:
    inc SI
    mov al, [si]

    Dec counter        ; byteread = byteread - 1

    SUB al, 48           ; bc zero = 48 on asci table and 9 = 57 dec
    add al, accumulator
    IMUL E
    mov accumulator,al
    cmp counter,0
    JE finalresult
    JMP Loop1
    
finalresult:
    mov al, accumulator
    CBW
    IDIV E         ; div AX by 10 to get the number
                    ;final result in AL
    mov accumulator, 0               
    ret
getdec ENDP

GETDATA PROC                
GetLoop: 
    push AX
    _PutStr EnterM
    pop AX

    call getdec
    mov M,ax    

    push AX
    _PutStr EnterN
    pop AX

    call getdec
    mov N,ax
       
    mov ax,m
    push ax
  
    mov ax,n 
    push ax

    call GCDrec
    mov GCD, ax
    
    cmp GCD,0
    JE  is_gdc_zero

    MOV ax, GCD
    PUSH AX
    CALL PRINT
    
    JMP is_gdc_zero
    
return_jump:
    JMP GetLoop    
    
is_gdc_zero:
    PUSH AX 
    mov dx, OFFSET Message2 ; same as LEA Message    
    mov ah, 9h ;    function code for display string  
    int 21h ;   The standard way to call DOS I/O
    POP AX

    PUSH AX      ; get char from keyboard
    _getch          ; input will be in AL
    MOV AH,0       ; cant do 8 to 16 so wipe Ah
    MOV Y_N, AX      ; move the whole AX in Y_N
    POP AX

    MOV AX,Y_N
    PUSH AX
    CALL UP_CASE
    
    MOV Y_N, AX ; return is AX  

    Cmp Y_N, 'Y'
    JE return_jump

    ret
GETDATA ENDP

MAIN PROC; start of PROC, more PSOPS maybe
    ; since we have nothing in data seg can I skip?
    mov ax, @data  ;copy address of data segment    
    mov ds, ax      ;move the address to ds reg 
    CALL GETDATA

    ; The next three lines are present in almost every 
    ; PC assembler program. It is similar to a return 
    ; 0; in C.

    mov al, 0 ; Return code of 0
    mov ah, 4ch ;   Exit back to MS/PCDOS
    int 21h

MAIN ENDP        ; end of code for NAME
     END MAIN  ; only required for MAIN
               

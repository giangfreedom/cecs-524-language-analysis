    .MODEL  SMALL 
    .STACK 100h;
 
    .DATA
    mystring db 5
             db ?
             db 5 dup (?)

    Message  DB      ' Enter M:', 13, 10, '$'
    M   DB  ?
    counter DB ?
    accumulator DB ?
    E   DB  10

    .CODE         ; begin the code segment
        ;extrn   UP_CASE : near, ERROR : near, GCDrec : near, PRINT : near
; PROC names follow the same rules as labels
_PutStr MACRO   TheString
        MOV     DX, OFFSET TheString
        MOV     AH, 09H
        INT     21H
        ENDM
        
_getdec MACRO
    mov dx, OFFSET mystring
    mov ah,0Ah
    int 21h
 
    mov SI, offset mystring+1
    mov bl, [si]
    mov bh, 0
    ;add bl, 48
    mov counter, bl

    ;mov dl,cl
    ;mov dh,0
    ;mov AH,2h
    ;int 21h

 Loop1:
    inc SI
    mov cl, [si]
    mov ch,0

    Dec counter        ; byteread = byteread - 1
    mov al, cl
    SUB al, 48           ; bc zero = 48 on asci table and 9 = 57 dec
    add al, accumulator
    IMUL E
    mov accumulator,al
    cmp counter,0
    JE finalresult
    JMP Loop1
    
finalresult:
    mov al, accumulator
    CBW             ; AL to AX 16 to 32bit
    IDIV E         ; div AX by 10 to get the number
                    ;final result in AX
    ENDM
    
GETDATA PROC            
    push AX
    _PutStr Message
    pop AX

    push    AX
    _getdec
    mov M, al
    push AX
    _PutStr Message
    pop AX

    add M, 48
    mov dl, M
    mov dh, 0
    mov ah, 2h
    int 21h
    pop     AX

    ret
GETDATA ENDP
                    
MAIN    PROC    ; start of PROC, more PSOPS maybe
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

MAIN    ENDP        ; end of code for NAME
        END MAIN  ; only required for MAIN

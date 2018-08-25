.MODEL  SMALL 
.STACK 100h;
.DATA 
Message  DB 'Enter M:', 13, 10, '$'
NumString db  5
          db  ?
          db  5 dup (?) 
M DB ?  
.CODE

_PutStr MACRO   TheString
        MOV     DX, OFFSET TheString
        MOV     AH, 09H
        INT     21H
        ENDM
        
GETDATA PROC             
    push AX
    _PutStr Message
    pop AX
    ret
GETDATA ENDP
                    
MAIN    PROC; start of PROC, more PSOPS maybe
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
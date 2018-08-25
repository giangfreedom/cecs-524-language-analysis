       PROGRAM QE
       CHARACTER Y
       REAL X(3)

 25    WRITE(*,*) 'ENTER THE VALUE FOR A, B AND C:'
       READ(*,*) (X(I), I = 1,3)

       call discriminant(X(1),X(2),X(3))

       WRITE(*,*) 'DO ANOTHER?'
       READ(*,*) Y
       IF (Y == 'Y' .OR. Y =='y') THEN
           GO TO 25
       END IF

       END program


SUBROUTINE discriminant (A,B,C)
    REAL D

    D = (B*B) - (4*A*C)
    CALL ROOT(A,B,C,D)

    RETURN
    END SUBROUTINE

SUBROUTINE ROOT (A,B,C,D)
    REAL R, T
    R = 0
    T = 0

    IF (D > 0) THEN
       WRITE(*,*) 'EQUATION HAVE 2 REAL ROOTS'

       R = (-B + SQRT(D)) / (2*A)

       T = (-B - SQRT(D)) / (2*A)

       WRITE(*,*) 'ROOT1 = ', R, '   ', 'ROOT2 = ', T

    ELSE IF (D == 0) THEN
       WRITE(*,*) 'EQUATION HAVE 1 REAL ROOTS'

       R = (-B + SQRT(D)) / (2*A)

       WRITE(*,*) 'ROOT1 = ', R

    ELSE
       WRITE(*,*) 'EQUATION HAVE 2 IMAGINARY ROOTS'

       R = (-B + SQRT(-D)) / (2*A)

       T = (-B - SQRT(-D)) / (2*A)

       WRITE(*,*) 'ROOT1 = ', R,'*i', '   ', 'ROOT2 = ', T,'*i'

    END IF

    RETURN
    END SUBROUTINE

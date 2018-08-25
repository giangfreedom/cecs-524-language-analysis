grammar simplegrammar;

@header {
	import java.util.HashMap;
	import java.util.Scanner;
}

@lexer::header {

}

@members {
   /** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
Scanner in = new Scanner(System.in);
}
program :	'begin' statement+ 'end' ;

statement 
	: 'PRINTLN' INT {System.out.println($INT.text);}
	| 'PRINTLN' STRING 
		    {
		    String v = $STRING.text;
		    v = v.replaceAll("\"", " ");
		    v = v.trim();
		    System.out.println(v);
		    }
	| 'PRINT' INT {System.out.print($INT.text);}
	| 'PRINT' STRING 
		  {
		  String v = $STRING.text;
		  v = v.replaceAll("\"", " ");
		  v = v.trim();
		  System.out.print(v);
		  }
	| 'PRINTLN' ID {System.out.print(memory.get($ID.text));}
	| 'PRINT' ID {System.out.print(memory.get($ID.text));}
	| 'INTEGER' var (',' var)*
	| 'INPUT' mulAssign (',' mulAssign)*
	| 'END' {System.exit(0);} 
	|  expr NEWLINE {System.out.println($expr.value);}
	| 'LET' ID '=' expr NEWLINE
	   {memory.put($ID.text, new Integer($expr.value));}
	|  NEWLINE
	;
	
var  returns [int value]
    :	ID {memory.put($ID.text, null);}
    ;
    
mulAssign returns [int value]
    :  ID {String number = in.next();
           Double result = Double.parseDouble(number);
           int intresult = result.intValue();
           if(memory.containsKey($ID.text)){memory.put($ID.text, intresult);}
           else{System.err.println($ID.text+" is not declared");}
    	   }
    ;
    
expr returns [int value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e=multExpr {$value += $e.value;}
        |   '-' e=multExpr {$value -= $e.value;}
        )*
    ;
    
multExpr returns [int value]
    :   e=atom {$value = $e.value;} 
    	(   '*' e=atom {$value *= $e.value;}
    	|   '/' e=atom {$value /= $e.value;}
    	)*
    ;
    
atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = (Integer)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' expr ')' {$value = $expr.value;}
    ;    


NEWLINE:'\r'? '\n' ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

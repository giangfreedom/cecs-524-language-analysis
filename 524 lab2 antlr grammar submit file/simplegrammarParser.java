// $ANTLR 3.5 C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g 2017-02-22 23:07:20

	import java.util.HashMap;
	import java.util.Scanner;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simplegrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "HEX_DIGIT", 
		"ID", "INT", "NEWLINE", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", 
		"')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'END'", "'INPUT'", "'INTEGER'", 
		"'LET'", "'PRINT'", "'PRINTLN'", "'begin'", "'end'"
	};
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int COMMENT=4;
	public static final int ESC_SEQ=5;
	public static final int HEX_DIGIT=6;
	public static final int ID=7;
	public static final int INT=8;
	public static final int NEWLINE=9;
	public static final int OCTAL_ESC=10;
	public static final int STRING=11;
	public static final int UNICODE_ESC=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public simplegrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public simplegrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return simplegrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g"; }


	   /** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	Scanner in = new Scanner(System.in);



	// $ANTLR start "program"
	// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:17:1: program : 'begin' ( statement )+ 'end' ;
	public final void program() throws  Exception{
		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:17:9: ( 'begin' ( statement )+ 'end' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:17:11: 'begin' ( statement )+ 'end'
			{
			match(input,28,FOLLOW_28_in_program30); 
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:17:19: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==14||(LA1_0 >= 22 && LA1_0 <= 27)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:17:19: statement
					{
					pushFollow(FOLLOW_statement_in_program32);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,29,FOLLOW_29_in_program35); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:19:1: statement : ( 'PRINTLN' INT | 'PRINTLN' STRING | 'PRINT' INT | 'PRINT' STRING | 'PRINTLN' ID | 'PRINT' ID | 'INTEGER' var ( ',' var )* | 'INPUT' mulAssign ( ',' mulAssign )* | 'END' | expr NEWLINE | 'LET' ID '=' expr NEWLINE | NEWLINE );
	public final void statement() throws  Exception{
		Token INT1=null;
		Token STRING2=null;
		Token INT3=null;
		Token STRING4=null;
		Token ID5=null;
		Token ID6=null;
		Token ID8=null;
		int expr7 =0;
		int expr9 =0;

		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:20:2: ( 'PRINTLN' INT | 'PRINTLN' STRING | 'PRINT' INT | 'PRINT' STRING | 'PRINTLN' ID | 'PRINT' ID | 'INTEGER' var ( ',' var )* | 'INPUT' mulAssign ( ',' mulAssign )* | 'END' | expr NEWLINE | 'LET' ID '=' expr NEWLINE | NEWLINE )
			int alt4=12;
			switch ( input.LA(1) ) {
			case 27:
				{
				switch ( input.LA(2) ) {
				case INT:
					{
					alt4=1;
					}
					break;
				case STRING:
					{
					alt4=2;
					}
					break;
				case ID:
					{
					alt4=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 26:
				{
				switch ( input.LA(2) ) {
				case INT:
					{
					alt4=3;
					}
					break;
				case STRING:
					{
					alt4=4;
					}
					break;
				case ID:
					{
					alt4=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 24:
				{
				alt4=7;
				}
				break;
			case 23:
				{
				alt4=8;
				}
				break;
			case 22:
				{
				alt4=9;
				}
				break;
			case ID:
			case INT:
			case 14:
				{
				alt4=10;
				}
				break;
			case 25:
				{
				alt4=11;
				}
				break;
			case NEWLINE:
				{
				alt4=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:20:4: 'PRINTLN' INT
					{
					match(input,27,FOLLOW_27_in_statement46); 
					INT1=(Token)match(input,INT,FOLLOW_INT_in_statement48); 
					System.out.println((INT1!=null?INT1.getText():null));
					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:21:4: 'PRINTLN' STRING
					{
					match(input,27,FOLLOW_27_in_statement55); 
					STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_statement57); 

							    String v = (STRING2!=null?STRING2.getText():null);
							    v = v.replaceAll("\"", " ");
							    v = v.trim();
							    System.out.println(v);
							    
					}
					break;
				case 3 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:28:4: 'PRINT' INT
					{
					match(input,26,FOLLOW_26_in_statement71); 
					INT3=(Token)match(input,INT,FOLLOW_INT_in_statement73); 
					System.out.print((INT3!=null?INT3.getText():null));
					}
					break;
				case 4 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:29:4: 'PRINT' STRING
					{
					match(input,26,FOLLOW_26_in_statement80); 
					STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_statement82); 

							  String v = (STRING4!=null?STRING4.getText():null);
							  v = v.replaceAll("\"", " ");
							  v = v.trim();
							  System.out.print(v);
							  
					}
					break;
				case 5 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:36:4: 'PRINTLN' ID
					{
					match(input,27,FOLLOW_27_in_statement94); 
					ID5=(Token)match(input,ID,FOLLOW_ID_in_statement96); 
					System.out.print(memory.get((ID5!=null?ID5.getText():null)));
					}
					break;
				case 6 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:37:4: 'PRINT' ID
					{
					match(input,26,FOLLOW_26_in_statement103); 
					ID6=(Token)match(input,ID,FOLLOW_ID_in_statement105); 
					System.out.print(memory.get((ID6!=null?ID6.getText():null)));
					}
					break;
				case 7 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:38:4: 'INTEGER' var ( ',' var )*
					{
					match(input,24,FOLLOW_24_in_statement112); 
					pushFollow(FOLLOW_var_in_statement114);
					var();
					state._fsp--;

					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:38:18: ( ',' var )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==18) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:38:19: ',' var
							{
							match(input,18,FOLLOW_18_in_statement117); 
							pushFollow(FOLLOW_var_in_statement119);
							var();
							state._fsp--;

							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;
				case 8 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:39:4: 'INPUT' mulAssign ( ',' mulAssign )*
					{
					match(input,23,FOLLOW_23_in_statement126); 
					pushFollow(FOLLOW_mulAssign_in_statement128);
					mulAssign();
					state._fsp--;

					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:39:22: ( ',' mulAssign )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==18) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:39:23: ',' mulAssign
							{
							match(input,18,FOLLOW_18_in_statement131); 
							pushFollow(FOLLOW_mulAssign_in_statement133);
							mulAssign();
							state._fsp--;

							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;
				case 9 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:40:4: 'END'
					{
					match(input,22,FOLLOW_22_in_statement140); 
					System.exit(0);
					}
					break;
				case 10 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:41:5: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_statement149);
					expr7=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement151); 
					System.out.println(expr7);
					}
					break;
				case 11 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:42:4: 'LET' ID '=' expr NEWLINE
					{
					match(input,25,FOLLOW_25_in_statement158); 
					ID8=(Token)match(input,ID,FOLLOW_ID_in_statement160); 
					match(input,21,FOLLOW_21_in_statement162); 
					pushFollow(FOLLOW_expr_in_statement164);
					expr9=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement166); 
					memory.put((ID8!=null?ID8.getText():null), new Integer(expr9));
					}
					break;
				case 12 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:44:5: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement178); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "var"
	// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:47:1: var returns [int value] : ID ;
	public final int var() throws  Exception{
		int value = 0;


		Token ID10=null;

		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:48:5: ( ID )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:48:7: ID
			{
			ID10=(Token)match(input,ID,FOLLOW_ID_in_var198); 
			memory.put((ID10!=null?ID10.getText():null), null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "var"



	// $ANTLR start "mulAssign"
	// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:51:1: mulAssign returns [int value] : ID ;
	public final int mulAssign() throws  Exception{
		int value = 0;


		Token ID11=null;

		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:52:5: ( ID )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:52:8: ID
			{
			ID11=(Token)match(input,ID,FOLLOW_ID_in_mulAssign226); 
			String number = in.next();
			           Double result = Double.parseDouble(number);
			           int intresult = result.intValue();
			           if(memory.containsKey((ID11!=null?ID11.getText():null))){memory.put((ID11!=null?ID11.getText():null), intresult);}
			           else{System.err.println((ID11!=null?ID11.getText():null)+" is not declared");}
			    	   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mulAssign"



	// $ANTLR start "expr"
	// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:60:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws  Exception{
		int value = 0;


		int e =0;

		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:61:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:61:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr257);
			e=multExpr();
			state._fsp--;

			value = e;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:62:9: ( '+' e= multExpr | '-' e= multExpr )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==17) ) {
					alt5=1;
				}
				else if ( (LA5_0==19) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:62:13: '+' e= multExpr
					{
					match(input,17,FOLLOW_17_in_expr273); 
					pushFollow(FOLLOW_multExpr_in_expr277);
					e=multExpr();
					state._fsp--;

					value += e;
					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:63:13: '-' e= multExpr
					{
					match(input,19,FOLLOW_19_in_expr293); 
					pushFollow(FOLLOW_multExpr_in_expr297);
					e=multExpr();
					state._fsp--;

					value -= e;
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:67:1: multExpr returns [int value] : e= atom ( '*' e= atom | '/' e= atom )* ;
	public final int multExpr() throws  Exception{
		int value = 0;


		int e =0;

		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:68:5: (e= atom ( '*' e= atom | '/' e= atom )* )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:68:9: e= atom ( '*' e= atom | '/' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr339);
			e=atom();
			state._fsp--;

			value = e;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:69:6: ( '*' e= atom | '/' e= atom )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==16) ) {
					alt6=1;
				}
				else if ( (LA6_0==20) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:69:10: '*' e= atom
					{
					match(input,16,FOLLOW_16_in_multExpr353); 
					pushFollow(FOLLOW_atom_in_multExpr357);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:70:10: '/' e= atom
					{
					match(input,20,FOLLOW_20_in_multExpr370); 
					pushFollow(FOLLOW_atom_in_multExpr374);
					e=atom();
					state._fsp--;

					value /= e;
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:74:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws  Exception{
		int value = 0;


		Token INT12=null;
		Token ID13=null;
		int expr14 =0;

		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:75:5: ( INT | ID | '(' expr ')' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt7=1;
				}
				break;
			case ID:
				{
				alt7=2;
				}
				break;
			case 14:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:75:9: INT
					{
					INT12=(Token)match(input,INT,FOLLOW_INT_in_atom411); 
					value = Integer.parseInt((INT12!=null?INT12.getText():null));
					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:76:9: ID
					{
					ID13=(Token)match(input,ID,FOLLOW_ID_in_atom423); 

					        Integer v = (Integer)memory.get((ID13!=null?ID13.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID13!=null?ID13.getText():null));
					        
					}
					break;
				case 3 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:82:9: '(' expr ')'
					{
					match(input,14,FOLLOW_14_in_atom443); 
					pushFollow(FOLLOW_expr_in_atom445);
					expr14=expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_atom447); 
					value = expr14;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_28_in_program30 = new BitSet(new long[]{0x000000000FC04380L});
	public static final BitSet FOLLOW_statement_in_program32 = new BitSet(new long[]{0x000000002FC04380L});
	public static final BitSet FOLLOW_29_in_program35 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_statement46 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_statement48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_statement55 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_STRING_in_statement57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_statement71 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_statement73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_statement80 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_STRING_in_statement82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_statement94 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_statement96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_statement103 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_statement105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_statement112 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_var_in_statement114 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_statement117 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_var_in_statement119 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_23_in_statement126 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_mulAssign_in_statement128 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_statement131 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_mulAssign_in_statement133 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_22_in_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement149 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statement151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_statement158 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_statement160 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_statement162 = new BitSet(new long[]{0x0000000000004180L});
	public static final BitSet FOLLOW_expr_in_statement164 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_var198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_mulAssign226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr257 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_17_in_expr273 = new BitSet(new long[]{0x0000000000004180L});
	public static final BitSet FOLLOW_multExpr_in_expr277 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_19_in_expr293 = new BitSet(new long[]{0x0000000000004180L});
	public static final BitSet FOLLOW_multExpr_in_expr297 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_atom_in_multExpr339 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_16_in_multExpr353 = new BitSet(new long[]{0x0000000000004180L});
	public static final BitSet FOLLOW_atom_in_multExpr357 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_20_in_multExpr370 = new BitSet(new long[]{0x0000000000004180L});
	public static final BitSet FOLLOW_atom_in_multExpr374 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_INT_in_atom411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_atom443 = new BitSet(new long[]{0x0000000000004180L});
	public static final BitSet FOLLOW_expr_in_atom445 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom447 = new BitSet(new long[]{0x0000000000000002L});
}

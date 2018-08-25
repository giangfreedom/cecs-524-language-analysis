// $ANTLR 3.5 C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g 2017-02-22 23:07:20




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simplegrammarLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public simplegrammarLexer() {} 
	public simplegrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public simplegrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:6:7: ( '(' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:6:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:7:7: ( ')' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:7:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:8:7: ( '*' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:8:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:9:7: ( '+' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:9:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:10:7: ( ',' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:10:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:11:7: ( '-' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:11:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:12:7: ( '/' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:12:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:13:7: ( '=' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:13:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:14:7: ( 'END' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:14:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:15:7: ( 'INPUT' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:15:9: 'INPUT'
			{
			match("INPUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:16:7: ( 'INTEGER' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:16:9: 'INTEGER'
			{
			match("INTEGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:17:7: ( 'LET' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:17:9: 'LET'
			{
			match("LET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:18:7: ( 'PRINT' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:18:9: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:19:7: ( 'PRINTLN' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:19:9: 'PRINTLN'
			{
			match("PRINTLN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:20:7: ( 'begin' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:20:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:21:7: ( 'end' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:21:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:86:8: ( ( '\\r' )? '\\n' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:86:9: ( '\\r' )? '\\n'
			{
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:86:9: ( '\\r' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\r') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:86:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:88:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:88:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:88:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:91:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:91:7: ( '0' .. '9' )+
			{
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:91:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:95:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='/') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='/') ) {
					alt7=1;
				}
				else if ( (LA7_1=='*') ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:95:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:95:14: (~ ( '\\n' | '\\r' ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:95:28: ( '\\r' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\r') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:95:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:96:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:96:14: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='*') ) {
							int LA6_1 = input.LA(2);
							if ( (LA6_1=='/') ) {
								alt6=2;
							}
							else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
								alt6=1;
							}

						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:96:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:99:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:99:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:107:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:107:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:107:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\\') ) {
					alt8=1;
				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:107:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:107:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:112:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:116:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt9=1;
					}
					break;
				case 'u':
					{
					alt9=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt9=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:116:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:117:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:118:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:123:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				int LA10_1 = input.LA(2);
				if ( ((LA10_1 >= '0' && LA10_1 <= '3')) ) {
					int LA10_2 = input.LA(3);
					if ( ((LA10_2 >= '0' && LA10_2 <= '7')) ) {
						int LA10_4 = input.LA(4);
						if ( ((LA10_4 >= '0' && LA10_4 <= '7')) ) {
							alt10=1;
						}

						else {
							alt10=2;
						}

					}

					else {
						alt10=3;
					}

				}
				else if ( ((LA10_1 >= '4' && LA10_1 <= '7')) ) {
					int LA10_3 = input.LA(3);
					if ( ((LA10_3 >= '0' && LA10_3 <= '7')) ) {
						alt10=2;
					}

					else {
						alt10=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:123:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:124:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:125:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:130:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:130:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | NEWLINE | ID | INT | COMMENT | WS | STRING )
		int alt11=22;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt11=1;
			}
			break;
		case ')':
			{
			alt11=2;
			}
			break;
		case '*':
			{
			alt11=3;
			}
			break;
		case '+':
			{
			alt11=4;
			}
			break;
		case ',':
			{
			alt11=5;
			}
			break;
		case '-':
			{
			alt11=6;
			}
			break;
		case '/':
			{
			int LA11_7 = input.LA(2);
			if ( (LA11_7=='*'||LA11_7=='/') ) {
				alt11=20;
			}

			else {
				alt11=7;
			}

			}
			break;
		case '=':
			{
			alt11=8;
			}
			break;
		case 'E':
			{
			int LA11_9 = input.LA(2);
			if ( (LA11_9=='N') ) {
				int LA11_23 = input.LA(3);
				if ( (LA11_23=='D') ) {
					int LA11_30 = input.LA(4);
					if ( ((LA11_30 >= '0' && LA11_30 <= '9')||(LA11_30 >= 'A' && LA11_30 <= 'Z')||LA11_30=='_'||(LA11_30 >= 'a' && LA11_30 <= 'z')) ) {
						alt11=18;
					}

					else {
						alt11=9;
					}

				}

				else {
					alt11=18;
				}

			}

			else {
				alt11=18;
			}

			}
			break;
		case 'I':
			{
			int LA11_10 = input.LA(2);
			if ( (LA11_10=='N') ) {
				switch ( input.LA(3) ) {
				case 'P':
					{
					int LA11_31 = input.LA(4);
					if ( (LA11_31=='U') ) {
						int LA11_38 = input.LA(5);
						if ( (LA11_38=='T') ) {
							int LA11_44 = input.LA(6);
							if ( ((LA11_44 >= '0' && LA11_44 <= '9')||(LA11_44 >= 'A' && LA11_44 <= 'Z')||LA11_44=='_'||(LA11_44 >= 'a' && LA11_44 <= 'z')) ) {
								alt11=18;
							}

							else {
								alt11=10;
							}

						}

						else {
							alt11=18;
						}

					}

					else {
						alt11=18;
					}

					}
					break;
				case 'T':
					{
					int LA11_32 = input.LA(4);
					if ( (LA11_32=='E') ) {
						int LA11_39 = input.LA(5);
						if ( (LA11_39=='G') ) {
							int LA11_45 = input.LA(6);
							if ( (LA11_45=='E') ) {
								int LA11_49 = input.LA(7);
								if ( (LA11_49=='R') ) {
									int LA11_53 = input.LA(8);
									if ( ((LA11_53 >= '0' && LA11_53 <= '9')||(LA11_53 >= 'A' && LA11_53 <= 'Z')||LA11_53=='_'||(LA11_53 >= 'a' && LA11_53 <= 'z')) ) {
										alt11=18;
									}

									else {
										alt11=11;
									}

								}

								else {
									alt11=18;
								}

							}

							else {
								alt11=18;
							}

						}

						else {
							alt11=18;
						}

					}

					else {
						alt11=18;
					}

					}
					break;
				default:
					alt11=18;
				}
			}

			else {
				alt11=18;
			}

			}
			break;
		case 'L':
			{
			int LA11_11 = input.LA(2);
			if ( (LA11_11=='E') ) {
				int LA11_25 = input.LA(3);
				if ( (LA11_25=='T') ) {
					int LA11_33 = input.LA(4);
					if ( ((LA11_33 >= '0' && LA11_33 <= '9')||(LA11_33 >= 'A' && LA11_33 <= 'Z')||LA11_33=='_'||(LA11_33 >= 'a' && LA11_33 <= 'z')) ) {
						alt11=18;
					}

					else {
						alt11=12;
					}

				}

				else {
					alt11=18;
				}

			}

			else {
				alt11=18;
			}

			}
			break;
		case 'P':
			{
			int LA11_12 = input.LA(2);
			if ( (LA11_12=='R') ) {
				int LA11_26 = input.LA(3);
				if ( (LA11_26=='I') ) {
					int LA11_34 = input.LA(4);
					if ( (LA11_34=='N') ) {
						int LA11_41 = input.LA(5);
						if ( (LA11_41=='T') ) {
							switch ( input.LA(6) ) {
							case 'L':
								{
								int LA11_50 = input.LA(7);
								if ( (LA11_50=='N') ) {
									int LA11_54 = input.LA(8);
									if ( ((LA11_54 >= '0' && LA11_54 <= '9')||(LA11_54 >= 'A' && LA11_54 <= 'Z')||LA11_54=='_'||(LA11_54 >= 'a' && LA11_54 <= 'z')) ) {
										alt11=18;
									}

									else {
										alt11=14;
									}

								}

								else {
									alt11=18;
								}

								}
								break;
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
							case 'G':
							case 'H':
							case 'I':
							case 'J':
							case 'K':
							case 'M':
							case 'N':
							case 'O':
							case 'P':
							case 'Q':
							case 'R':
							case 'S':
							case 'T':
							case 'U':
							case 'V':
							case 'W':
							case 'X':
							case 'Y':
							case 'Z':
							case '_':
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
							case 'g':
							case 'h':
							case 'i':
							case 'j':
							case 'k':
							case 'l':
							case 'm':
							case 'n':
							case 'o':
							case 'p':
							case 'q':
							case 'r':
							case 's':
							case 't':
							case 'u':
							case 'v':
							case 'w':
							case 'x':
							case 'y':
							case 'z':
								{
								alt11=18;
								}
								break;
							default:
								alt11=13;
							}
						}

						else {
							alt11=18;
						}

					}

					else {
						alt11=18;
					}

				}

				else {
					alt11=18;
				}

			}

			else {
				alt11=18;
			}

			}
			break;
		case 'b':
			{
			int LA11_13 = input.LA(2);
			if ( (LA11_13=='e') ) {
				int LA11_27 = input.LA(3);
				if ( (LA11_27=='g') ) {
					int LA11_35 = input.LA(4);
					if ( (LA11_35=='i') ) {
						int LA11_42 = input.LA(5);
						if ( (LA11_42=='n') ) {
							int LA11_47 = input.LA(6);
							if ( ((LA11_47 >= '0' && LA11_47 <= '9')||(LA11_47 >= 'A' && LA11_47 <= 'Z')||LA11_47=='_'||(LA11_47 >= 'a' && LA11_47 <= 'z')) ) {
								alt11=18;
							}

							else {
								alt11=15;
							}

						}

						else {
							alt11=18;
						}

					}

					else {
						alt11=18;
					}

				}

				else {
					alt11=18;
				}

			}

			else {
				alt11=18;
			}

			}
			break;
		case 'e':
			{
			int LA11_14 = input.LA(2);
			if ( (LA11_14=='n') ) {
				int LA11_28 = input.LA(3);
				if ( (LA11_28=='d') ) {
					int LA11_36 = input.LA(4);
					if ( ((LA11_36 >= '0' && LA11_36 <= '9')||(LA11_36 >= 'A' && LA11_36 <= 'Z')||LA11_36=='_'||(LA11_36 >= 'a' && LA11_36 <= 'z')) ) {
						alt11=18;
					}

					else {
						alt11=16;
					}

				}

				else {
					alt11=18;
				}

			}

			else {
				alt11=18;
			}

			}
			break;
		case '\r':
			{
			int LA11_15 = input.LA(2);
			if ( (LA11_15=='\n') ) {
				alt11=17;
			}

			else {
				alt11=21;
			}

			}
			break;
		case '\n':
			{
			alt11=17;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'M':
		case 'N':
		case 'O':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt11=18;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt11=19;
			}
			break;
		case '\t':
		case ' ':
			{
			alt11=21;
			}
			break;
		case '\"':
			{
			alt11=22;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 11, 0, input);
			throw nvae;
		}
		switch (alt11) {
			case 1 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:16: T__15
				{
				mT__15(); 

				}
				break;
			case 3 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:22: T__16
				{
				mT__16(); 

				}
				break;
			case 4 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:28: T__17
				{
				mT__17(); 

				}
				break;
			case 5 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:34: T__18
				{
				mT__18(); 

				}
				break;
			case 6 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:40: T__19
				{
				mT__19(); 

				}
				break;
			case 7 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:46: T__20
				{
				mT__20(); 

				}
				break;
			case 8 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:52: T__21
				{
				mT__21(); 

				}
				break;
			case 9 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:58: T__22
				{
				mT__22(); 

				}
				break;
			case 10 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:64: T__23
				{
				mT__23(); 

				}
				break;
			case 11 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:70: T__24
				{
				mT__24(); 

				}
				break;
			case 12 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:76: T__25
				{
				mT__25(); 

				}
				break;
			case 13 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:82: T__26
				{
				mT__26(); 

				}
				break;
			case 14 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:88: T__27
				{
				mT__27(); 

				}
				break;
			case 15 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:94: T__28
				{
				mT__28(); 

				}
				break;
			case 16 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:100: T__29
				{
				mT__29(); 

				}
				break;
			case 17 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:106: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 18 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:114: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:117: INT
				{
				mINT(); 

				}
				break;
			case 20 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:121: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 21 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:129: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// C:\\Users\\SuperAdmin\\Desktop\\cecs 524 prog concept\\antlr 3.5\\simplegrammar.g:1:132: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}

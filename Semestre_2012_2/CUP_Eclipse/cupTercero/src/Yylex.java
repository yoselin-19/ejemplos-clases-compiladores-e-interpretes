/* The following code was generated by JFlex 1.4.3 on 8/7/12 7:56 AM */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/7/12 7:56 AM from the specification file
 * <tt>C:/Users/Luis Ochoa/Documents/workspace/cupTercero/src/calcu.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int INCOMMENT = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 24,  3,  0,  0, 24,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    24,  0,  0,  0,  0,  0,  0,  0, 25, 26,  2, 28, 14, 30, 32,  1, 
    31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 15, 16,  0, 29,  0,  0, 
     0,  8, 33, 33, 33, 33, 10,  7, 33, 11, 33, 33, 33,  9, 12,  6, 
     4, 33,  5, 33, 33, 33, 13, 33, 33, 33, 33,  0,  0,  0, 27,  0, 
     0, 19, 33, 33, 33, 18, 33, 33, 33, 33, 33, 33, 20, 33, 21, 23, 
    33, 33, 17, 33, 22, 33, 33, 33, 33, 33, 33,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\4\4\1\5\1\6\1\7"+
    "\2\4\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\0\1\1\1\2\4\4\1\5\1\6\1\7\2\4"+
    "\1\3\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\5\4\2\0\1\17\1\20\5\4\1\0\1\4"+
    "\1\21\1\22\2\4\1\23\1\4\1\21\1\22\2\4"+
    "\1\23\2\4\1\24\3\4\1\24\10\4\1\25\1\26"+
    "\1\4\1\25\1\26\2\4\2\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\356"+
    "\0\u0110\0\146\0\146\0\146\0\u0132\0\u0154\0\146\0\146"+
    "\0\146\0\146\0\146\0\146\0\u0176\0\u0198\0\u01ba\0\u01dc"+
    "\0\u01fe\0\u0220\0\u0242\0\u0264\0\u0198\0\u0198\0\u0198\0\u0286"+
    "\0\u02a8\0\u02ca\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198"+
    "\0\u02ec\0\146\0\u030e\0\u0330\0\u0352\0\u0374\0\u0396\0\u03b8"+
    "\0\u01dc\0\u01dc\0\u0198\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0462"+
    "\0\u0484\0\u04a6\0\u04c8\0\314\0\u04ea\0\u050c\0\u03b8\0\u052e"+
    "\0\u0550\0\u0220\0\u0572\0\u0594\0\u0484\0\u05b6\0\u05d8\0\314"+
    "\0\u05fa\0\u061c\0\u063e\0\u0220\0\u0660\0\u0682\0\u06a4\0\u06c6"+
    "\0\u06e8\0\u070a\0\u072c\0\u074e\0\314\0\314\0\u0770\0\u0220"+
    "\0\u0220\0\u0792\0\u07b4\0\314\0\u0220";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\3\1\4\1\5\1\6\5\7\1\10\2\7"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\5\7\1\5"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\0"+
    "\1\7\1\26\1\27\1\30\1\5\1\31\5\32\1\33"+
    "\2\32\1\34\1\35\1\36\1\37\1\40\1\41\5\32"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\26\1\32\2\0\1\52\104\0\1\5\24\0\1\5"+
    "\15\0\1\7\1\53\10\7\3\0\7\7\11\0\1\7"+
    "\4\0\12\7\3\0\7\7\11\0\1\7\4\0\7\7"+
    "\1\54\2\7\3\0\7\7\11\0\1\7\4\0\4\7"+
    "\1\55\5\7\3\0\7\7\11\0\1\7\4\0\12\7"+
    "\3\0\1\7\1\56\5\7\11\0\1\7\4\0\12\7"+
    "\3\0\4\7\1\57\2\7\11\0\1\7\37\0\1\25"+
    "\1\60\1\0\2\26\1\61\1\0\40\26\1\62\1\0"+
    "\37\26\1\63\1\61\1\0\40\26\1\61\1\0\1\32"+
    "\1\64\10\32\3\26\7\32\11\26\1\32\2\26\1\61"+
    "\1\0\12\32\3\26\7\32\11\26\1\32\2\26\1\61"+
    "\1\0\7\32\1\65\2\32\3\26\7\32\11\26\1\32"+
    "\2\26\1\61\1\0\4\32\1\66\5\32\3\26\7\32"+
    "\11\26\1\32\2\26\1\61\1\0\12\32\3\26\1\32"+
    "\1\67\5\32\11\26\1\32\2\26\1\61\1\0\12\32"+
    "\3\26\4\32\1\70\2\32\11\26\1\32\2\26\1\61"+
    "\1\5\24\26\1\42\13\26\1\61\1\0\33\26\1\51"+
    "\1\71\1\26\4\0\2\7\1\72\7\7\3\0\7\7"+
    "\11\0\1\7\4\0\10\7\1\73\1\7\3\0\7\7"+
    "\11\0\1\7\4\0\1\7\1\74\10\7\3\0\7\7"+
    "\11\0\1\7\4\0\12\7\3\0\2\7\1\75\4\7"+
    "\11\0\1\7\4\0\12\7\3\0\5\7\1\76\1\7"+
    "\11\0\1\7\37\0\1\77\2\0\2\26\1\61\1\0"+
    "\2\32\1\100\7\32\3\26\7\32\11\26\1\32\2\26"+
    "\1\61\1\0\10\32\1\101\1\32\3\26\7\32\11\26"+
    "\1\32\2\26\1\61\1\0\1\32\1\102\10\32\3\26"+
    "\7\32\11\26\1\32\2\26\1\61\1\0\12\32\3\26"+
    "\2\32\1\103\4\32\11\26\1\32\2\26\1\61\1\0"+
    "\12\32\3\26\5\32\1\104\1\32\11\26\1\32\2\26"+
    "\1\61\1\0\33\26\1\105\2\26\4\0\3\7\1\106"+
    "\6\7\3\0\7\7\11\0\1\7\4\0\11\7\1\107"+
    "\3\0\7\7\11\0\1\7\4\0\12\7\3\0\3\7"+
    "\1\110\3\7\11\0\1\7\4\0\12\7\3\0\1\7"+
    "\1\111\5\7\11\0\1\7\2\26\1\61\1\0\3\32"+
    "\1\112\6\32\3\26\7\32\11\26\1\32\2\26\1\61"+
    "\1\0\11\32\1\113\3\26\7\32\11\26\1\32\2\26"+
    "\1\61\1\0\12\32\3\26\3\32\1\114\3\32\11\26"+
    "\1\32\2\26\1\61\1\0\12\32\3\26\1\32\1\115"+
    "\5\32\11\26\1\32\4\0\1\7\1\116\10\7\3\0"+
    "\7\7\11\0\1\7\4\0\4\7\1\117\5\7\3\0"+
    "\7\7\11\0\1\7\4\0\12\7\3\0\1\120\6\7"+
    "\11\0\1\7\2\26\1\61\1\0\1\32\1\121\10\32"+
    "\3\26\7\32\11\26\1\32\2\26\1\61\1\0\4\32"+
    "\1\122\5\32\3\26\7\32\11\26\1\32\2\26\1\61"+
    "\1\0\12\32\3\26\1\123\6\32\11\26\1\32\4\0"+
    "\4\7\1\124\5\7\3\0\7\7\11\0\1\7\4\0"+
    "\1\7\1\125\10\7\3\0\7\7\11\0\1\7\4\0"+
    "\12\7\3\0\6\7\1\126\11\0\1\7\2\26\1\61"+
    "\1\0\4\32\1\127\5\32\3\26\7\32\11\26\1\32"+
    "\2\26\1\61\1\0\1\32\1\130\10\32\3\26\7\32"+
    "\11\26\1\32\2\26\1\61\1\0\12\32\3\26\6\32"+
    "\1\131\11\26\1\32\4\0\5\7\1\132\4\7\3\0"+
    "\7\7\11\0\1\7\2\26\1\61\1\0\5\32\1\133"+
    "\4\32\3\26\7\32\11\26\1\32\4\0\4\7\1\134"+
    "\5\7\3\0\7\7\11\0\1\7\2\26\1\61\1\0"+
    "\4\32\1\135\5\32\3\26\7\32\11\26\1\32";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2006];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\1\1\11\5\1\3\11\2\1\6\11\1\1"+
    "\1\0\23\1\1\11\5\1\2\0\7\1\1\0\44\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { return new Symbol(sym.COMA);
          }
        case 24: break;
        case 9: 
          { return new Symbol(sym.PARENTDER);
          }
        case 25: break;
        case 23: 
          { return new Symbol(sym.PROGRAMA);
          }
        case 26: break;
        case 7: 
          { return new Symbol(sym.PUNTOYCOMA);
          }
        case 27: break;
        case 4: 
          { return new Symbol(sym.ID,new String(yytext()));
          }
        case 28: break;
        case 1: 
          { return new Symbol(sym.DIVI);
          }
        case 29: break;
        case 2: 
          { return new Symbol(sym.MULTI);
          }
        case 30: break;
        case 11: 
          { return new Symbol(sym.SUMA);
          }
        case 31: break;
        case 6: 
          { return new Symbol(sym.DOSPUNTOS);
          }
        case 32: break;
        case 14: 
          { return new Symbol(sym.NUMEROENTERO,new Integer(yytext()));
          }
        case 33: break;
        case 19: 
          { return new Symbol(sym.NUMEROREAL,new Float(yytext()));
          }
        case 34: break;
        case 18: 
          { return new Symbol(sym.VAR);
          }
        case 35: break;
        case 17: 
          { return new Symbol(sym.FIN);
          }
        case 36: break;
        case 12: 
          { return new Symbol(sym.IGUAL);
          }
        case 37: break;
        case 21: 
          { return new Symbol(sym.FINVAR);
          }
        case 38: break;
        case 20: 
          { return new Symbol(sym.TIPOREAL);
          }
        case 39: break;
        case 22: 
          { return new Symbol(sym.TIPOENTERO);
          }
        case 40: break;
        case 8: 
          { return new Symbol(sym.PARENTIZQ);
          }
        case 41: break;
        case 3: 
          { /*ignoro blancos*/
          }
        case 42: break;
        case 15: 
          { yybegin(INCOMMENT);
          }
        case 43: break;
        case 13: 
          { return new Symbol(sym.RESTA);
          }
        case 44: break;
        case 16: 
          { /*ignorar*/ yybegin(YYINITIAL);
          }
        case 45: break;
        case 10: 
          { return new Symbol(sym.POTENCIA);
          }
        case 46: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

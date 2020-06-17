/* The following code was generated by JFlex 1.4.3 on 6/17/20 1:00 AM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/17/20 1:00 AM from the specification file
 * <tt>/home/angel-can/NetBeansProjects/AnalizadorLexico/src/codigo/lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\37\2\0\1\2\22\0\1\44\1\41\6\0\1\3\1\4"+
    "\2\10\1\6\1\10\1\12\1\36\12\11\1\0\1\5\1\42\1\7"+
    "\1\43\2\0\7\1\1\45\22\1\4\0\1\13\1\0\1\23\1\17"+
    "\1\27\1\14\1\21\1\22\1\33\1\30\1\26\2\1\1\20\1\1"+
    "\1\32\1\15\2\1\1\31\1\34\1\24\1\16\1\25\1\35\3\1"+
    "\1\40\1\0\1\40\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\3\1\6"+
    "\1\7\1\10\1\7\1\1\12\2\1\7\1\11\1\5"+
    "\1\1\2\12\2\0\1\13\2\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\0"+
    "\1\27\6\2\1\30\6\2\1\3\2\12\4\0\1\24"+
    "\1\10\1\2\1\0\3\2\1\27\2\2\1\0\1\31"+
    "\5\2\2\0\1\32\2\0\1\2\2\0\1\2\6\0"+
    "\1\30\2\2\1\33\2\0\1\2\1\34\1\0\1\2"+
    "\3\0\1\35\12\0\1\2\1\27\1\0\1\2\14\0"+
    "\1\30\11\0\1\36\40\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[181];
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
    "\0\0\0\46\0\114\0\162\0\230\0\46\0\276\0\344"+
    "\0\u010a\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214"+
    "\0\u023a\0\u0260\0\u0286\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344"+
    "\0\46\0\46\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\46"+
    "\0\u0428\0\46\0\46\0\46\0\46\0\46\0\46\0\46"+
    "\0\u044e\0\u0474\0\u0402\0\46\0\u01a2\0\u049a\0\u04c0\0\u04e6"+
    "\0\u050c\0\u0532\0\u0558\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616"+
    "\0\u063c\0\u0662\0\u0688\0\u06ae\0\u06d4\0\46\0\u06fa\0\u0720"+
    "\0\u0746\0\u076c\0\u0792\0\u0474\0\u07b8\0\u07de\0\u0804\0\u082a"+
    "\0\u0850\0\u0876\0\u089c\0\u08c2\0\u08e8\0\u090e\0\u0934\0\u095a"+
    "\0\u0980\0\u09a6\0\u09cc\0\u09f2\0\u0a18\0\46\0\u0a3e\0\u0a64"+
    "\0\u0a8a\0\u0ab0\0\u0ad6\0\u0afc\0\u0b22\0\u0b48\0\u0b6e\0\u0b94"+
    "\0\u0bba\0\u0be0\0\u0c06\0\u0c2c\0\u0c52\0\46\0\u0c78\0\u0c9e"+
    "\0\u0cc4\0\46\0\u0cea\0\u0d10\0\u0d36\0\u0d5c\0\u0d82\0\46"+
    "\0\u0da8\0\u0dce\0\u0df4\0\u0e1a\0\u0e40\0\u0e66\0\u0e8c\0\u0eb2"+
    "\0\u0ed8\0\u0efe\0\u0f24\0\u0f4a\0\u0f70\0\u0f96\0\u0fbc\0\u0fe2"+
    "\0\u1008\0\u102e\0\u1054\0\u107a\0\u10a0\0\u10c6\0\u10ec\0\u1112"+
    "\0\u1138\0\u115e\0\u1184\0\u11aa\0\u11d0\0\u11f6\0\u121c\0\u1242"+
    "\0\u1268\0\u128e\0\u12b4\0\u12da\0\46\0\u1300\0\u1326\0\u134c"+
    "\0\u1372\0\u1398\0\u13be\0\u13e4\0\u140a\0\u1430\0\u1456\0\u147c"+
    "\0\u14a2\0\u14c8\0\u14ee\0\u1514\0\u153a\0\u1560\0\u1586\0\u15ac"+
    "\0\u15d2\0\u15f8\0\u161e\0\u1644\0\u166a\0\u1690\0\u16b6\0\u16dc"+
    "\0\u1702\0\u1728\0\u174e\0\u1774\0\u179a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[181];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\2\3\1\17\1\20"+
    "\1\21\1\22\2\3\1\23\1\24\1\25\4\3\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\4"+
    "\1\3\47\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\23\3\7\0\1\3\2\0\1\4\3\0\1\4\35\0"+
    "\1\4\7\0\1\40\40\0\1\41\1\0\6\42\1\41"+
    "\1\42\23\41\1\42\6\0\1\41\2\0\1\4\1\0"+
    "\1\43\1\44\1\4\1\0\1\45\1\0\1\45\23\0"+
    "\1\45\5\0\1\4\7\0\1\46\1\0\1\47\1\0"+
    "\1\50\23\0\1\47\13\0\1\43\1\0\1\45\1\0"+
    "\1\45\1\0\1\45\23\0\1\45\10\0\1\51\7\0"+
    "\1\13\1\52\23\51\7\0\1\51\4\0\1\43\1\0"+
    "\1\45\1\0\1\45\1\53\1\54\23\0\1\45\10\0"+
    "\1\55\7\0\1\55\1\37\23\55\7\0\1\55\1\0"+
    "\1\3\5\0\1\36\1\0\1\3\1\37\2\3\1\56"+
    "\20\3\7\0\1\3\1\0\1\3\5\0\1\36\1\0"+
    "\1\3\1\37\2\3\1\57\20\3\7\0\1\3\1\0"+
    "\1\3\5\0\1\36\1\0\1\3\1\37\2\3\1\60"+
    "\20\3\7\0\1\3\1\0\1\3\5\0\1\36\1\0"+
    "\1\3\1\37\5\3\1\61\15\3\7\0\1\3\1\0"+
    "\1\3\5\0\1\36\1\0\1\3\1\37\2\3\1\62"+
    "\2\3\1\63\15\3\7\0\1\3\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\2\3\1\64\20\3\7\0"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\7\3\1\65\7\3\1\66\3\3\7\0\1\3\1\0"+
    "\1\3\5\0\1\36\1\0\1\3\1\37\10\3\1\67"+
    "\4\3\1\70\5\3\7\0\1\3\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\11\3\1\71\10\3\1\72"+
    "\7\0\1\3\1\0\1\3\5\0\1\36\1\0\1\3"+
    "\1\37\15\3\1\73\5\3\7\0\1\3\4\0\1\43"+
    "\1\0\1\45\1\0\1\45\1\0\1\45\23\0\1\74"+
    "\16\0\1\75\45\0\1\76\34\0\1\77\10\0\1\76"+
    "\34\0\1\100\2\0\1\101\7\0\1\102\2\0\22\101"+
    "\7\0\1\101\11\0\1\53\35\0\1\41\7\0\1\41"+
    "\1\0\23\41\7\0\1\41\1\0\1\51\7\0\1\51"+
    "\1\37\23\51\7\0\1\51\1\0\1\103\7\0\1\104"+
    "\1\0\23\103\7\0\1\103\1\0\1\3\5\0\1\36"+
    "\1\0\1\3\1\37\3\3\1\105\17\3\6\0\1\106"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\2\3\1\107\20\3\7\0\1\3\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\17\3\1\110\3\3\7\0"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\21\3\1\111\1\3\7\0\1\3\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\16\3\1\112\4\3\7\0"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\2\3\1\113\20\3\7\0\1\3\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\13\3\1\114\7\3\7\0"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\23\3\6\0\1\115\1\3\1\0\1\3\5\0\1\36"+
    "\1\0\1\3\1\37\11\3\1\116\11\3\7\0\1\3"+
    "\1\0\1\3\5\0\1\36\1\0\1\3\1\37\21\3"+
    "\1\117\1\3\7\0\1\3\1\0\1\3\5\0\1\36"+
    "\1\0\1\3\1\37\10\3\1\120\12\3\7\0\1\3"+
    "\1\0\1\3\5\0\1\36\1\0\1\3\1\37\16\3"+
    "\1\121\4\3\7\0\1\3\1\0\1\3\5\0\1\36"+
    "\1\0\1\3\1\37\13\3\1\122\7\3\7\0\1\3"+
    "\1\0\1\3\5\0\1\36\1\0\1\3\1\37\13\3"+
    "\1\123\7\3\7\0\1\3\37\74\1\0\6\74\44\0"+
    "\1\124\42\0\2\125\44\0\1\125\5\0\1\101\3\0"+
    "\1\126\3\0\1\101\1\0\23\101\7\0\1\127\5\0"+
    "\1\126\3\0\1\102\1\130\32\0\1\36\1\0\1\103"+
    "\7\0\1\103\1\0\23\103\7\0\1\103\1\0\1\3"+
    "\5\0\1\36\1\0\1\3\1\37\4\3\1\131\16\3"+
    "\7\0\1\3\14\0\1\132\20\0\1\133\11\0\1\3"+
    "\5\0\1\36\1\0\1\3\1\37\5\3\1\134\15\3"+
    "\7\0\1\3\1\0\1\3\5\0\1\36\1\0\1\3"+
    "\1\37\20\3\1\116\2\3\7\0\1\3\1\0\1\3"+
    "\5\0\1\36\1\0\1\3\1\37\6\3\1\65\14\3"+
    "\7\0\1\3\1\0\1\3\5\0\1\36\1\0\1\3"+
    "\1\37\23\3\6\0\1\135\1\3\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\10\3\1\66\12\3\7\0"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\1\3\1\116\21\3\7\0\1\3\21\0\1\136\4\0"+
    "\1\137\1\140\4\0\1\141\12\0\1\3\5\0\1\36"+
    "\1\0\1\3\1\37\23\3\6\0\1\142\1\3\1\0"+
    "\1\3\5\0\1\36\1\0\1\3\1\37\6\3\1\143"+
    "\14\3\7\0\1\3\1\0\1\3\5\0\1\36\1\0"+
    "\1\3\1\37\16\3\1\116\4\3\7\0\1\3\1\0"+
    "\1\3\5\0\1\36\1\0\1\3\1\37\13\3\1\60"+
    "\7\3\7\0\1\3\1\0\1\3\5\0\1\36\1\0"+
    "\1\3\1\37\11\3\1\144\11\3\7\0\1\3\1\0"+
    "\1\3\5\0\1\36\1\0\1\3\1\37\5\3\1\145"+
    "\15\3\7\0\1\3\42\0\2\125\11\0\1\146\37\0"+
    "\1\101\3\0\1\126\3\0\1\147\1\0\23\101\7\0"+
    "\1\127\11\0\1\150\35\0\1\3\5\0\1\36\1\0"+
    "\1\3\1\37\5\3\1\151\15\3\7\0\1\3\15\0"+
    "\1\152\60\0\1\153\16\0\1\3\5\0\1\36\1\0"+
    "\1\3\1\37\6\3\1\154\14\3\7\0\1\3\14\0"+
    "\1\132\5\0\1\155\12\0\1\156\30\0\1\157\47\0"+
    "\1\160\46\0\1\157\57\0\1\161\24\0\1\162\2\0"+
    "\1\163\1\164\1\0\1\165\2\0\1\166\1\167\1\170"+
    "\4\0\1\171\12\0\1\3\5\0\1\36\1\0\1\3"+
    "\1\37\23\3\6\0\1\172\1\3\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\14\3\1\173\6\3\7\0"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\6\3\1\174\14\3\7\0\1\3\1\0\1\101\3\0"+
    "\1\126\3\0\1\147\1\130\23\101\7\0\1\127\5\0"+
    "\1\126\3\0\1\150\33\0\1\36\1\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\6\3\1\116\14\3\7\0"+
    "\1\3\26\0\1\175\20\0\1\3\5\0\1\36\1\0"+
    "\1\3\1\37\10\3\1\176\12\3\7\0\1\3\15\0"+
    "\1\177\60\0\1\200\51\0\1\201\37\0\1\202\34\0"+
    "\1\203\45\0\1\204\45\0\1\205\50\0\1\206\42\0"+
    "\1\207\62\0\1\210\43\0\1\211\41\0\1\212\42\0"+
    "\1\136\5\0\1\140\4\0\1\141\12\0\1\3\5\0"+
    "\1\36\1\0\1\3\1\37\15\3\1\213\5\3\7\0"+
    "\1\3\1\0\1\3\5\0\1\36\1\0\1\3\1\37"+
    "\23\3\6\0\1\214\1\3\20\0\1\215\26\0\1\3"+
    "\5\0\1\36\1\0\1\3\1\37\17\3\1\116\3\3"+
    "\7\0\1\3\31\0\1\152\42\0\1\216\40\0\1\160"+
    "\50\0\1\217\37\0\1\220\44\0\1\221\62\0\1\222"+
    "\30\0\1\223\56\0\1\224\43\0\1\225\44\0\1\226"+
    "\53\0\1\227\15\0\1\3\5\0\1\36\1\0\1\3"+
    "\1\37\23\3\6\0\1\230\1\3\14\0\1\132\20\0"+
    "\1\231\31\0\1\232\44\0\1\233\54\0\1\234\35\0"+
    "\1\235\46\0\1\236\60\0\1\225\35\0\1\210\36\0"+
    "\1\225\62\0\1\225\42\0\1\205\40\0\1\136\4\0"+
    "\1\137\1\237\4\0\1\141\41\0\1\240\52\0\1\241"+
    "\31\0\1\242\54\0\1\160\35\0\1\243\46\0\1\244"+
    "\47\0\1\245\50\0\1\246\47\0\1\247\31\0\1\250"+
    "\52\0\1\225\47\0\1\251\56\0\1\252\31\0\1\253"+
    "\53\0\1\254\34\0\1\255\62\0\1\225\34\0\1\256"+
    "\45\0\1\152\44\0\1\257\71\0\1\260\30\0\1\261"+
    "\37\0\1\255\46\0\1\155\46\0\1\262\56\0\1\263"+
    "\32\0\1\264\70\0\1\265\27\0\1\137\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6080];
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
    "\1\0\1\11\3\1\1\11\22\1\2\11\3\1\2\0"+
    "\1\11\1\1\7\11\3\1\1\11\1\0\20\1\1\11"+
    "\4\0\3\1\1\0\6\1\1\0\6\1\2\0\1\11"+
    "\2\0\1\1\2\0\1\1\6\0\3\1\1\11\2\0"+
    "\1\1\1\11\1\0\1\1\3\0\1\11\12\0\2\1"+
    "\1\0\1\1\14\0\1\1\11\0\1\11\40\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[181];
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

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 108) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 25: 
          { lexeme=yytext(); return TD;
          }
        case 31: break;
        case 10: 
          { lexeme=yytext(); return OR;
          }
        case 32: break;
        case 19: 
          { lexeme=yytext(); return ERROR1;
          }
        case 33: break;
        case 28: 
          { lexeme=yytext(); return ERROR20;
          }
        case 34: break;
        case 14: 
          { lexeme=yytext(); return ERROR7;
          }
        case 35: break;
        case 6: 
          { return AS;
          }
        case 36: break;
        case 15: 
          { lexeme=yytext(); return ERROR12;
          }
        case 37: break;
        case 11: 
          { lexeme=yytext(); return ERROR15;
          }
        case 38: break;
        case 4: 
          { lexeme=yytext(); return DEL;
          }
        case 39: break;
        case 27: 
          { lexeme=yytext(); return ERROR18;
          }
        case 40: break;
        case 20: 
          { lexeme=yytext(); return ERROR2;
          }
        case 41: break;
        case 18: 
          { lexeme=yytext(); return ERROR10;
          }
        case 42: break;
        case 24: 
          { lexeme=yytext(); return IC;
          }
        case 43: break;
        case 9: 
          { lexeme=yytext(); return JPM;
          }
        case 44: break;
        case 12: 
          { lexeme=yytext(); return ERROR16;
          }
        case 45: break;
        case 29: 
          { lexeme=yytext(); return ERROR19;
          }
        case 46: break;
        case 23: 
          { lexeme=yytext(); return IR;
          }
        case 47: break;
        case 8: 
          { lexeme=yytext(); return CNE;
          }
        case 48: break;
        case 26: 
          { lexeme=yytext(); return ER2;
          }
        case 49: break;
        case 21: 
          { lexeme=yytext(); return ERROR3;
          }
        case 50: break;
        case 22: 
          { lexeme=yytext(); return ERROR6;
          }
        case 51: break;
        case 16: 
          { lexeme=yytext(); return ERROR9;
          }
        case 52: break;
        case 1: 
          { return ERROR;
          }
        case 53: break;
        case 7: 
          { return OA;
          }
        case 54: break;
        case 3: 
          { /*Ignore*/
          }
        case 55: break;
        case 5: 
          { lexeme=yytext(); return SEP;
          }
        case 56: break;
        case 17: 
          { lexeme=yytext(); return ERROR11;
          }
        case 57: break;
        case 13: 
          { lexeme=yytext(); return ERROR14;
          }
        case 58: break;
        case 2: 
          { lexeme=yytext(); return ID;
          }
        case 59: break;
        case 30: 
          { lexeme=yytext(); return ERROR17;
          }
        case 60: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

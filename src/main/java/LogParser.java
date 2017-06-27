// Generated from Log.g4 by ANTLR 4.7

       import java.text.ParseException;
	   import java.text.SimpleDateFormat;
	   import java.util.*;

	   import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
	   import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Slash=10, INT=11, ID=12, NEWLINE=13;
	public static final int
		RULE_log = 0, RULE_statmenet = 1, RULE_address = 2, RULE_protocol = 3, 
		RULE_date = 4, RULE_ip = 5;
	public static final String[] ruleNames = {
		"log", "statmenet", "address", "protocol", "date", "ip"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' - '", "' ['", "'+ '", "' -'", "'] \"'", "' '", "'\" '", "'.'", 
		"':'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Slash", "INT", 
		"ID", "NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Log.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public static List<Client> clients = new ArrayList<Client>();

	public static List<Client> getClients(){
		return clients;
	}
	public LogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LogContext extends ParserRuleContext {
		public List<StatmenetContext> statmenet() {
			return getRuleContexts(StatmenetContext.class);
		}
		public StatmenetContext statmenet(int i) {
			return getRuleContext(StatmenetContext.class,i);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException, ParseException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statmenet();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatmenetContext extends ParserRuleContext {
		public IpContext ip;
		public Token name;
		public DateContext date;
		public Token type;
		public Token codeReturned;
		public IpContext ip() {
			return getRuleContext(IpContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(LogParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogParser.INT, i);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public ProtocolContext protocol() {
			return getRuleContext(ProtocolContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LogParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(LogParser.NEWLINE, 0); }
		public StatmenetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statmenet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterStatmenet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitStatmenet(this);
		}
	}

	public final StatmenetContext statmenet() throws RecognitionException, ParseException {
		StatmenetContext _localctx = new StatmenetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statmenet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			((StatmenetContext)_localctx).ip = ip();
			setState(18);
			match(T__0);
			setState(19);
			((StatmenetContext)_localctx).name = match(ID);
			setState(20);
			match(T__1);
			setState(21);
			((StatmenetContext)_localctx).date = date();
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(23);
			match(INT);
			setState(24);
			match(T__4);
			setState(25);
			((StatmenetContext)_localctx).type = match(ID);
			setState(26);
			match(T__5);
			setState(27);
			address();
			setState(28);
			match(T__5);
			setState(29);
			protocol();
			setState(30);
			match(T__6);
			setState(31);
			((StatmenetContext)_localctx).codeReturned = match(INT);
			setState(32);
			match(T__5);
			setState(33);
			match(INT);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(34);
				match(NEWLINE);
				}
			}

				Client client = new Client();
				client.setIp(((StatmenetContext)_localctx).ip.value);
				String dateString = String.valueOf(((StatmenetContext)_localctx).date.value);
				Date date = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH).parse(dateString);
				client.setDate(date);
				client.setMethodQueryHTTP(String.valueOf((((StatmenetContext)_localctx).type!=null?((StatmenetContext)_localctx).type.getText():null)));
				client.setCodeReturned(Integer.parseInt(String.valueOf((((StatmenetContext)_localctx).codeReturned!=null?((StatmenetContext)_localctx).codeReturned.getText():null))));
				clients.add(client);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LogParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(LogParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogParser.ID, i);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_address);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << Slash) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==Slash) {
					{
					{
					setState(39);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==Slash) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(45);
						_la = _input.LA(1);
						if ( !(_la==INT || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(48); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LogParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(LogParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogParser.ID, i);
		}
		public ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterProtocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitProtocol(this);
		}
	}

	public final ProtocolContext protocol() throws RecognitionException {
		ProtocolContext _localctx = new ProtocolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_protocol);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << Slash) | (1L << INT) | (1L << ID))) != 0)) {
				{
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==Slash) {
					{
					{
					setState(55);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==Slash) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(61);
						_la = _input.LA(1);
						if ( !(_la==INT || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(64); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public String value;
		public Token i1;
		public Token i2;
		public Token i3;
		public Token i4;
		public Token i5;
		public Token i6;
		public List<TerminalNode> INT() { return getTokens(LogParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogParser.INT, i);
		}
		public TerminalNode ID() { return getToken(LogParser.ID, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((DateContext)_localctx).i1 = match(INT);
			((DateContext)_localctx).value =  (((DateContext)_localctx).i1!=null?((DateContext)_localctx).i1.getText():null)+"/";
			setState(73);
			match(Slash);
			setState(74);
			((DateContext)_localctx).i2 = match(ID);
			_localctx.value += (((DateContext)_localctx).i2!=null?((DateContext)_localctx).i2.getText():null)+"/";
			setState(76);
			match(Slash);
			setState(77);
			((DateContext)_localctx).i3 = match(INT);
			_localctx.value += (((DateContext)_localctx).i3!=null?((DateContext)_localctx).i3.getText():null)+":";
			setState(79);
			match(T__8);
			setState(80);
			((DateContext)_localctx).i4 = match(INT);
			_localctx.value += (((DateContext)_localctx).i4!=null?((DateContext)_localctx).i4.getText():null)+":";
			setState(82);
			match(T__8);
			setState(83);
			((DateContext)_localctx).i5 = match(INT);
			_localctx.value += (((DateContext)_localctx).i5!=null?((DateContext)_localctx).i5.getText():null)+":";
			setState(85);
			match(T__8);
			setState(86);
			((DateContext)_localctx).i6 = match(INT);
			_localctx.value += (((DateContext)_localctx).i6!=null?((DateContext)_localctx).i6.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IpContext extends ParserRuleContext {
		public String value;
		public Token i1;
		public Token i2;
		public Token i3;
		public Token i4;
		public List<TerminalNode> INT() { return getTokens(LogParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LogParser.INT, i);
		}
		public IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).enterIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogListener ) ((LogListener)listener).exitIp(this);
		}
	}

	public final IpContext ip() throws RecognitionException {
		IpContext _localctx = new IpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((IpContext)_localctx).i1 = match(INT);
			((IpContext)_localctx).value =  (((IpContext)_localctx).i1!=null?((IpContext)_localctx).i1.getText():null)+".";
			setState(91);
			match(T__7);
			setState(92);
			((IpContext)_localctx).i2 = match(INT);
			_localctx.value += (((IpContext)_localctx).i2!=null?((IpContext)_localctx).i2.getText():null)+".";
			setState(94);
			match(T__7);
			setState(95);
			((IpContext)_localctx).i3 = match(INT);
			_localctx.value += (((IpContext)_localctx).i3!=null?((IpContext)_localctx).i3.getText():null)+".";
			setState(97);
			match(T__7);
			setState(98);
			((IpContext)_localctx).i4 = match(INT);
			_localctx.value += (((IpContext)_localctx).i4!=null?((IpContext)_localctx).i4.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&"+
		"\n\3\3\3\3\3\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\6\4\61\n\4\r\4\16\4\62\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\6\5A\n\5\r\5"+
		"\16\5B\7\5E\n\5\f\5\16\5H\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\5\3\2\5\6\4\2\n\n\f\f\3\2\r\16\2i\2"+
		"\17\3\2\2\2\4\23\3\2\2\2\6\66\3\2\2\2\bF\3\2\2\2\nI\3\2\2\2\f[\3\2\2\2"+
		"\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2"+
		"\22\3\3\2\2\2\23\24\5\f\7\2\24\25\7\3\2\2\25\26\7\16\2\2\26\27\7\4\2\2"+
		"\27\30\5\n\6\2\30\31\t\2\2\2\31\32\7\r\2\2\32\33\7\7\2\2\33\34\7\16\2"+
		"\2\34\35\7\b\2\2\35\36\5\6\4\2\36\37\7\b\2\2\37 \5\b\5\2 !\7\t\2\2!\""+
		"\7\r\2\2\"#\7\b\2\2#%\7\r\2\2$&\7\17\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2"+
		"\2\'(\b\3\1\2(\5\3\2\2\2)+\t\3\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2"+
		"\2\2-\60\3\2\2\2.,\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64,\3\2\2\2\658\3\2\2\2\66\64\3\2"+
		"\2\2\66\67\3\2\2\2\67\7\3\2\2\28\66\3\2\2\29;\t\3\2\2:9\3\2\2\2;>\3\2"+
		"\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?A\t\4\2\2@?\3\2\2\2AB\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2D<\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2G\t\3\2\2\2HF\3\2\2\2IJ\7\r\2\2JK\b\6\1\2KL\7\f\2\2LM\7\16\2\2MN\b"+
		"\6\1\2NO\7\f\2\2OP\7\r\2\2PQ\b\6\1\2QR\7\13\2\2RS\7\r\2\2ST\b\6\1\2TU"+
		"\7\13\2\2UV\7\r\2\2VW\b\6\1\2WX\7\13\2\2XY\7\r\2\2YZ\b\6\1\2Z\13\3\2\2"+
		"\2[\\\7\r\2\2\\]\b\7\1\2]^\7\n\2\2^_\7\r\2\2_`\b\7\1\2`a\7\n\2\2ab\7\r"+
		"\2\2bc\b\7\1\2cd\7\n\2\2de\7\r\2\2ef\b\7\1\2f\r\3\2\2\2\n\21%,\62\66<"+
		"BF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
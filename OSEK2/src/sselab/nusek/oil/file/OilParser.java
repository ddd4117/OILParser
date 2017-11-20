package sselab.nusek.oil.file;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
// Generated from .\Oil.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import sselab.nusek.oil.InvalidOilException;
import sselab.nusek.oil.OilObject;
import sselab.nusek.oil.OilSpec;
import sselab.nusek.oil.file.parserControl.OilParserControl;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	
	/* Need for Parsing */
	private OilObject currentObject;
	public String _Name = "";
	//public Queue attr_list = new LinkedList();
	/** flag == false is Not List, flag == true is parameter list */
	//static boolean flag = false;
	private OilSpec oil = new OilSpec();
	private OilParserControl ctl = new OilParserControl();
	public OilSpec getOil() {
		return oil;
	}

	public void setOil(OilSpec oil) {
		this.oil = oil;
	}

	
	public OilParserControl getCtl() {
		return ctl;
	}

	public void setCtl(OilParserControl ctl) {
		this.ctl = ctl;
	}
	
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, HEX_NUMBER=54, NAME=55, DIGIT=56, STRING=57, WS=58, COMMENT=59, 
		LINE_COMMENT=60;
	public static final int
		RULE_parse = 0, RULE_oil_version = 1, RULE_version = 2, RULE_application_definition = 3, 
		RULE_object_definition_list = 4, RULE_object_definition = 5, RULE_object_name = 6, 
		RULE_implementation_definition = 7, RULE_implementation_spec_list = 8, 
		RULE_implementation_spec = 9, RULE_object = 10, RULE_implementation_list = 11, 
		RULE_implementation_def = 12, RULE_impl_attr_def = 13, RULE_impl_parameter_list = 14, 
		RULE_impl_def_list = 15, RULE_auto_specifier = 16, RULE_number_range = 17, 
		RULE_number_list = 18, RULE_default_number = 19, RULE_float_range = 20, 
		RULE_default_float = 21, RULE_enumeration = 22, RULE_enumerator_list = 23, 
		RULE_enumerator = 24, RULE_bool_values = 25, RULE_default_Namedef = 26, 
		RULE_default_string = 27, RULE_default_bool = 28, RULE_description = 29, 
		RULE_impl_ref_def = 30, RULE_object_ref_type = 31, RULE_reference_Namedef = 32, 
		RULE_multiple_specifier = 33, RULE_parameter_list = 34, RULE_parameter = 35, 
		RULE_attribute_Namedef = 36, RULE_attribute_value = 37, RULE_bool = 38, 
		RULE_number = 39, RULE_dec_number = 40, RULE_sign = 41, RULE_float_num = 42, 
		RULE_exponent = 43, RULE_dec_digits = 44;
	public static final String[] ruleNames = {
		"parse", "oil_version", "version", "application_definition", "object_definition_list", 
		"object_definition", "object_name", "implementation_definition", "implementation_spec_list", 
		"implementation_spec", "object", "implementation_list", "implementation_def", 
		"impl_attr_def", "impl_parameter_list", "impl_def_list", "auto_specifier", 
		"number_range", "number_list", "default_number", "float_range", "default_float", 
		"enumeration", "enumerator_list", "enumerator", "bool_values", "default_Namedef", 
		"default_string", "default_bool", "description", "impl_ref_def", "object_ref_type", 
		"reference_Namedef", "multiple_specifier", "parameter_list", "parameter", 
		"attribute_Namedef", "attribute_value", "bool", "number", "dec_number", 
		"sign", "float_num", "exponent", "dec_digits"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'OIL_VERSION'", "'='", "';'", "'CPU'", "'{'", "'}'", "'IMPLEMENTATION'", 
		"'OS'", "'TASK'", "'COUNTER'", "'ALARM'", "'RESOURCE'", "'EVENT'", "'ISR'", 
		"'MESSAGE'", "'COM'", "'NM'", "'APPMODE'", "'IPDU'", "'UINT32'", "'INT32'", 
		"'UINT64'", "'INT64'", "'FLOAT'", "'ENUM'", "'STRING'", "'BOOLEAN'", "'WITH_AUTO'", 
		"'['", "']'", "','", "'NO_DEFAULT'", "'AUTO'", "'TRUE'", "'FALSE'", "':'", 
		"'OS_TYPE'", "'TASK_TYPE'", "'COUNTER+TYPE'", "'ALARM_TYPE'", "'RESOURCE_TYPE'", 
		"'EVENT_TYPE'", "'ISR_TYPE'", "'MESSAGE_TYPE'", "'COM_TYPE'", "'NM_TYPE'", 
		"'APPMODE_TYPE'", "'IPDU_TYPE'", "'+'", "'-'", "'.'", "'e'", "'E'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "HEX_NUMBER", "NAME", "DIGIT", "STRING", 
		"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Oil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }
	
	public OilParser(OilLexer input)
	{
		super(new CommonTokenStream(input));
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
		
	}
	
	public OilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Oil_versionContext oil_version() {
			return getRuleContext(Oil_versionContext.class,0);
		}
		public Implementation_definitionContext implementation_definition() {
			return getRuleContext(Implementation_definitionContext.class,0);
		}
		public Application_definitionContext application_definition() {
			return getRuleContext(Application_definitionContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			oil_version();
			setState(91);
			implementation_definition();
			setState(92);
			application_definition();
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
		
		/** After Parsing, Call this method */
		ctl.finailize(oil); 
		return _localctx;
	}

	public static class Oil_versionContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Oil_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oil_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterOil_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitOil_version(this);
		}
	}

	public final Oil_versionContext oil_version() throws RecognitionException {
		Oil_versionContext _localctx = new Oil_versionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_oil_version);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__0);
				setState(95);
				match(T__1);
				setState(96);
				version();
				setState(97);
				description();
				setState(98);
				match(T__2);
				}
				break;
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OilParser.STRING, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(STRING);
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

	public static class Application_definitionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public Object_definition_listContext object_definition_list() {
			return getRuleContext(Object_definition_listContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Application_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterApplication_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitApplication_definition(this);
		}
	}

	public final Application_definitionContext application_definition() throws RecognitionException {
		Application_definitionContext _localctx = new Application_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_application_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__3);
			setState(106);
			try {
				/** set CPU name in application_definition */
				oil.setCpuName(this.getCurrentToken().getText());
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			match(NAME);
			setState(107);
			match(T__4);
			setState(108);
			object_definition_list(0);
			setState(109);
			match(T__5);
			setState(110);
			description();
			setState(111);
			match(T__2);
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

	public static class Object_definition_listContext extends ParserRuleContext {
		public Object_definitionContext object_definition() {
			return getRuleContext(Object_definitionContext.class,0);
		}
		public Object_definition_listContext object_definition_list() {
			return getRuleContext(Object_definition_listContext.class,0);
		}
		public Object_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_definition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterObject_definition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitObject_definition_list(this);
		}
	}

	public final Object_definition_listContext object_definition_list() throws RecognitionException {
		return object_definition_list(0);
	}

	private Object_definition_listContext object_definition_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Object_definition_listContext _localctx = new Object_definition_listContext(_ctx, _parentState);
		Object_definition_listContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_object_definition_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			object_definition();
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Object_definition_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_object_definition_list);
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					object_definition();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Object_definitionContext extends ParserRuleContext {
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Object_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterObject_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitObject_definition(this);
		}
	}

	public final Object_definitionContext object_definition() throws RecognitionException {
		Object_definitionContext _localctx = new Object_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_object_definition);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				object_name();
				setState(124);
				match(T__4);
				setState(125);
				parameter_list(0);
				setState(126);
				match(T__5);
				setState(127);
				description();
				setState(128);
				match(T__2);
				ctl.finalizeOilObjCreation(currentObject, oil);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				object_name();
				setState(131);
				description();
				setState(132);
				match(T__2);
				ctl.finalizeOilObjCreation(currentObject, oil);
				}
				break;
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

	public static class Object_nameContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public Object_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterObject_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitObject_name(this);
		}
	}

	public final Object_nameContext object_name() throws RecognitionException {
		Object_nameContext _localctx = new Object_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			currentObject = ctl.makeObject(this.getCurrentToken().getText());
			object();
			setState(137);
			try {
				currentObject.setName(this.getCurrentToken().getText());
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			match(NAME);
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

	public static class Implementation_definitionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public Implementation_spec_listContext implementation_spec_list() {
			return getRuleContext(Implementation_spec_listContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Implementation_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImplementation_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImplementation_definition(this);
		}
	}

	public final Implementation_definitionContext implementation_definition() throws RecognitionException {
		Implementation_definitionContext _localctx = new Implementation_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_implementation_definition);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__6);
				setState(140);
				match(NAME);
				setState(141);
				match(T__4);
				setState(142);
				implementation_spec_list(0);
				setState(143);
				match(T__5);
				setState(144);
				description();
				setState(145);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Implementation_spec_listContext extends ParserRuleContext {
		public Implementation_specContext implementation_spec() {
			return getRuleContext(Implementation_specContext.class,0);
		}
		public Implementation_spec_listContext implementation_spec_list() {
			return getRuleContext(Implementation_spec_listContext.class,0);
		}
		public Implementation_spec_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_spec_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImplementation_spec_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImplementation_spec_list(this);
		}
	}

	public final Implementation_spec_listContext implementation_spec_list() throws RecognitionException {
		return implementation_spec_list(0);
	}

	private Implementation_spec_listContext implementation_spec_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Implementation_spec_listContext _localctx = new Implementation_spec_listContext(_ctx, _parentState);
		Implementation_spec_listContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_implementation_spec_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			implementation_spec();
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Implementation_spec_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implementation_spec_list);
					setState(153);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(154);
					implementation_spec();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Implementation_specContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Implementation_listContext implementation_list() {
			return getRuleContext(Implementation_listContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Implementation_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImplementation_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImplementation_spec(this);
		}
	}

	public final Implementation_specContext implementation_spec() throws RecognitionException {
		Implementation_specContext _localctx = new Implementation_specContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_implementation_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			
			setState(160);
			object();
			setState(161);
			match(T__4);
			setState(162);
			implementation_list(0);
			setState(163);
			match(T__5);
			setState(164);
			description();
			setState(165);
			match(T__2);
			ctl.finalizeOilObjCreation(currentObject, oil);
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

	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Implementation_listContext extends ParserRuleContext {
		public Implementation_defContext implementation_def() {
			return getRuleContext(Implementation_defContext.class,0);
		}
		public Implementation_listContext implementation_list() {
			return getRuleContext(Implementation_listContext.class,0);
		}
		public Implementation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImplementation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImplementation_list(this);
		}
	}

	public final Implementation_listContext implementation_list() throws RecognitionException {
		return implementation_list(0);
	}

	private Implementation_listContext implementation_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Implementation_listContext _localctx = new Implementation_listContext(_ctx, _parentState);
		Implementation_listContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_implementation_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			implementation_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Implementation_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implementation_list);
					setState(172);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(173);
					implementation_def();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Implementation_defContext extends ParserRuleContext {
		public Impl_attr_defContext impl_attr_def() {
			return getRuleContext(Impl_attr_defContext.class,0);
		}
		public Impl_ref_defContext impl_ref_def() {
			return getRuleContext(Impl_ref_defContext.class,0);
		}
		public Implementation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImplementation_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImplementation_def(this);
		}
	}

	public final Implementation_defContext implementation_def() throws RecognitionException {
		Implementation_defContext _localctx = new Implementation_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_implementation_def);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				impl_attr_def();
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				impl_ref_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Impl_attr_defContext extends ParserRuleContext {
		public Auto_specifierContext auto_specifier() {
			return getRuleContext(Auto_specifierContext.class,0);
		}
		public Number_rangeContext number_range() {
			return getRuleContext(Number_rangeContext.class,0);
		}
		public Attribute_NamedefContext attribute_Namedef() {
			return getRuleContext(Attribute_NamedefContext.class,0);
		}
		public Multiple_specifierContext multiple_specifier() {
			return getRuleContext(Multiple_specifierContext.class,0);
		}
		public Default_numberContext default_number() {
			return getRuleContext(Default_numberContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Float_rangeContext float_range() {
			return getRuleContext(Float_rangeContext.class,0);
		}
		public Default_floatContext default_float() {
			return getRuleContext(Default_floatContext.class,0);
		}
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public Default_NamedefContext default_Namedef() {
			return getRuleContext(Default_NamedefContext.class,0);
		}
		public Default_stringContext default_string() {
			return getRuleContext(Default_stringContext.class,0);
		}
		public Bool_valuesContext bool_values() {
			return getRuleContext(Bool_valuesContext.class,0);
		}
		public Default_boolContext default_bool() {
			return getRuleContext(Default_boolContext.class,0);
		}
		public Impl_attr_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_attr_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImpl_attr_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImpl_attr_def(this);
		}
	}

	public final Impl_attr_defContext impl_attr_def() throws RecognitionException {
		Impl_attr_defContext _localctx = new Impl_attr_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_impl_attr_def);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__19);
				setState(184);
				auto_specifier();
				setState(185);
				number_range();
				setState(186);
				attribute_Namedef();
				setState(187);
				multiple_specifier();
				setState(188);
				default_number();
				setState(189);
				description();
				setState(190);
				match(T__2);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__20);
				setState(193);
				auto_specifier();
				setState(194);
				number_range();
				setState(195);
				attribute_Namedef();
				setState(196);
				multiple_specifier();
				setState(197);
				default_number();
				setState(198);
				description();
				setState(199);
				match(T__2);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(T__21);
				setState(202);
				auto_specifier();
				setState(203);
				number_range();
				setState(204);
				attribute_Namedef();
				setState(205);
				multiple_specifier();
				setState(206);
				default_number();
				setState(207);
				description();
				setState(208);
				match(T__2);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(T__22);
				setState(211);
				auto_specifier();
				setState(212);
				number_range();
				setState(213);
				attribute_Namedef();
				setState(214);
				multiple_specifier();
				setState(215);
				default_number();
				setState(216);
				description();
				setState(217);
				match(T__2);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(T__23);
				setState(220);
				auto_specifier();
				setState(221);
				float_range();
				setState(222);
				attribute_Namedef();
				setState(223);
				multiple_specifier();
				setState(224);
				default_float();
				setState(225);
				description();
				setState(226);
				match(T__2);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(T__24);
				setState(229);
				auto_specifier();
				setState(230);
				enumeration();
				setState(231);
				attribute_Namedef();
				setState(232);
				multiple_specifier();
				setState(233);
				default_Namedef();
				setState(234);
				description();
				setState(235);
				match(T__2);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				match(T__25);
				setState(238);
				auto_specifier();
				setState(239);
				attribute_Namedef();
				setState(240);
				multiple_specifier();
				setState(241);
				default_string();
				setState(242);
				match(T__2);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				match(T__26);
				setState(245);
				auto_specifier();
				setState(246);
				bool_values();
				setState(247);
				attribute_Namedef();
				setState(248);
				multiple_specifier();
				setState(249);
				default_bool();
				setState(250);
				description();
				setState(251);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Impl_parameter_listContext extends ParserRuleContext {
		public Impl_def_listContext impl_def_list() {
			return getRuleContext(Impl_def_listContext.class,0);
		}
		public Impl_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImpl_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImpl_parameter_list(this);
		}
	}

	public final Impl_parameter_listContext impl_parameter_list() throws RecognitionException {
		Impl_parameter_listContext _localctx = new Impl_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_impl_parameter_list);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__4);
				setState(256);
				impl_def_list();
				setState(257);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class Impl_def_listContext extends ParserRuleContext {
		public Implementation_defContext implementation_def() {
			return getRuleContext(Implementation_defContext.class,0);
		}
		public Impl_def_listContext impl_def_list() {
			return getRuleContext(Impl_def_listContext.class,0);
		}
		public Impl_def_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_def_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImpl_def_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImpl_def_list(this);
		}
	}

	public final Impl_def_listContext impl_def_list() throws RecognitionException {
		Impl_def_listContext _localctx = new Impl_def_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_impl_def_list);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				implementation_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				implementation_def();
				setState(264);
				impl_def_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class Auto_specifierContext extends ParserRuleContext {
		public Auto_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterAuto_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitAuto_specifier(this);
		}
	}

	public final Auto_specifierContext auto_specifier() throws RecognitionException {
		Auto_specifierContext _localctx = new Auto_specifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_auto_specifier);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__27);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__28:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Number_rangeContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class,0);
		}
		public Number_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterNumber_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitNumber_range(this);
		}
	}

	public final Number_rangeContext number_range() throws RecognitionException {
		Number_rangeContext _localctx = new Number_rangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number_range);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__28);
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					number();
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << HEX_NUMBER) | (1L << DIGIT))) != 0) );
				setState(279);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__28);
				setState(282);
				number_list(0);
				setState(283);
				match(T__29);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class Number_listContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class,0);
		}
		public Number_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterNumber_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitNumber_list(this);
		}
	}

	public final Number_listContext number_list() throws RecognitionException {
		return number_list(0);
	}

	private Number_listContext number_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Number_listContext _localctx = new Number_listContext(_ctx, _parentState);
		Number_listContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_number_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			number();
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Number_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_number_list);
					setState(291);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(292);
					match(T__30);
					setState(293);
					number();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Default_numberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Default_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDefault_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDefault_number(this);
		}
	}

	public final Default_numberContext default_number() throws RecognitionException {
		Default_numberContext _localctx = new Default_numberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_default_number);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(T__1);
				setState(300);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__1);
				setState(302);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(T__1);
				setState(304);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class Float_rangeContext extends ParserRuleContext {
		public List<Float_numContext> float_num() {
			return getRuleContexts(Float_numContext.class);
		}
		public Float_numContext float_num(int i) {
			return getRuleContext(Float_numContext.class,i);
		}
		public Float_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterFloat_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitFloat_range(this);
		}
	}

	public final Float_rangeContext float_range() throws RecognitionException {
		Float_rangeContext _localctx = new Float_rangeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_float_range);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(T__28);
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(309);
					float_num();
					}
					}
					setState(312); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << DIGIT))) != 0) );
				setState(314);
				match(T__29);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Default_floatContext extends ParserRuleContext {
		public Float_numContext float_num() {
			return getRuleContext(Float_numContext.class,0);
		}
		public Default_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDefault_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDefault_float(this);
		}
	}

	public final Default_floatContext default_float() throws RecognitionException {
		Default_floatContext _localctx = new Default_floatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_default_float);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(T__1);
				setState(320);
				float_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T__1);
				setState(322);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(T__1);
				setState(324);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class EnumerationContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitEnumeration(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__28);
			setState(329);
			enumerator_list(0);
			setState(330);
			match(T__29);
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

	public static class Enumerator_listContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitEnumerator_list(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		return enumerator_list(0);
	}

	private Enumerator_listContext enumerator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, _parentState);
		Enumerator_listContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_enumerator_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(333);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Enumerator_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumerator_list);
					setState(335);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(336);
					match(T__30);
					setState(337);
					enumerator();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public Impl_parameter_listContext impl_parameter_list() {
			return getRuleContext(Impl_parameter_listContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumerator);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(NAME);
				setState(345);
				impl_parameter_list();
				setState(346);
				description();
				}
				break;
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

	public static class Bool_valuesContext extends ParserRuleContext {
		public List<Impl_parameter_listContext> impl_parameter_list() {
			return getRuleContexts(Impl_parameter_listContext.class);
		}
		public Impl_parameter_listContext impl_parameter_list(int i) {
			return getRuleContext(Impl_parameter_listContext.class,i);
		}
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public Bool_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterBool_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitBool_values(this);
		}
	}

	public final Bool_valuesContext bool_values() throws RecognitionException {
		Bool_valuesContext _localctx = new Bool_valuesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool_values);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__28);
				setState(351);
				match(T__33);
				setState(352);
				impl_parameter_list();
				setState(353);
				description();
				setState(354);
				match(T__30);
				setState(355);
				match(T__34);
				setState(356);
				impl_parameter_list();
				setState(357);
				description();
				setState(358);
				match(T__29);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Default_NamedefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public Default_NamedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_Namedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDefault_Namedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDefault_Namedef(this);
		}
	}

	public final Default_NamedefContext default_Namedef() throws RecognitionException {
		Default_NamedefContext _localctx = new Default_NamedefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_default_Namedef);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(T__1);
				setState(364);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T__1);
				setState(366);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(T__1);
				setState(368);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class Default_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OilParser.STRING, 0); }
		public Default_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDefault_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDefault_string(this);
		}
	}

	public final Default_stringContext default_string() throws RecognitionException {
		Default_stringContext _localctx = new Default_stringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_default_string);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T__1);
				setState(373);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(T__1);
				setState(375);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(T__1);
				setState(377);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class Default_boolContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Default_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDefault_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDefault_bool(this);
		}
	}

	public final Default_boolContext default_bool() throws RecognitionException {
		Default_boolContext _localctx = new Default_boolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_default_bool);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__1);
				setState(382);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T__1);
				setState(384);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(T__1);
				setState(386);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OilParser.STRING, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_description);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(T__35);
				setState(391);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class Impl_ref_defContext extends ParserRuleContext {
		public Object_ref_typeContext object_ref_type() {
			return getRuleContext(Object_ref_typeContext.class,0);
		}
		public Reference_NamedefContext reference_Namedef() {
			return getRuleContext(Reference_NamedefContext.class,0);
		}
		public Multiple_specifierContext multiple_specifier() {
			return getRuleContext(Multiple_specifierContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Impl_ref_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_ref_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterImpl_ref_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitImpl_ref_def(this);
		}
	}

	public final Impl_ref_defContext impl_ref_def() throws RecognitionException {
		Impl_ref_defContext _localctx = new Impl_ref_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_impl_ref_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			object_ref_type();
			setState(396);
			reference_Namedef();
			setState(397);
			multiple_specifier();
			setState(398);
			description();
			setState(399);
			match(T__2);
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

	public static class Object_ref_typeContext extends ParserRuleContext {
		public Object_ref_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_ref_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterObject_ref_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitObject_ref_type(this);
		}
	}

	public final Object_ref_typeContext object_ref_type() throws RecognitionException {
		Object_ref_typeContext _localctx = new Object_ref_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_object_ref_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Reference_NamedefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Reference_NamedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_Namedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterReference_Namedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitReference_Namedef(this);
		}
	}

	public final Reference_NamedefContext reference_Namedef() throws RecognitionException {
		Reference_NamedefContext _localctx = new Reference_NamedefContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_reference_Namedef);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(NAME);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Multiple_specifierContext extends ParserRuleContext {
		public Multiple_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterMultiple_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitMultiple_specifier(this);
		}
	}

	public final Multiple_specifierContext multiple_specifier() throws RecognitionException {
		Multiple_specifierContext _localctx = new Multiple_specifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiple_specifier);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(T__28);
				setState(408);
				match(T__29);
				}
				break;
			case T__1:
			case T__2:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		return parameter_list(0);
	}

	private Parameter_listContext parameter_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, _parentState);
		Parameter_listContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_parameter_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(413);
				parameter();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parameter_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
					setState(417);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(418);
					parameter();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Attribute_NamedefContext attribute_Namedef() {
			return getRuleContext(Attribute_NamedefContext.class,0);
		}
		public Attribute_valueContext attribute_value() {
			return getRuleContext(Attribute_valueContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_Name = this.getCurrentToken().getText();
			attribute_Namedef();
			setState(425);
			match(T__1);
			setState(426);
			attribute_value();
			setState(427);
			description();
			setState(428);
			match(T__2);
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

	public static class Attribute_NamedefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Attribute_NamedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_Namedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterAttribute_Namedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitAttribute_Namedef(this);
		}
	}

	public final Attribute_NamedefContext attribute_Namedef() throws RecognitionException {
		Attribute_NamedefContext _localctx = new Attribute_NamedefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_attribute_Namedef);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(NAME);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Attribute_valueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OilParser.NAME, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Float_numContext float_num() {
			return getRuleContext(Float_numContext.class,0);
		}
		public TerminalNode STRING() { return getToken(OilParser.STRING, 0); }
		public List<Attribute_valueContext> attribute_value() {
			return getRuleContexts(Attribute_valueContext.class);
		}
		public Attribute_valueContext attribute_value(int i) {
			return getRuleContext(Attribute_valueContext.class,i);
		}
		public Attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterAttribute_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitAttribute_value(this);
		}
	}

	public final Attribute_valueContext attribute_value() throws RecognitionException {
		Attribute_valueContext _localctx = new Attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attribute_value);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				try {
					currentObject.addAttribute(_Name, this.getCurrentToken().getText());
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				String value = this.getCurrentToken().getText();
				try {
					currentObject.addAttribute(_Name, value);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				match(NAME);
				setState(436);
				match(T__4);
				setState(437);
				parameter_list(0);
				setState(438);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				try {
					currentObject.addAttribute(_Name, this.getCurrentToken().getText());
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				String value = this.getCurrentToken().getText();
				try {
					currentObject.addAttribute(_Name, value);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bool();
				setState(442);
				match(T__4);
				setState(443);
				parameter_list(0);
				setState(444);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(447); 
				try {
					currentObject.addAttribute(_Name, this.getCurrentToken().getText());
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				float_num();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				try {
					currentObject.addAttribute(_Name, this.getCurrentToken().getText());
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				match(STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				try {
					currentObject.addAttribute(_Name, this.getCurrentToken().getText());
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				match(T__32);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(450);
				match(T__4);
				setState(451);
				attribute_value();
				
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30) {
					{
					{
					setState(452);
					match(T__30);
					setState(453);
					attribute_value();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
				match(T__5);
				}
				break;
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumberContext extends ParserRuleContext {
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public TerminalNode HEX_NUMBER() { return getToken(OilParser.HEX_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_number);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
			case T__49:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				dec_number();
				}
				break;
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				String temp = this.getCurrentToken().getText();
				temp = temp.toUpperCase();
				temp = temp.replaceFirst("^0X", "");
				Integer hex = Integer.parseInt(temp, 16);
				try {
					currentObject.addAttribute(_Name, hex.toString());
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				match(HEX_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Dec_numberContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public Dec_digitsContext dec_digits() {
			return getRuleContext(Dec_digitsContext.class,0);
		}
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDec_number(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dec_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			sign();
			setState(470);
			dec_digits();
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

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sign);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(T__49);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Float_numContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<Dec_digitsContext> dec_digits() {
			return getRuleContexts(Dec_digitsContext.class);
		}
		public Dec_digitsContext dec_digits(int i) {
			return getRuleContext(Dec_digitsContext.class,i);
		}
		public ExponentContext exponent() {
			return getRuleContext(ExponentContext.class,0);
		}
		public Float_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterFloat_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitFloat_num(this);
		}
	}

	public final Float_numContext float_num() throws RecognitionException {
		Float_numContext _localctx = new Float_numContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_float_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			sign();
			setState(478);
			dec_digits();
			setState(479);
			match(T__50);
			setState(480);
			dec_digits();
			setState(481);
			exponent();
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

	public static class ExponentContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public Dec_digitsContext dec_digits() {
			return getRuleContext(Dec_digitsContext.class,0);
		}
		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitExponent(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exponent);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(T__51);
				setState(484);
				sign();
				setState(485);
				dec_digits();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(T__52);
				setState(488);
				sign();
				setState(489);
				dec_digits();
				}
				break;
			case T__2:
			case T__5:
			case T__29:
			case T__30:
			case T__35:
			case T__48:
			case T__49:
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Dec_digitsContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(OilParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(OilParser.DIGIT, i);
		}
		public Dec_digitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).enterDec_digits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OilListener ) ((OilListener)listener).exitDec_digits(this);
		}
	}

	public final Dec_digitsContext dec_digits() throws RecognitionException {
		String temp="";
		Dec_digitsContext _localctx = new Dec_digitsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dec_digits);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(494);
					temp += this.getCurrentToken().getText();
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(497); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			if(this.currentObject != null)
			{
				try {
					currentObject.addAttribute(_Name, temp);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return object_definition_list_sempred((Object_definition_listContext)_localctx, predIndex);
		case 8:
			return implementation_spec_list_sempred((Implementation_spec_listContext)_localctx, predIndex);
		case 11:
			return implementation_list_sempred((Implementation_listContext)_localctx, predIndex);
		case 18:
			return number_list_sempred((Number_listContext)_localctx, predIndex);
		case 23:
			return enumerator_list_sempred((Enumerator_listContext)_localctx, predIndex);
		case 34:
			return parameter_list_sempred((Parameter_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean object_definition_list_sempred(Object_definition_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean implementation_spec_list_sempred(Implementation_spec_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean implementation_list_sempred(Implementation_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean number_list_sempred(Number_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumerator_list_sempred(Enumerator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameter_list_sempred(Parameter_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3h\n\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6y\n\6"+
		"\f\6\16\6|\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0089"+
		"\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0097\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00b1\n\r\f\r\16\r\u00b4"+
		"\13\r\3\16\3\16\5\16\u00b8\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0100\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0107\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u010e\n\21\3\22\3\22\5"+
		"\22\u0112\n\22\3\23\3\23\6\23\u0116\n\23\r\23\16\23\u0117\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u0121\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0129\n\24\f\24\16\24\u012c\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0135\n\25\3\26\3\26\6\26\u0139\n\26\r\26\16\26\u013a\3\26"+
		"\3\26\3\26\5\26\u0140\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0149"+
		"\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0155\n\31"+
		"\f\31\16\31\u0158\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u015f\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016c\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0175\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u017e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0187"+
		"\n\36\3\37\3\37\3\37\5\37\u018c\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\5"+
		"\"\u0198\n\"\3#\3#\3#\5#\u019d\n#\3$\3$\3$\5$\u01a2\n$\3$\3$\7$\u01a6"+
		"\n$\f$\16$\u01a9\13$\3%\3%\3%\3%\3%\3%\3&\3&\5&\u01b3\n&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'"+
		"\u01c9\n\'\f\'\16\'\u01cc\13\'\3\'\3\'\5\'\u01d0\n\'\3(\3(\3)\3)\5)\u01d6"+
		"\n)\3*\3*\3*\3+\3+\3+\5+\u01de\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u01ef\n-\3.\6.\u01f2\n.\r.\16.\u01f3\3.\2\b\n\22\30&\60F"+
		"/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\2\5\3\2\n\25\3\2\'\62\3\2$%\2\u0207\2\\\3\2\2\2\4g\3\2\2\2"+
		"\6i\3\2\2\2\bk\3\2\2\2\ns\3\2\2\2\f\u0088\3\2\2\2\16\u008a\3\2\2\2\20"+
		"\u0096\3\2\2\2\22\u0098\3\2\2\2\24\u00a2\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab"+
		"\3\2\2\2\32\u00b7\3\2\2\2\34\u00ff\3\2\2\2\36\u0106\3\2\2\2 \u010d\3\2"+
		"\2\2\"\u0111\3\2\2\2$\u0120\3\2\2\2&\u0122\3\2\2\2(\u0134\3\2\2\2*\u013f"+
		"\3\2\2\2,\u0148\3\2\2\2.\u014a\3\2\2\2\60\u014e\3\2\2\2\62\u015e\3\2\2"+
		"\2\64\u016b\3\2\2\2\66\u0174\3\2\2\28\u017d\3\2\2\2:\u0186\3\2\2\2<\u018b"+
		"\3\2\2\2>\u018d\3\2\2\2@\u0193\3\2\2\2B\u0197\3\2\2\2D\u019c\3\2\2\2F"+
		"\u01a1\3\2\2\2H\u01aa\3\2\2\2J\u01b2\3\2\2\2L\u01cf\3\2\2\2N\u01d1\3\2"+
		"\2\2P\u01d5\3\2\2\2R\u01d7\3\2\2\2T\u01dd\3\2\2\2V\u01df\3\2\2\2X\u01ee"+
		"\3\2\2\2Z\u01f1\3\2\2\2\\]\5\4\3\2]^\5\20\t\2^_\5\b\5\2_\3\3\2\2\2`a\7"+
		"\3\2\2ab\7\4\2\2bc\5\6\4\2cd\5<\37\2de\7\5\2\2eh\3\2\2\2fh\3\2\2\2g`\3"+
		"\2\2\2gf\3\2\2\2h\5\3\2\2\2ij\7;\2\2j\7\3\2\2\2kl\7\6\2\2lm\79\2\2mn\7"+
		"\7\2\2no\5\n\6\2op\7\b\2\2pq\5<\37\2qr\7\5\2\2r\t\3\2\2\2st\b\6\1\2tu"+
		"\5\f\7\2uz\3\2\2\2vw\f\3\2\2wy\5\f\7\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z"+
		"{\3\2\2\2{\13\3\2\2\2|z\3\2\2\2}~\5\16\b\2~\177\7\7\2\2\177\u0080\5F$"+
		"\2\u0080\u0081\7\b\2\2\u0081\u0082\5<\37\2\u0082\u0083\7\5\2\2\u0083\u0089"+
		"\3\2\2\2\u0084\u0085\5\16\b\2\u0085\u0086\5<\37\2\u0086\u0087\7\5\2\2"+
		"\u0087\u0089\3\2\2\2\u0088}\3\2\2\2\u0088\u0084\3\2\2\2\u0089\r\3\2\2"+
		"\2\u008a\u008b\5\26\f\2\u008b\u008c\79\2\2\u008c\17\3\2\2\2\u008d\u008e"+
		"\7\t\2\2\u008e\u008f\79\2\2\u008f\u0090\7\7\2\2\u0090\u0091\5\22\n\2\u0091"+
		"\u0092\7\b\2\2\u0092\u0093\5<\37\2\u0093\u0094\7\5\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\21\3\2\2\2\u0098\u0099\b\n\1\2\u0099\u009a\5\24\13\2\u009a\u009f\3\2"+
		"\2\2\u009b\u009c\f\4\2\2\u009c\u009e\5\24\13\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\23\3\2\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\7\7\2\2\u00a4"+
		"\u00a5\5\30\r\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5<\37\2\u00a7\u00a8\7"+
		"\5\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ac"+
		"\b\r\1\2\u00ac\u00ad\5\32\16\2\u00ad\u00b2\3\2\2\2\u00ae\u00af\f\3\2\2"+
		"\u00af\u00b1\5\32\16\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b8\5\34\17\2\u00b6\u00b8\5> \2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\5\"\22\2\u00bb"+
		"\u00bc\5$\23\2\u00bc\u00bd\5J&\2\u00bd\u00be\5D#\2\u00be\u00bf\5(\25\2"+
		"\u00bf\u00c0\5<\37\2\u00c0\u00c1\7\5\2\2\u00c1\u0100\3\2\2\2\u00c2\u00c3"+
		"\7\27\2\2\u00c3\u00c4\5\"\22\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\5J&\2\u00c6"+
		"\u00c7\5D#\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\5<\37\2\u00c9\u00ca\7\5\2"+
		"\2\u00ca\u0100\3\2\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\5\"\22\2\u00cd"+
		"\u00ce\5$\23\2\u00ce\u00cf\5J&\2\u00cf\u00d0\5D#\2\u00d0\u00d1\5(\25\2"+
		"\u00d1\u00d2\5<\37\2\u00d2\u00d3\7\5\2\2\u00d3\u0100\3\2\2\2\u00d4\u00d5"+
		"\7\31\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\5$\23\2\u00d7\u00d8\5J&\2\u00d8"+
		"\u00d9\5D#\2\u00d9\u00da\5(\25\2\u00da\u00db\5<\37\2\u00db\u00dc\7\5\2"+
		"\2\u00dc\u0100\3\2\2\2\u00dd\u00de\7\32\2\2\u00de\u00df\5\"\22\2\u00df"+
		"\u00e0\5*\26\2\u00e0\u00e1\5J&\2\u00e1\u00e2\5D#\2\u00e2\u00e3\5,\27\2"+
		"\u00e3\u00e4\5<\37\2\u00e4\u00e5\7\5\2\2\u00e5\u0100\3\2\2\2\u00e6\u00e7"+
		"\7\33\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\5.\30\2\u00e9\u00ea\5J&\2\u00ea"+
		"\u00eb\5D#\2\u00eb\u00ec\5\66\34\2\u00ec\u00ed\5<\37\2\u00ed\u00ee\7\5"+
		"\2\2\u00ee\u0100\3\2\2\2\u00ef\u00f0\7\34\2\2\u00f0\u00f1\5\"\22\2\u00f1"+
		"\u00f2\5J&\2\u00f2\u00f3\5D#\2\u00f3\u00f4\58\35\2\u00f4\u00f5\7\5\2\2"+
		"\u00f5\u0100\3\2\2\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9"+
		"\5\64\33\2\u00f9\u00fa\5J&\2\u00fa\u00fb\5D#\2\u00fb\u00fc\5:\36\2\u00fc"+
		"\u00fd\5<\37\2\u00fd\u00fe\7\5\2\2\u00fe\u0100\3\2\2\2\u00ff\u00b9\3\2"+
		"\2\2\u00ff\u00c2\3\2\2\2\u00ff\u00cb\3\2\2\2\u00ff\u00d4\3\2\2\2\u00ff"+
		"\u00dd\3\2\2\2\u00ff\u00e6\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f6\3\2"+
		"\2\2\u0100\35\3\2\2\2\u0101\u0102\7\7\2\2\u0102\u0103\5 \21\2\u0103\u0104"+
		"\7\b\2\2\u0104\u0107\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\37\3\2\2\2\u0108\u010e\5\32\16\2\u0109\u010a\5\32"+
		"\16\2\u010a\u010b\5 \21\2\u010b\u010e\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010c\3\2\2\2\u010e!\3\2\2\2"+
		"\u010f\u0112\7\36\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112#\3\2\2\2\u0113\u0115\7\37\2\2\u0114\u0116\5P)\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\7 \2\2\u011a\u0121\3\2\2\2\u011b\u011c\7\37"+
		"\2\2\u011c\u011d\5&\24\2\u011d\u011e\7 \2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u0113\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011f\3\2"+
		"\2\2\u0121%\3\2\2\2\u0122\u0123\b\24\1\2\u0123\u0124\5P)\2\u0124\u012a"+
		"\3\2\2\2\u0125\u0126\f\3\2\2\u0126\u0127\7!\2\2\u0127\u0129\5P)\2\u0128"+
		"\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\'\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\4\2\2\u012e\u0135"+
		"\5P)\2\u012f\u0130\7\4\2\2\u0130\u0135\7\"\2\2\u0131\u0132\7\4\2\2\u0132"+
		"\u0135\7#\2\2\u0133\u0135\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u012f\3\2"+
		"\2\2\u0134\u0131\3\2\2\2\u0134\u0133\3\2\2\2\u0135)\3\2\2\2\u0136\u0138"+
		"\7\37\2\2\u0137\u0139\5V,\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7 "+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0136\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140+\3\2\2\2\u0141\u0142\7\4\2\2\u0142\u0149\5V,\2\u0143"+
		"\u0144\7\4\2\2\u0144\u0149\7\"\2\2\u0145\u0146\7\4\2\2\u0146\u0149\7#"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0143\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0148\u0147\3\2\2\2\u0149-\3\2\2\2\u014a\u014b\7\37\2\2"+
		"\u014b\u014c\5\60\31\2\u014c\u014d\7 \2\2\u014d/\3\2\2\2\u014e\u014f\b"+
		"\31\1\2\u014f\u0150\5\62\32\2\u0150\u0156\3\2\2\2\u0151\u0152\f\3\2\2"+
		"\u0152\u0153\7!\2\2\u0153\u0155\5\62\32\2\u0154\u0151\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\61\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015f\79\2\2\u015a\u015b\79\2\2\u015b\u015c\5\36"+
		"\20\2\u015c\u015d\5<\37\2\u015d\u015f\3\2\2\2\u015e\u0159\3\2\2\2\u015e"+
		"\u015a\3\2\2\2\u015f\63\3\2\2\2\u0160\u0161\7\37\2\2\u0161\u0162\7$\2"+
		"\2\u0162\u0163\5\36\20\2\u0163\u0164\5<\37\2\u0164\u0165\7!\2\2\u0165"+
		"\u0166\7%\2\2\u0166\u0167\5\36\20\2\u0167\u0168\5<\37\2\u0168\u0169\7"+
		" \2\2\u0169\u016c\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0160\3\2\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\65\3\2\2\2\u016d\u016e\7\4\2\2\u016e\u0175\79\2\2"+
		"\u016f\u0170\7\4\2\2\u0170\u0175\7\"\2\2\u0171\u0172\7\4\2\2\u0172\u0175"+
		"\7#\2\2\u0173\u0175\3\2\2\2\u0174\u016d\3\2\2\2\u0174\u016f\3\2\2\2\u0174"+
		"\u0171\3\2\2\2\u0174\u0173\3\2\2\2\u0175\67\3\2\2\2\u0176\u0177\7\4\2"+
		"\2\u0177\u017e\7;\2\2\u0178\u0179\7\4\2\2\u0179\u017e\7\"\2\2\u017a\u017b"+
		"\7\4\2\2\u017b\u017e\7#\2\2\u017c\u017e\3\2\2\2\u017d\u0176\3\2\2\2\u017d"+
		"\u0178\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017c\3\2\2\2\u017e9\3\2\2\2"+
		"\u017f\u0180\7\4\2\2\u0180\u0187\5N(\2\u0181\u0182\7\4\2\2\u0182\u0187"+
		"\7\"\2\2\u0183\u0184\7\4\2\2\u0184\u0187\7#\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u017f\3\2\2\2\u0186\u0181\3\2\2\2\u0186\u0183\3\2\2\2\u0186\u0185\3\2"+
		"\2\2\u0187;\3\2\2\2\u0188\u0189\7&\2\2\u0189\u018c\7;\2\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018a\3\2\2\2\u018c=\3\2\2\2\u018d"+
		"\u018e\5@!\2\u018e\u018f\5B\"\2\u018f\u0190\5D#\2\u0190\u0191\5<\37\2"+
		"\u0191\u0192\7\5\2\2\u0192?\3\2\2\2\u0193\u0194\t\3\2\2\u0194A\3\2\2\2"+
		"\u0195\u0198\79\2\2\u0196\u0198\5\26\f\2\u0197\u0195\3\2\2\2\u0197\u0196"+
		"\3\2\2\2\u0198C\3\2\2\2\u0199\u019a\7\37\2\2\u019a\u019d\7 \2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019b\3\2\2\2\u019dE\3\2\2\2"+
		"\u019e\u019f\b$\1\2\u019f\u01a2\5H%\2\u01a0\u01a2\3\2\2\2\u01a1\u019e"+
		"\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a7\3\2\2\2\u01a3\u01a4\f\4\2\2\u01a4"+
		"\u01a6\5H%\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2"+
		"\2\u01a7\u01a8\3\2\2\2\u01a8G\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab"+
		"\5J&\2\u01ab\u01ac\7\4\2\2\u01ac\u01ad\5L\'\2\u01ad\u01ae\5<\37\2\u01ae"+
		"\u01af\7\5\2\2\u01afI\3\2\2\2\u01b0\u01b3\79\2\2\u01b1\u01b3\5\26\f\2"+
		"\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3K\3\2\2\2\u01b4\u01d0\7"+
		"9\2\2\u01b5\u01b6\79\2\2\u01b6\u01b7\7\7\2\2\u01b7\u01b8\5F$\2\u01b8\u01b9"+
		"\7\b\2\2\u01b9\u01d0\3\2\2\2\u01ba\u01d0\5N(\2\u01bb\u01bc\5N(\2\u01bc"+
		"\u01bd\7\7\2\2\u01bd\u01be\5F$\2\u01be\u01bf\7\b\2\2\u01bf\u01d0\3\2\2"+
		"\2\u01c0\u01d0\5P)\2\u01c1\u01d0\5V,\2\u01c2\u01d0\7;\2\2\u01c3\u01d0"+
		"\7#\2\2\u01c4\u01c5\7\7\2\2\u01c5\u01ca\5L\'\2\u01c6\u01c7\7!\2\2\u01c7"+
		"\u01c9\5L\'\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01ce\7\b\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01b4\3\2\2\2\u01cf\u01b5\3\2"+
		"\2\2\u01cf\u01ba\3\2\2\2\u01cf\u01bb\3\2\2\2\u01cf\u01c0\3\2\2\2\u01cf"+
		"\u01c1\3\2\2\2\u01cf\u01c2\3\2\2\2\u01cf\u01c3\3\2\2\2\u01cf\u01c4\3\2"+
		"\2\2\u01d0M\3\2\2\2\u01d1\u01d2\t\4\2\2\u01d2O\3\2\2\2\u01d3\u01d6\5R"+
		"*\2\u01d4\u01d6\78\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6Q"+
		"\3\2\2\2\u01d7\u01d8\5T+\2\u01d8\u01d9\5Z.\2\u01d9S\3\2\2\2\u01da\u01de"+
		"\7\63\2\2\u01db\u01de\7\64\2\2\u01dc\u01de\3\2\2\2\u01dd\u01da\3\2\2\2"+
		"\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deU\3\2\2\2\u01df\u01e0\5"+
		"T+\2\u01e0\u01e1\5Z.\2\u01e1\u01e2\7\65\2\2\u01e2\u01e3\5Z.\2\u01e3\u01e4"+
		"\5X-\2\u01e4W\3\2\2\2\u01e5\u01e6\7\66\2\2\u01e6\u01e7\5T+\2\u01e7\u01e8"+
		"\5Z.\2\u01e8\u01ef\3\2\2\2\u01e9\u01ea\7\67\2\2\u01ea\u01eb\5T+\2\u01eb"+
		"\u01ec\5Z.\2\u01ec\u01ef\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01e5\3\2\2"+
		"\2\u01ee\u01e9\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efY\3\2\2\2\u01f0\u01f2"+
		"\7:\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4[\3\2\2\2&gz\u0088\u0096\u009f\u00b2\u00b7\u00ff\u0106"+
		"\u010d\u0111\u0117\u0120\u012a\u0134\u013a\u013f\u0148\u0156\u015e\u016b"+
		"\u0174\u017d\u0186\u018b\u0197\u019c\u01a1\u01a7\u01b2\u01ca\u01cf\u01d5"+
		"\u01dd\u01ee\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
	public OilSpec getOilSpec() {
		this.oil.updateCeilingPriority();
	    return this.oil;
	}
}
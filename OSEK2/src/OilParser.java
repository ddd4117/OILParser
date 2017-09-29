
// Generated from Syntax.g4 by ANTLR 4.7
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import object.InvalidOilException;
import object.OilAlarm;
import object.OilAppMode;
import object.OilCounter;
import object.OilEvent;
import object.OilISR;
import object.OilObject;
import object.OilOs;
import object.OilResource;
import object.OilSpec;
import object.OilTask;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class OilParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
	}
	private OilObject currentObject;
	public String _Name = "";
	public Queue attr_list = new LinkedList();
	static boolean flag = false;
	/** flag == false is Not List, flag == true is parameter list */
	private OilSpec oil = new OilSpec();
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17, T__17 = 18,
			T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24, T__24 = 25, T__25 = 26, T__26 = 27,
			T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31, T__31 = 32, T__32 = 33, T__33 = 34, T__34 = 35, T__35 = 36,
			T__36 = 37, T__37 = 38, T__38 = 39, T__39 = 40, T__40 = 41, T__41 = 42, T__42 = 43, T__43 = 44, T__44 = 45,
			T__45 = 46, T__46 = 47, T__47 = 48, T__48 = 49, T__49 = 50, T__50 = 51, T__51 = 52, T__52 = 53, T__53 = 54,
			T__54 = 55, T__55 = 56, T__56 = 57, T__57 = 58, T__58 = 59, T__59 = 60, T__60 = 61, T__61 = 62, T__62 = 63,
			T__63 = 64, T__64 = 65, T__65 = 66, T__66 = 67, T__67 = 68, T__68 = 69, T__69 = 70, T__70 = 71, T__71 = 72,
			T__72 = 73, T__73 = 74, T__74 = 75, DIGIT = 76, NAME = 77, STRING = 78, WS = 79, COMMENT = 80,
			LINE_COMMENT = 81;
	public static final int RULE_file = 0, RULE_oil_version = 1, RULE_version = 2, RULE_application_definition = 3,
			RULE_object_definition_list = 4, RULE_object_definition = 5, RULE_object_name = 6,
			RULE_implementation_definition = 7, RULE_implementation_spec_list = 8, RULE_implementation_spec = 9,
			RULE_object = 10, RULE_implementation_list = 11, RULE_implementation_def = 12, RULE_impl_attr_def = 13,
			RULE_impl_parameter_list = 14, RULE_impl_def_list = 15, RULE_auto_specifier = 16, RULE_number_range = 17,
			RULE_number_list = 18, RULE_default_number = 19, RULE_float_range = 20, RULE_default_float = 21,
			RULE_enumeration = 22, RULE_enumerator_list = 23, RULE_enumerator = 24, RULE_bool_values = 25,
			RULE_default_Namedef = 26, RULE_default_string = 27, RULE_default_bool = 28, RULE_description = 29,
			RULE_impl_ref_def = 30, RULE_object_ref_type = 31, RULE_reference_Namedef = 32,
			RULE_multiple_specifier = 33, RULE_parameter_list = 34, RULE_parameter = 35, RULE_attribute_Namedef = 36,
			RULE_attribute_value = 37, RULE_bool = 38, RULE_number = 39, RULE_dec_number = 40, RULE_sign = 41,
			RULE_float_num = 42, RULE_exponent = 43, RULE_dec_digits = 44, RULE_zero_digit = 45, RULE_pos_digit = 46,
			RULE_hex_number = 47, RULE_hex_digits = 48, RULE_hex_digit = 49;
	public static final String[] ruleNames = { "file", "oil_version", "version", "application_definition",
			"object_definition_list", "object_definition", "object_name", "implementation_definition",
			"implementation_spec_list", "implementation_spec", "object", "implementation_list", "implementation_def",
			"impl_attr_def", "impl_parameter_list", "impl_def_list", "auto_specifier", "number_range", "number_list",
			"default_number", "float_range", "default_float", "enumeration", "enumerator_list", "enumerator",
			"bool_values", "default_Namedef", "default_string", "default_bool", "description", "impl_ref_def",
			"object_ref_type", "reference_Namedef", "multiple_specifier", "parameter_list", "parameter",
			"attribute_Namedef", "attribute_value", "bool", "number", "dec_number", "sign", "float_num", "exponent",
			"dec_digits", "zero_digit", "pos_digit", "hex_number", "hex_digits", "hex_digit" };

	private static final String[] _LITERAL_NAMES = { null, "'OIL_VERSION'", "'='", "';'", "'CPU'", "'{'", "'}'",
			"'IMPLEMENTATION'", "'OS'", "'TASK'", "'COUNTER'", "'ALARM'", "'RESOURCE'", "'EVENT'", "'ISR'", "'MESSAGE'",
			"'COM'", "'NM'", "'APPMODE'", "'IPDU'", "'UINT32'", "'INT32'", "'UINT64'", "'INT64'", "'FLOAT'", "'ENUM'",
			"'STRING'", "'BOOLEAN'", "'WITH_AUTO'", "'['", "']'", "','", "'NO_DEFAULT'", "'AUTO'", "'TRUE'", "'FALSE'",
			"':'", "'OS_TYPE'", "'TASK_TYPE'", "'COUNTER+TYPE'", "'ALARM_TYPE'", "'RESOURCE_TYPE'", "'EVENT_TYPE'",
			"'ISR_TYPE'", "'MESSAGE_TYPE'", "'COM_TYPE'", "'NM_TYPE'", "'APPMODE_TYPE'", "'IPDU_TYPE'", "'+'", "'-'",
			"'.'", "'e'", "'E'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'0x'", "'0X'",
			"'a'", "'b'", "'c'", "'d'", "'f'", "'A'", "'B'", "'C'", "'D'", "'F'" };
	private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, "DIGIT", "NAME", "STRING", "WS",
			"COMMENT", "LINE_COMMENT" };
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
	public String getGrammarFileName() {
		return "Syntax.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public OilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public Oil_versionContext oil_version() {
			return getRuleContext(Oil_versionContext.class, 0);
		}

		public Implementation_definitionContext implementation_definition() {
			return getRuleContext(Implementation_definitionContext.class, 0);
		}

		public Application_definitionContext application_definition() {
			return getRuleContext(Application_definitionContext.class, 0);
		}

		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_file;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterFile(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {

		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);

		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				oil_version();
				setState(101);
				implementation_definition();
				setState(102);
				application_definition();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}

		return _localctx;
	}

	public static class Oil_versionContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public Oil_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_oil_version;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterOil_version(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitOil_version(this);
		}
	}

	public final Oil_versionContext oil_version() throws RecognitionException {
		Oil_versionContext _localctx = new Oil_versionContext(_ctx, getState());

		enterRule(_localctx, 2, RULE_oil_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(104);
				match(T__0);
				setState(105);
				match(T__1);
				setState(106);
				version();
				setState(107);
				description();
				setState(108);
				match(T__2);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode STRING() {
			return getToken(OilParser.STRING, 0);
		}

		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_version;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterVersion(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(110);
				match(STRING);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Application_definitionContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public Object_definition_listContext object_definition_list() {
			return getRuleContext(Object_definition_listContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public Application_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_application_definition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterApplication_definition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitApplication_definition(this);
		}
	}

	public final Application_definitionContext application_definition() throws RecognitionException {
		Application_definitionContext _localctx = new Application_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_application_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				match(T__3);
				setState(113);
				match(NAME);
				setState(114);
				match(T__4);
				setState(115);
				object_definition_list(0);
				setState(116);
				match(T__5);
				setState(117);
				description();
				setState(118);
				match(T__2);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}

		return _localctx;
	}

	public static class Object_definition_listContext extends ParserRuleContext {
		public Object_definitionContext object_definition() {
			return getRuleContext(Object_definitionContext.class, 0);
		}

		public Object_definition_listContext object_definition_list() {
			return getRuleContext(Object_definition_listContext.class, 0);
		}

		public Object_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_object_definition_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterObject_definition_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitObject_definition_list(this);
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
					setState(121);
					object_definition();
				}
				_ctx.stop = _input.LT(-1);
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Object_definition_listContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_object_definition_list);
								setState(123);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(124);
								object_definition();
							}
						}
					}

					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Object_definitionContext extends ParserRuleContext {
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class, 0);
		}

		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public Object_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_object_definition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterObject_definition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitObject_definition(this);
		}
	}

	public final Object_definitionContext object_definition() throws RecognitionException {
		Object_definitionContext _localctx = new Object_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_object_definition);

		try {
			setState(141);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {

			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(130);
				object_name();
				setState(131);
				match(T__4);
				setState(132);
				parameter_list(0);
				setState(133);
				match(T__5);
				setState(134);
				description();
				setState(135);
				match(T__2);
				finalizeOilObjCreation();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(137);
				object_name();
				setState(138);
				description();
				setState(139);
				match(T__2);
				finalizeOilObjCreation();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_nameContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class, 0);
		}

		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public Object_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_object_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterObject_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitObject_name(this);
		}
	}

	public final Object_nameContext object_name() throws RecognitionException {
		Object_nameContext _localctx = new Object_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(143);
				String temp = this.getCurrentToken().getText();
				object();
				makeObject(temp);
				setState(144);
				temp = this.getCurrentToken().getText();
				match(NAME);
				try {
					currentObject.setName(temp);
				} catch (InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implementation_definitionContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public Implementation_spec_listContext implementation_spec_list() {
			return getRuleContext(Implementation_spec_listContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public Implementation_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_implementation_definition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImplementation_definition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImplementation_definition(this);
		}
	}

	public final Implementation_definitionContext implementation_definition() throws RecognitionException {
		Implementation_definitionContext _localctx = new Implementation_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_implementation_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(146);
				match(T__6);
				setState(147);
				match(NAME);
				setState(148);
				match(T__4);
				setState(149);
				implementation_spec_list(0);
				setState(150);
				match(T__5);
				setState(151);
				description();
				setState(152);
				match(T__2);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implementation_spec_listContext extends ParserRuleContext {
		public Implementation_specContext implementation_spec() {
			return getRuleContext(Implementation_specContext.class, 0);
		}

		public Implementation_spec_listContext implementation_spec_list() {
			return getRuleContext(Implementation_spec_listContext.class, 0);
		}

		public Implementation_spec_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_implementation_spec_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImplementation_spec_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImplementation_spec_list(this);
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
					setState(155);
					implementation_spec();
				}
				_ctx.stop = _input.LT(-1);
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Implementation_spec_listContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_implementation_spec_list);
								setState(157);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this, "precpred(_ctx, 2)");
								setState(158);
								implementation_spec();
							}
						}
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Implementation_specContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class, 0);
		}

		public Implementation_listContext implementation_list() {
			return getRuleContext(Implementation_listContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public Implementation_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_implementation_spec;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImplementation_spec(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImplementation_spec(this);
		}
	}

	public final Implementation_specContext implementation_spec() throws RecognitionException {
		Implementation_specContext _localctx = new Implementation_specContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_implementation_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
				Object temp = this.getCurrentToken().getText();
				setState(164);
				object();
				makeObject((String) temp);
				setState(165);
				match(T__4);
				setState(166);
				implementation_list(0);
				setState(167);
				match(T__5);
				setState(168);
				description();
				setState(169);
				match(T__2);
				finalizeOilObjCreation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_object;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterObject(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(171);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9)
						| (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15)
						| (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implementation_listContext extends ParserRuleContext {
		public Implementation_defContext implementation_def() {
			return getRuleContext(Implementation_defContext.class, 0);
		}

		public Implementation_listContext implementation_list() {
			return getRuleContext(Implementation_listContext.class, 0);
		}

		public Implementation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_implementation_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImplementation_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImplementation_list(this);
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
					setState(174);
					implementation_def();
				}
				_ctx.stop = _input.LT(-1);
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Implementation_listContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_implementation_list);
								setState(176);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(177);
								implementation_def();
							}
						}
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Implementation_defContext extends ParserRuleContext {
		public Impl_attr_defContext impl_attr_def() {
			return getRuleContext(Impl_attr_defContext.class, 0);
		}

		public Impl_ref_defContext impl_ref_def() {
			return getRuleContext(Impl_ref_defContext.class, 0);
		}

		public Implementation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_implementation_def;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImplementation_def(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImplementation_def(this);
		}
	}

	public final Implementation_defContext implementation_def() throws RecognitionException {
		Implementation_defContext _localctx = new Implementation_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_implementation_def);
		try {
			setState(185);
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
				enterOuterAlt(_localctx, 1); {
				setState(183);
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
				enterOuterAlt(_localctx, 2); {
				setState(184);
				impl_ref_def();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_attr_defContext extends ParserRuleContext {
		public Auto_specifierContext auto_specifier() {
			return getRuleContext(Auto_specifierContext.class, 0);
		}

		public Number_rangeContext number_range() {
			return getRuleContext(Number_rangeContext.class, 0);
		}

		public Attribute_NamedefContext attribute_Namedef() {
			return getRuleContext(Attribute_NamedefContext.class, 0);
		}

		public Multiple_specifierContext multiple_specifier() {
			return getRuleContext(Multiple_specifierContext.class, 0);
		}

		public Default_numberContext default_number() {
			return getRuleContext(Default_numberContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public Float_rangeContext float_range() {
			return getRuleContext(Float_rangeContext.class, 0);
		}

		public Default_floatContext default_float() {
			return getRuleContext(Default_floatContext.class, 0);
		}

		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class, 0);
		}

		public Default_NamedefContext default_Namedef() {
			return getRuleContext(Default_NamedefContext.class, 0);
		}

		public Default_stringContext default_string() {
			return getRuleContext(Default_stringContext.class, 0);
		}

		public Bool_valuesContext bool_values() {
			return getRuleContext(Bool_valuesContext.class, 0);
		}

		public Default_boolContext default_bool() {
			return getRuleContext(Default_boolContext.class, 0);
		}

		public Impl_attr_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_impl_attr_def;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImpl_attr_def(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImpl_attr_def(this);
		}
	}

	public final Impl_attr_defContext impl_attr_def() throws RecognitionException {
		Impl_attr_defContext _localctx = new Impl_attr_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_impl_attr_def);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1); {
				setState(187);
				match(T__19);
				setState(188);
				auto_specifier();
				setState(189);
				number_range();
				setState(190);
				attribute_Namedef();
				setState(191);
				multiple_specifier();
				setState(192);
				default_number();
				setState(193);
				description();
				setState(194);
				match(T__2);
			}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2); {
				setState(196);
				match(T__20);
				setState(197);
				auto_specifier();
				setState(198);
				number_range();
				setState(199);
				attribute_Namedef();
				setState(200);
				multiple_specifier();
				setState(201);
				default_number();
				setState(202);
				description();
				setState(203);
				match(T__2);
			}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3); {
				setState(205);
				match(T__21);
				setState(206);
				auto_specifier();
				setState(207);
				number_range();
				setState(208);
				attribute_Namedef();
				setState(209);
				multiple_specifier();
				setState(210);
				default_number();
				setState(211);
				description();
				setState(212);
				match(T__2);
			}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4); {
				setState(214);
				match(T__22);
				setState(215);
				auto_specifier();
				setState(216);
				number_range();
				setState(217);
				attribute_Namedef();
				setState(218);
				multiple_specifier();
				setState(219);
				default_number();
				setState(220);
				description();
				setState(221);
				match(T__2);
			}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5); {
				setState(223);
				match(T__23);
				setState(224);
				auto_specifier();
				setState(225);
				float_range();
				setState(226);
				attribute_Namedef();
				setState(227);
				multiple_specifier();
				setState(228);
				default_float();
				setState(229);
				description();
				setState(230);
				match(T__2);
			}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6); {
				setState(232);
				match(T__24);
				setState(233);
				auto_specifier();
				setState(234);
				enumeration();
				setState(235);
				attribute_Namedef();
				setState(236);
				multiple_specifier();
				setState(237);
				default_Namedef();
				setState(238);
				description();
				setState(239);
				match(T__2);
			}
				break;
			case T__25:
				enterOuterAlt(_localctx, 7); {
				setState(241);
				match(T__25);
				setState(242);
				auto_specifier();
				setState(243);
				attribute_Namedef();
				setState(244);
				multiple_specifier();
				setState(245);
				default_string();
				setState(246);
				match(T__2);
			}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8); {
				setState(248);
				match(T__26);
				setState(249);
				auto_specifier();
				setState(250);
				bool_values();
				setState(251);
				attribute_Namedef();
				setState(252);
				multiple_specifier();
				setState(253);
				default_bool();
				setState(254);
				description();
				setState(255);
				match(T__2);
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_parameter_listContext extends ParserRuleContext {
		public Impl_def_listContext impl_def_list() {
			return getRuleContext(Impl_def_listContext.class, 0);
		}

		public Impl_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_impl_parameter_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImpl_parameter_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImpl_parameter_list(this);
		}
	}

	public final Impl_parameter_listContext impl_parameter_list() throws RecognitionException {
		Impl_parameter_listContext _localctx = new Impl_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_impl_parameter_list);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(259);
				match(T__4);
				setState(260);
				impl_def_list();
				setState(261);
				match(T__5);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_def_listContext extends ParserRuleContext {
		public Implementation_defContext implementation_def() {
			return getRuleContext(Implementation_defContext.class, 0);
		}

		public Impl_def_listContext impl_def_list() {
			return getRuleContext(Impl_def_listContext.class, 0);
		}

		public Impl_def_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_impl_def_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImpl_def_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImpl_def_list(this);
		}
	}

	public final Impl_def_listContext impl_def_list() throws RecognitionException {
		Impl_def_listContext _localctx = new Impl_def_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_impl_def_list);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(266);
				implementation_def();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(267);
				implementation_def();
				setState(268);
				impl_def_list();
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Auto_specifierContext extends ParserRuleContext {
		public Auto_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_auto_specifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterAuto_specifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitAuto_specifier(this);
		}
	}

	public final Auto_specifierContext auto_specifier() throws RecognitionException {
		Auto_specifierContext _localctx = new Auto_specifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_auto_specifier);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1); {
				setState(273);
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
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_rangeContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}

		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class, i);
		}

		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class, 0);
		}

		public Number_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_number_range;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterNumber_range(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitNumber_range(this);
		}
	}

	public final Number_rangeContext number_range() throws RecognitionException {
		Number_rangeContext _localctx = new Number_rangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number_range);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(277);
				match(T__28);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(278);
							number();
						}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (T__48 - 49))
						| (1L << (T__49 - 49)) | (1L << (T__53 - 49)) | (1L << (T__54 - 49)) | (1L << (T__55 - 49))
						| (1L << (T__56 - 49)) | (1L << (T__57 - 49)) | (1L << (T__58 - 49)) | (1L << (T__59 - 49))
						| (1L << (T__60 - 49)) | (1L << (T__61 - 49)) | (1L << (T__62 - 49)) | (1L << (T__63 - 49))
						| (1L << (T__64 - 49)) | (1L << (DIGIT - 49)))) != 0));
				setState(283);
				match(T__29);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(285);
				match(T__28);
				setState(286);
				number_list(0);
				setState(287);
				match(T__29);
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_listContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class, 0);
		}

		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class, 0);
		}

		public Number_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_number_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterNumber_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitNumber_list(this);
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
					setState(293);
					number();
				}
				_ctx.stop = _input.LT(-1);
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Number_listContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_number_list);
								setState(295);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(296);
								match(T__30);
								setState(297);
								number();
							}
						}
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Default_numberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class, 0);
		}

		public Default_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_default_number;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDefault_number(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDefault_number(this);
		}
	}

	public final Default_numberContext default_number() throws RecognitionException {
		Default_numberContext _localctx = new Default_numberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_default_number);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(303);
				match(T__1);
				setState(304);
				String temp = this.getCurrentToken().getText();
				number();
				try {
					currentObject.addAttribute(_Name, temp);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(305);
				match(T__1);
				String temp = this.getCurrentToken().getText();
				setState(306);
				match(T__31);
				try {
					currentObject.addAttribute(_Name, temp);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(307);
				match(T__1);
				setState(308);
				String temp = this.getCurrentToken().getText();
				match(T__32);
				try {
					currentObject.addAttribute(_Name, temp);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_rangeContext extends ParserRuleContext {
		public List<Float_numContext> float_num() {
			return getRuleContexts(Float_numContext.class);
		}

		public Float_numContext float_num(int i) {
			return getRuleContext(Float_numContext.class, i);
		}

		public Float_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_float_range;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterFloat_range(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitFloat_range(this);
		}
	}

	public final Float_rangeContext float_range() throws RecognitionException {
		Float_rangeContext _localctx = new Float_rangeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_float_range);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1); {
				setState(312);
				match(T__28);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(313);
							float_num();
						}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49))
						& ((1L << (T__48 - 49)) | (1L << (T__49 - 49)) | (1L << (T__53 - 49)) | (1L << (T__54 - 49))
								| (1L << (T__55 - 49)) | (1L << (T__56 - 49)) | (1L << (T__57 - 49))
								| (1L << (T__58 - 49)) | (1L << (T__59 - 49)) | (1L << (T__60 - 49))
								| (1L << (T__61 - 49)) | (1L << (T__62 - 49)) | (1L << (DIGIT - 49)))) != 0));
				setState(318);
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
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_floatContext extends ParserRuleContext {
		public Float_numContext float_num() {
			return getRuleContext(Float_numContext.class, 0);
		}

		public Default_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_default_float;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDefault_float(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDefault_float(this);
		}
	}

	public final Default_floatContext default_float() throws RecognitionException {
		Default_floatContext _localctx = new Default_floatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_default_float);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(323);
				match(T__1);
				setState(324);
				float_num();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(325);
				match(T__1);
				setState(326);
				match(T__31);
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(327);
				match(T__1);
				setState(328);
				match(T__32);
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class, 0);
		}

		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumeration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterEnumeration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitEnumeration(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(332);
				match(T__28);
				setState(333);
				enumerator_list(0);
				setState(334);
				match(T__29);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_listContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class, 0);
		}

		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class, 0);
		}

		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumerator_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterEnumerator_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitEnumerator_list(this);
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
					setState(337);
					enumerator();
				}
				_ctx.stop = _input.LT(-1);
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Enumerator_listContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_enumerator_list);
								setState(339);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(340);
								match(T__30);
								setState(341);
								enumerator();
							}
						}
					}
					setState(346);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public Impl_parameter_listContext impl_parameter_list() {
			return getRuleContext(Impl_parameter_listContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumerator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterEnumerator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumerator);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(347);
				match(NAME);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(348);
				match(NAME);
				setState(349);
				impl_parameter_list();
				setState(350);
				description();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_valuesContext extends ParserRuleContext {
		public List<Impl_parameter_listContext> impl_parameter_list() {
			return getRuleContexts(Impl_parameter_listContext.class);
		}

		public Impl_parameter_listContext impl_parameter_list(int i) {
			return getRuleContext(Impl_parameter_listContext.class, i);
		}

		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}

		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class, i);
		}

		public Bool_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bool_values;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterBool_values(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitBool_values(this);
		}
	}

	public final Bool_valuesContext bool_values() throws RecognitionException {
		Bool_valuesContext _localctx = new Bool_valuesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool_values);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1); {
				setState(354);
				match(T__28);
				setState(355);
				match(T__33);
				setState(356);
				impl_parameter_list();
				setState(357);
				description();
				setState(358);
				match(T__30);
				setState(359);
				match(T__34);
				setState(360);
				impl_parameter_list();
				setState(361);
				description();
				setState(362);
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
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_NamedefContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public Default_NamedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_default_Namedef;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDefault_Namedef(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDefault_Namedef(this);
		}
	}

	public final Default_NamedefContext default_Namedef() throws RecognitionException {
		Default_NamedefContext _localctx = new Default_NamedefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_default_Namedef);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(367);
				match(T__1);
				setState(368);
				match(NAME);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(369);
				match(T__1);
				setState(370);
				match(T__31);
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(371);
				match(T__1);
				setState(372);
				match(T__32);
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_stringContext extends ParserRuleContext {
		public TerminalNode STRING() {
			return getToken(OilParser.STRING, 0);
		}

		public Default_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_default_string;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDefault_string(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDefault_string(this);
		}
	}

	public final Default_stringContext default_string() throws RecognitionException {
		Default_stringContext _localctx = new Default_stringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_default_string);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(376);
				match(T__1);
				setState(377);
				match(STRING);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(378);
				match(T__1);
				setState(379);
				match(T__31);
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(380);
				match(T__1);
				setState(381);
				match(T__32);
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_boolContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class, 0);
		}

		public Default_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_default_bool;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDefault_bool(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDefault_bool(this);
		}
	}

	public final Default_boolContext default_bool() throws RecognitionException {
		Default_boolContext _localctx = new Default_boolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_default_bool);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(385);
				match(T__1);
				setState(386);
				bool();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(387);
				match(T__1);
				setState(388);
				match(T__31);
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(389);
				match(T__1);
				setState(390);
				match(T__32);
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode STRING() {
			return getToken(OilParser.STRING, 0);
		}

		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_description;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDescription(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDescription(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_description);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(394);
				match(T__35);
				setState(395);
				match(STRING);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_ref_defContext extends ParserRuleContext {
		public Object_ref_typeContext object_ref_type() {
			return getRuleContext(Object_ref_typeContext.class, 0);
		}

		public Reference_NamedefContext reference_Namedef() {
			return getRuleContext(Reference_NamedefContext.class, 0);
		}

		public Multiple_specifierContext multiple_specifier() {
			return getRuleContext(Multiple_specifierContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public Impl_ref_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_impl_ref_def;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterImpl_ref_def(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitImpl_ref_def(this);
		}
	}

	public final Impl_ref_defContext impl_ref_def() throws RecognitionException {
		Impl_ref_defContext _localctx = new Impl_ref_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_impl_ref_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(399);
				object_ref_type();
				setState(400);
				reference_Namedef();
				setState(401);
				multiple_specifier();
				setState(402);
				description();
				setState(403);
				match(T__2);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_ref_typeContext extends ParserRuleContext {
		public Object_ref_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_object_ref_type;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterObject_ref_type(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitObject_ref_type(this);
		}
	}

	public final Object_ref_typeContext object_ref_type() throws RecognitionException {
		Object_ref_typeContext _localctx = new Object_ref_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_object_ref_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(405);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38)
						| (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44)
						| (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_NamedefContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public ObjectContext object() {
			return getRuleContext(ObjectContext.class, 0);
		}

		public Reference_NamedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_reference_Namedef;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterReference_Namedef(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitReference_Namedef(this);
		}
	}

	public final Reference_NamedefContext reference_Namedef() throws RecognitionException {
		Reference_NamedefContext _localctx = new Reference_NamedefContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_reference_Namedef);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1); {
				setState(407);
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
				enterOuterAlt(_localctx, 2); {
				setState(408);
				object();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_specifierContext extends ParserRuleContext {
		public Multiple_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_multiple_specifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterMultiple_specifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitMultiple_specifier(this);
		}
	}

	public final Multiple_specifierContext multiple_specifier() throws RecognitionException {
		Multiple_specifierContext _localctx = new Multiple_specifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiple_specifier);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1); {
				setState(411);
				match(T__28);
				setState(412);
				match(T__29);
			}
				break;
			case T__1:
			case T__2:
			case T__35:
				enterOuterAlt(_localctx, 2); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class, 0);
		}

		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class, 0);
		}

		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameter_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterParameter_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitParameter_list(this);
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
				setState(419);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
				case 1: {
					setState(417);
					parameter();
				}
					break;
				case 2: {
				}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Parameter_listContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
								setState(421);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this, "precpred(_ctx, 2)");
								setState(422);
								parameter();
							}
						}
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Attribute_NamedefContext attribute_Namedef() {
			return getRuleContext(Attribute_NamedefContext.class, 0);
		}

		public Attribute_valueContext attribute_value() {
			return getRuleContext(Attribute_valueContext.class, 0);
		}

		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class, 0);
		}

		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(428);
				if(flag == false)
					_Name = this.getCurrentToken().getText();
				else
					attr_list.add(this.getCurrentToken().getText());
				attribute_Namedef();
				setState(429);
				match(T__1);
				setState(430);
				attribute_value();
				setState(431);
				description();
				setState(432);
				match(T__2);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_NamedefContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public ObjectContext object() {
			return getRuleContext(ObjectContext.class, 0);
		}

		public Attribute_NamedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_attribute_Namedef;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterAttribute_Namedef(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitAttribute_Namedef(this);
		}
	}

	public final Attribute_NamedefContext attribute_Namedef() throws RecognitionException {
		Attribute_NamedefContext _localctx = new Attribute_NamedefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_attribute_Namedef);
		_Name = this.getCurrentToken().getText();
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1); {
				setState(434);
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
				enterOuterAlt(_localctx, 2); {
				setState(435);
				object();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_valueContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(OilParser.NAME, 0);
		}

		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class, 0);
		}

		public BoolContext bool() {
			return getRuleContext(BoolContext.class, 0);
		}

		public NumberContext number() {
			return getRuleContext(NumberContext.class, 0);
		}

		public Float_numContext float_num() {
			return getRuleContext(Float_numContext.class, 0);
		}

		public TerminalNode STRING() {
			
			return getToken(OilParser.STRING, 0);
		}

		public Attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_attribute_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterAttribute_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitAttribute_value(this);
		}
	}

	public final Attribute_valueContext attribute_value() throws RecognitionException {
		String temp = "";
		Attribute_valueContext _localctx = new Attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attribute_value);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(438);
				if (flag == false)
				{
					temp = this.getCurrentToken().getText();
					try {
						currentObject.addAttribute(_Name, temp);
					} catch (NumberFormatException | InvalidOilException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else 
					attr_list.offer(this.getCurrentToken().getText());
				match(NAME);
			}
				break;
			case 2:
				flag = true;
				enterOuterAlt(_localctx, 2); {
				setState(439);
				try {
					String value = this.getCurrentToken().getText();
					attr_list.offer(_Name);
					attr_list.offer(value);
					currentObject.addAttribute(_Name, value);
				} catch (NumberFormatException  | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				match(NAME);
				setState(440);
				match(T__4);
				setState(441);
				parameter_list(0);
				setState(442);
				match(T__5);
				addAttribute_list();
				flag = false;
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(444);
				if (flag == false)
				{
					temp = this.getCurrentToken().getText();
					try {
						currentObject.addAttribute(_Name, temp);
					} catch (NumberFormatException | InvalidOilException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else 
					attr_list.offer(this.getCurrentToken().getText());
				bool();
			}
				break;
			case 4:
				flag = true;
				enterOuterAlt(_localctx, 4); {
				setState(445);
				try {
					String value = this.getCurrentToken().getText();
					attr_list.offer(_Name);
					attr_list.offer(value);
					currentObject.addAttribute(_Name, value);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bool();
				setState(446);
				match(T__4);
				setState(447);
				parameter_list(0);
				setState(448);
				match(T__5);
				addAttribute_list();
				flag = false;
			}
				break;
			case 5:
				enterOuterAlt(_localctx, 5); {
				setState(450);
				if (flag == false)
				{
					temp = this.getCurrentToken().getText();
					try {
						currentObject.addAttribute(_Name, temp);
					} catch (NumberFormatException | InvalidOilException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else 
					attr_list.offer(this.getCurrentToken().getText());
				number();
			}
				break;
			case 6:
				enterOuterAlt(_localctx, 6); {
				setState(451);
				if (flag == false)
				{
					temp = this.getCurrentToken().getText();
					try {
						currentObject.addAttribute(_Name, temp);
					} catch (NumberFormatException | InvalidOilException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else 
					attr_list.offer(this.getCurrentToken().getText());
				float_num();
			}
				break;
			case 7:
				enterOuterAlt(_localctx, 7); {
				setState(452);
				if (flag == false)
				{
					temp = this.getCurrentToken().getText();
					try {
						currentObject.addAttribute(_Name, temp);
					} catch (NumberFormatException | InvalidOilException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else 
					attr_list.offer(this.getCurrentToken().getText());
				match(STRING);
			}
				break;
			case 8:
				enterOuterAlt(_localctx, 8); {
				setState(453);
				if (flag == false)
				{
					temp = this.getCurrentToken().getText();
					try {
						currentObject.addAttribute(_Name, temp);
					} catch (NumberFormatException | InvalidOilException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else 
					attr_list.offer(this.getCurrentToken().getText());
				match(T__32);
			}
				break;
			}
			/** process parameter list */
			/*
			if (flag == false) {
				try {
					System.out.println(_Name + " " + temp);
					currentObject.addAttribute(_Name, temp);
				} catch (NumberFormatException | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			*/
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bool;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterBool(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(456);
				_la = _input.LA(1);
				if (!(_la == T__33 || _la == T__34)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class, 0);
		}

		public Hex_numberContext hex_number() {
			return getRuleContext(Hex_numberContext.class, 0);
		}

		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_number;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterNumber(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_number);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
			case T__49:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case DIGIT:
				enterOuterAlt(_localctx, 1); {
				setState(458);
				dec_number();
			}
				break;
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 2); {
				setState(459);
				hex_number();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class, 0);
		}

		public Dec_digitsContext dec_digits() {
			return getRuleContext(Dec_digitsContext.class, 0);
		}

		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dec_number;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDec_number(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDec_number(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dec_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(462);
				sign();
				setState(463);
				dec_digits();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sign;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterSign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sign);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1); {
				setState(465);
				match(T__48);
			}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2); {
				setState(466);
				match(T__49);
			}
				break;
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case DIGIT:
				enterOuterAlt(_localctx, 3); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_numContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class, 0);
		}

		public List<Dec_digitsContext> dec_digits() {
			return getRuleContexts(Dec_digitsContext.class);
		}

		public Dec_digitsContext dec_digits(int i) {
			return getRuleContext(Dec_digitsContext.class, i);
		}

		public ExponentContext exponent() {
			return getRuleContext(ExponentContext.class, 0);
		}

		public Float_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_float_num;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterFloat_num(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitFloat_num(this);
		}
	}

	public final Float_numContext float_num() throws RecognitionException {
		Float_numContext _localctx = new Float_numContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_float_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(470);
				sign();
				setState(471);
				dec_digits();
				setState(472);
				match(T__50);
				setState(473);
				dec_digits();
				setState(474);
				exponent();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentContext extends ParserRuleContext {

		public SignContext sign() {
			return getRuleContext(SignContext.class, 0);
		}

		public Dec_digitsContext dec_digits() {
			return getRuleContext(Dec_digitsContext.class, 0);
		}

		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exponent;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterExponent(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitExponent(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exponent);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1); {
				setState(476);
				match(T__51);
				setState(477);
				sign();
				setState(478);
				dec_digits();
			}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2); {
				setState(480);
				match(T__52);
				setState(481);
				sign();
				setState(482);
				dec_digits();
			}
				break;
			case T__2:
			case T__29:
			case T__35:
			case T__48:
			case T__49:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case DIGIT:
				enterOuterAlt(_localctx, 3); {
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_digitsContext extends ParserRuleContext {
		public Zero_digitContext zero_digit() {
			return getRuleContext(Zero_digitContext.class, 0);
		}

		public Pos_digitContext pos_digit() {
			return getRuleContext(Pos_digitContext.class, 0);
		}

		public TerminalNode DIGIT() {
			return getToken(OilParser.DIGIT, 0);
		}

		public Dec_digitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dec_digits;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterDec_digits(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitDec_digits(this);
		}
	}

	public final Dec_digitsContext dec_digits() throws RecognitionException {
		Dec_digitsContext _localctx = new Dec_digitsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dec_digits);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1); {
				setState(487);
				zero_digit();
			}
				break;
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 2); {
				setState(488);
				pos_digit();
			}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3); {
				setState(489);
				match(DIGIT);
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zero_digitContext extends ParserRuleContext {
		public Zero_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_zero_digit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterZero_digit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitZero_digit(this);
		}
	}

	public final Zero_digitContext zero_digit() throws RecognitionException {
		Zero_digitContext _localctx = new Zero_digitContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_zero_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(492);
				match(T__53);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pos_digitContext extends ParserRuleContext {
		public Pos_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pos_digit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterPos_digit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitPos_digit(this);
		}
	}

	public final Pos_digitContext pos_digit() throws RecognitionException {
		Pos_digitContext _localctx = new Pos_digitContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pos_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(494);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0
						&& ((1L << _la) & ((1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58)
								| (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_numberContext extends ParserRuleContext {
		public Hex_digitsContext hex_digits() {
			return getRuleContext(Hex_digitsContext.class, 0);
		}

		public Hex_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_hex_number;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterHex_number(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitHex_number(this);
		}
	}

	public final Hex_numberContext hex_number() throws RecognitionException {
		Hex_numberContext _localctx = new Hex_numberContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_hex_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(496);
				_la = _input.LA(1);
				if (!(_la == T__63 || _la == T__64)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(497);
				hex_digits();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_digitsContext extends ParserRuleContext {
		public Hex_digitContext hex_digit() {
			return getRuleContext(Hex_digitContext.class, 0);
		}

		public Hex_digitsContext hex_digits() {
			return getRuleContext(Hex_digitsContext.class, 0);
		}

		public Hex_digitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_hex_digits;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterHex_digits(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitHex_digits(this);
		}
	}

	public final Hex_digitsContext hex_digits() throws RecognitionException {
		Hex_digitsContext _localctx = new Hex_digitsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_hex_digits);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(499);
				hex_digit();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(500);
				hex_digit();
				setState(501);
				hex_digits();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_digitContext extends ParserRuleContext {
		public Hex_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_hex_digit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).enterHex_digit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof OilListener)
				((OilListener) listener).exitHex_digit(this);
		}
	}

	public final Hex_digitContext hex_digit() throws RecognitionException {
		Hex_digitContext _localctx = new Hex_digitContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_hex_digit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(506);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1: {
						{
							setState(505);
							_la = _input.LA(1);
							if (!(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (T__51 - 52))
									| (1L << (T__52 - 52)) | (1L << (T__53 - 52)) | (1L << (T__54 - 52))
									| (1L << (T__55 - 52)) | (1L << (T__56 - 52)) | (1L << (T__57 - 52))
									| (1L << (T__58 - 52)) | (1L << (T__59 - 52)) | (1L << (T__60 - 52))
									| (1L << (T__61 - 52)) | (1L << (T__62 - 52)) | (1L << (T__65 - 52))
									| (1L << (T__66 - 52)) | (1L << (T__67 - 52)) | (1L << (T__68 - 52))
									| (1L << (T__69 - 52)) | (1L << (T__70 - 52)) | (1L << (T__71 - 52))
									| (1L << (T__72 - 52)) | (1L << (T__73 - 52)) | (1L << (T__74 - 52)))) != 0))) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF)
									matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
					}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return object_definition_list_sempred((Object_definition_listContext) _localctx, predIndex);
		case 8:
			return implementation_spec_list_sempred((Implementation_spec_listContext) _localctx, predIndex);
		case 11:
			return implementation_list_sempred((Implementation_listContext) _localctx, predIndex);
		case 18:
			return number_list_sempred((Number_listContext) _localctx, predIndex);
		case 23:
			return enumerator_list_sempred((Enumerator_listContext) _localctx, predIndex);
		case 34:
			return parameter_list_sempred((Parameter_listContext) _localctx, predIndex);
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

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u0201\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
			+ ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"
			+ "\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"
			+ "\5\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3\7\3\7\3\7\3"
			+ "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3"
			+ "\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00a2\n\n\f\n\16\n\u00a5\13"
			+ "\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r"
			+ "\u00b5\n\r\f\r\16\r\u00b8\13\r\3\16\3\16\5\16\u00bc\n\16\3\17\3\17\3\17"
			+ "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"
			+ "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"
			+ "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"
			+ "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"
			+ "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0104\n\17"
			+ "\3\20\3\20\3\20\3\20\3\20\5\20\u010b\n\20\3\21\3\21\3\21\3\21\3\21\5\21"
			+ "\u0112\n\21\3\22\3\22\5\22\u0116\n\22\3\23\3\23\6\23\u011a\n\23\r\23\16"
			+ "\23\u011b\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0125\n\23\3\24\3\24"
			+ "\3\24\3\24\3\24\3\24\7\24\u012d\n\24\f\24\16\24\u0130\13\24\3\25\3\25"
			+ "\3\25\3\25\3\25\3\25\3\25\5\25\u0139\n\25\3\26\3\26\6\26\u013d\n\26\r"
			+ "\26\16\26\u013e\3\26\3\26\3\26\5\26\u0144\n\26\3\27\3\27\3\27\3\27\3\27"
			+ "\3\27\3\27\5\27\u014d\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"
			+ "\3\31\7\31\u0159\n\31\f\31\16\31\u015c\13\31\3\32\3\32\3\32\3\32\3\32"
			+ "\5\32\u0163\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\5\33\u0170\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0179\n\34\3"
			+ "\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0182\n\35\3\36\3\36\3\36\3\36"
			+ "\3\36\3\36\3\36\5\36\u018b\n\36\3\37\3\37\3\37\5\37\u0190\n\37\3 \3 \3"
			+ " \3 \3 \3 \3!\3!\3\"\3\"\5\"\u019c\n\"\3#\3#\3#\5#\u01a1\n#\3$\3$\3$\5"
			+ "$\u01a6\n$\3$\3$\7$\u01aa\n$\f$\16$\u01ad\13$\3%\3%\3%\3%\3%\3%\3&\3&"
			+ "\5&\u01b7\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"
			+ "\'\3\'\5\'\u01c9\n\'\3(\3(\3)\3)\5)\u01cf\n)\3*\3*\3*\3+\3+\3+\5+\u01d7"
			+ "\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01e8\n-\3.\3.\3."
			+ "\5.\u01ed\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u01fa"
			+ "\n\62\3\63\6\63\u01fd\n\63\r\63\16\63\u01fe\3\63\2\b\n\22\30&\60F\64\2"
			+ "\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"
			+ "NPRTVXZ\\^`bd\2\b\3\2\n\25\3\2\'\62\3\2$%\3\29A\3\2BC\4\2\66ADM\2\u020c"
			+ "\2f\3\2\2\2\4j\3\2\2\2\6p\3\2\2\2\br\3\2\2\2\nz\3\2\2\2\f\u008f\3\2\2"
			+ "\2\16\u0091\3\2\2\2\20\u0094\3\2\2\2\22\u009c\3\2\2\2\24\u00a6\3\2\2\2"
			+ "\26\u00ad\3\2\2\2\30\u00af\3\2\2\2\32\u00bb\3\2\2\2\34\u0103\3\2\2\2\36"
			+ "\u010a\3\2\2\2 \u0111\3\2\2\2\"\u0115\3\2\2\2$\u0124\3\2\2\2&\u0126\3"
			+ "\2\2\2(\u0138\3\2\2\2*\u0143\3\2\2\2,\u014c\3\2\2\2.\u014e\3\2\2\2\60"
			+ "\u0152\3\2\2\2\62\u0162\3\2\2\2\64\u016f\3\2\2\2\66\u0178\3\2\2\28\u0181"
			+ "\3\2\2\2:\u018a\3\2\2\2<\u018f\3\2\2\2>\u0191\3\2\2\2@\u0197\3\2\2\2B"
			+ "\u019b\3\2\2\2D\u01a0\3\2\2\2F\u01a5\3\2\2\2H\u01ae\3\2\2\2J\u01b6\3\2"
			+ "\2\2L\u01c8\3\2\2\2N\u01ca\3\2\2\2P\u01ce\3\2\2\2R\u01d0\3\2\2\2T\u01d6"
			+ "\3\2\2\2V\u01d8\3\2\2\2X\u01e7\3\2\2\2Z\u01ec\3\2\2\2\\\u01ee\3\2\2\2"
			+ "^\u01f0\3\2\2\2`\u01f2\3\2\2\2b\u01f9\3\2\2\2d\u01fc\3\2\2\2fg\5\4\3\2"
			+ "gh\5\20\t\2hi\5\b\5\2i\3\3\2\2\2jk\7\3\2\2kl\7\4\2\2lm\5\6\4\2mn\5<\37"
			+ "\2no\7\5\2\2o\5\3\2\2\2pq\7P\2\2q\7\3\2\2\2rs\7\6\2\2st\7O\2\2tu\7\7\2"
			+ "\2uv\5\n\6\2vw\7\b\2\2wx\5<\37\2xy\7\5\2\2y\t\3\2\2\2z{\b\6\1\2{|\5\f"
			+ "\7\2|\u0081\3\2\2\2}~\f\3\2\2~\u0080\5\f\7\2\177}\3\2\2\2\u0080\u0083"
			+ "\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\13\3\2\2\2\u0083"
			+ "\u0081\3\2\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\7\2\2\u0086\u0087\5"
			+ "F$\2\u0087\u0088\7\b\2\2\u0088\u0089\5<\37\2\u0089\u008a\7\5\2\2\u008a"
			+ "\u0090\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u008d\5<\37\2\u008d\u008e\7"
			+ "\5\2\2\u008e\u0090\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u008b\3\2\2\2\u0090"
			+ "\r\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\7O\2\2\u0093\17\3\2\2\2\u0094"
			+ "\u0095\7\t\2\2\u0095\u0096\7O\2\2\u0096\u0097\7\7\2\2\u0097\u0098\5\22"
			+ "\n\2\u0098\u0099\7\b\2\2\u0099\u009a\5<\37\2\u009a\u009b\7\5\2\2\u009b"
			+ "\21\3\2\2\2\u009c\u009d\b\n\1\2\u009d\u009e\5\24\13\2\u009e\u00a3\3\2"
			+ "\2\2\u009f\u00a0\f\4\2\2\u00a0\u00a2\5\24\13\2\u00a1\u009f\3\2\2\2\u00a2"
			+ "\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\23\3\2\2"
			+ "\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\7\7\2\2\u00a8"
			+ "\u00a9\5\30\r\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5<\37\2\u00ab\u00ac\7"
			+ "\5\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\27\3\2\2\2\u00af\u00b0"
			+ "\b\r\1\2\u00b0\u00b1\5\32\16\2\u00b1\u00b6\3\2\2\2\u00b2\u00b3\f\3\2\2"
			+ "\u00b3\u00b5\5\32\16\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"
			+ "\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"
			+ "\u00bc\5\34\17\2\u00ba\u00bc\5> \2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"
			+ "\2\2\u00bc\33\3\2\2\2\u00bd\u00be\7\26\2\2\u00be\u00bf\5\"\22\2\u00bf"
			+ "\u00c0\5$\23\2\u00c0\u00c1\5J&\2\u00c1\u00c2\5D#\2\u00c2\u00c3\5(\25\2"
			+ "\u00c3\u00c4\5<\37\2\u00c4\u00c5\7\5\2\2\u00c5\u0104\3\2\2\2\u00c6\u00c7"
			+ "\7\27\2\2\u00c7\u00c8\5\"\22\2\u00c8\u00c9\5$\23\2\u00c9\u00ca\5J&\2\u00ca"
			+ "\u00cb\5D#\2\u00cb\u00cc\5(\25\2\u00cc\u00cd\5<\37\2\u00cd\u00ce\7\5\2"
			+ "\2\u00ce\u0104\3\2\2\2\u00cf\u00d0\7\30\2\2\u00d0\u00d1\5\"\22\2\u00d1"
			+ "\u00d2\5$\23\2\u00d2\u00d3\5J&\2\u00d3\u00d4\5D#\2\u00d4\u00d5\5(\25\2"
			+ "\u00d5\u00d6\5<\37\2\u00d6\u00d7\7\5\2\2\u00d7\u0104\3\2\2\2\u00d8\u00d9"
			+ "\7\31\2\2\u00d9\u00da\5\"\22\2\u00da\u00db\5$\23\2\u00db\u00dc\5J&\2\u00dc"
			+ "\u00dd\5D#\2\u00dd\u00de\5(\25\2\u00de\u00df\5<\37\2\u00df\u00e0\7\5\2"
			+ "\2\u00e0\u0104\3\2\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e3\5\"\22\2\u00e3"
			+ "\u00e4\5*\26\2\u00e4\u00e5\5J&\2\u00e5\u00e6\5D#\2\u00e6\u00e7\5,\27\2"
			+ "\u00e7\u00e8\5<\37\2\u00e8\u00e9\7\5\2\2\u00e9\u0104\3\2\2\2\u00ea\u00eb"
			+ "\7\33\2\2\u00eb\u00ec\5\"\22\2\u00ec\u00ed\5.\30\2\u00ed\u00ee\5J&\2\u00ee"
			+ "\u00ef\5D#\2\u00ef\u00f0\5\66\34\2\u00f0\u00f1\5<\37\2\u00f1\u00f2\7\5"
			+ "\2\2\u00f2\u0104\3\2\2\2\u00f3\u00f4\7\34\2\2\u00f4\u00f5\5\"\22\2\u00f5"
			+ "\u00f6\5J&\2\u00f6\u00f7\5D#\2\u00f7\u00f8\58\35\2\u00f8\u00f9\7\5\2\2"
			+ "\u00f9\u0104\3\2\2\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd"
			+ "\5\64\33\2\u00fd\u00fe\5J&\2\u00fe\u00ff\5D#\2\u00ff\u0100\5:\36\2\u0100"
			+ "\u0101\5<\37\2\u0101\u0102\7\5\2\2\u0102\u0104\3\2\2\2\u0103\u00bd\3\2"
			+ "\2\2\u0103\u00c6\3\2\2\2\u0103\u00cf\3\2\2\2\u0103\u00d8\3\2\2\2\u0103"
			+ "\u00e1\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00f3\3\2\2\2\u0103\u00fa\3\2"
			+ "\2\2\u0104\35\3\2\2\2\u0105\u0106\7\7\2\2\u0106\u0107\5 \21\2\u0107\u0108"
			+ "\7\b\2\2\u0108\u010b\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0105\3\2\2\2\u010a"
			+ "\u0109\3\2\2\2\u010b\37\3\2\2\2\u010c\u0112\5\32\16\2\u010d\u010e\5\32"
			+ "\16\2\u010e\u010f\5 \21\2\u010f\u0112\3\2\2\2\u0110\u0112\3\2\2\2\u0111"
			+ "\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u0110\3\2\2\2\u0112!\3\2\2\2"
			+ "\u0113\u0116\7\36\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114"
			+ "\3\2\2\2\u0116#\3\2\2\2\u0117\u0119\7\37\2\2\u0118\u011a\5P)\2\u0119\u0118"
			+ "\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"
			+ "\u011d\3\2\2\2\u011d\u011e\7 \2\2\u011e\u0125\3\2\2\2\u011f\u0120\7\37"
			+ "\2\2\u0120\u0121\5&\24\2\u0121\u0122\7 \2\2\u0122\u0125\3\2\2\2\u0123"
			+ "\u0125\3\2\2\2\u0124\u0117\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0123\3\2"
			+ "\2\2\u0125%\3\2\2\2\u0126\u0127\b\24\1\2\u0127\u0128\5P)\2\u0128\u012e"
			+ "\3\2\2\2\u0129\u012a\f\3\2\2\u012a\u012b\7!\2\2\u012b\u012d\5P)\2\u012c"
			+ "\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"
			+ "\2\2\u012f\'\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\4\2\2\u0132\u0139"
			+ "\5P)\2\u0133\u0134\7\4\2\2\u0134\u0139\7\"\2\2\u0135\u0136\7\4\2\2\u0136"
			+ "\u0139\7#\2\2\u0137\u0139\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0133\3\2"
			+ "\2\2\u0138\u0135\3\2\2\2\u0138\u0137\3\2\2\2\u0139)\3\2\2\2\u013a\u013c"
			+ "\7\37\2\2\u013b\u013d\5V,\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"
			+ "\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7 "
			+ "\2\2\u0141\u0144\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u013a\3\2\2\2\u0143"
			+ "\u0142\3\2\2\2\u0144+\3\2\2\2\u0145\u0146\7\4\2\2\u0146\u014d\5V,\2\u0147"
			+ "\u0148\7\4\2\2\u0148\u014d\7\"\2\2\u0149\u014a\7\4\2\2\u014a\u014d\7#"
			+ "\2\2\u014b\u014d\3\2\2\2\u014c\u0145\3\2\2\2\u014c\u0147\3\2\2\2\u014c"
			+ "\u0149\3\2\2\2\u014c\u014b\3\2\2\2\u014d-\3\2\2\2\u014e\u014f\7\37\2\2"
			+ "\u014f\u0150\5\60\31\2\u0150\u0151\7 \2\2\u0151/\3\2\2\2\u0152\u0153\b"
			+ "\31\1\2\u0153\u0154\5\62\32\2\u0154\u015a\3\2\2\2\u0155\u0156\f\3\2\2"
			+ "\u0156\u0157\7!\2\2\u0157\u0159\5\62\32\2\u0158\u0155\3\2\2\2\u0159\u015c"
			+ "\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\61\3\2\2\2\u015c"
			+ "\u015a\3\2\2\2\u015d\u0163\7O\2\2\u015e\u015f\7O\2\2\u015f\u0160\5\36"
			+ "\20\2\u0160\u0161\5<\37\2\u0161\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0162"
			+ "\u015e\3\2\2\2\u0163\63\3\2\2\2\u0164\u0165\7\37\2\2\u0165\u0166\7$\2"
			+ "\2\u0166\u0167\5\36\20\2\u0167\u0168\5<\37\2\u0168\u0169\7!\2\2\u0169"
			+ "\u016a\7%\2\2\u016a\u016b\5\36\20\2\u016b\u016c\5<\37\2\u016c\u016d\7"
			+ " \2\2\u016d\u0170\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0164\3\2\2\2\u016f"
			+ "\u016e\3\2\2\2\u0170\65\3\2\2\2\u0171\u0172\7\4\2\2\u0172\u0179\7O\2\2"
			+ "\u0173\u0174\7\4\2\2\u0174\u0179\7\"\2\2\u0175\u0176\7\4\2\2\u0176\u0179"
			+ "\7#\2\2\u0177\u0179\3\2\2\2\u0178\u0171\3\2\2\2\u0178\u0173\3\2\2\2\u0178"
			+ "\u0175\3\2\2\2\u0178\u0177\3\2\2\2\u0179\67\3\2\2\2\u017a\u017b\7\4\2"
			+ "\2\u017b\u0182\7P\2\2\u017c\u017d\7\4\2\2\u017d\u0182\7\"\2\2\u017e\u017f"
			+ "\7\4\2\2\u017f\u0182\7#\2\2\u0180\u0182\3\2\2\2\u0181\u017a\3\2\2\2\u0181"
			+ "\u017c\3\2\2\2\u0181\u017e\3\2\2\2\u0181\u0180\3\2\2\2\u01829\3\2\2\2"
			+ "\u0183\u0184\7\4\2\2\u0184\u018b\5N(\2\u0185\u0186\7\4\2\2\u0186\u018b"
			+ "\7\"\2\2\u0187\u0188\7\4\2\2\u0188\u018b\7#\2\2\u0189\u018b\3\2\2\2\u018a"
			+ "\u0183\3\2\2\2\u018a\u0185\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0189\3\2"
			+ "\2\2\u018b;\3\2\2\2\u018c\u018d\7&\2\2\u018d\u0190\7P\2\2\u018e\u0190"
			+ "\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018e\3\2\2\2\u0190=\3\2\2\2\u0191"
			+ "\u0192\5@!\2\u0192\u0193\5B\"\2\u0193\u0194\5D#\2\u0194\u0195\5<\37\2"
			+ "\u0195\u0196\7\5\2\2\u0196?\3\2\2\2\u0197\u0198\t\3\2\2\u0198A\3\2\2\2"
			+ "\u0199\u019c\7O\2\2\u019a\u019c\5\26\f\2\u019b\u0199\3\2\2\2\u019b\u019a"
			+ "\3\2\2\2\u019cC\3\2\2\2\u019d\u019e\7\37\2\2\u019e\u01a1\7 \2\2\u019f"
			+ "\u01a1\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1E\3\2\2\2"
			+ "\u01a2\u01a3\b$\1\2\u01a3\u01a6\5H%\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2"
			+ "\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01ab\3\2\2\2\u01a7\u01a8\f\4\2\2\u01a8"
			+ "\u01aa\5H%\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2"
			+ "\2\u01ab\u01ac\3\2\2\2\u01acG\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af"
			+ "\5J&\2\u01af\u01b0\7\4\2\2\u01b0\u01b1\5L\'\2\u01b1\u01b2\5<\37\2\u01b2"
			+ "\u01b3\7\5\2\2\u01b3I\3\2\2\2\u01b4\u01b7\7O\2\2\u01b5\u01b7\5\26\f\2"
			+ "\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7K\3\2\2\2\u01b8\u01c9\7"
			+ "O\2\2\u01b9\u01ba\7O\2\2\u01ba\u01bb\7\7\2\2\u01bb\u01bc\5F$\2\u01bc\u01bd"
			+ "\7\b\2\2\u01bd\u01c9\3\2\2\2\u01be\u01c9\5N(\2\u01bf\u01c0\5N(\2\u01c0"
			+ "\u01c1\7\7\2\2\u01c1\u01c2\5F$\2\u01c2\u01c3\7\b\2\2\u01c3\u01c9\3\2\2"
			+ "\2\u01c4\u01c9\5P)\2\u01c5\u01c9\5V,\2\u01c6\u01c9\7P\2\2\u01c7\u01c9"
			+ "\7#\2\2\u01c8\u01b8\3\2\2\2\u01c8\u01b9\3\2\2\2\u01c8\u01be\3\2\2\2\u01c8"
			+ "\u01bf\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2"
			+ "\2\2\u01c8\u01c7\3\2\2\2\u01c9M\3\2\2\2\u01ca\u01cb\t\4\2\2\u01cbO\3\2"
			+ "\2\2\u01cc\u01cf\5R*\2\u01cd\u01cf\5`\61\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd"
			+ "\3\2\2\2\u01cfQ\3\2\2\2\u01d0\u01d1\5T+\2\u01d1\u01d2\5Z.\2\u01d2S\3\2"
			+ "\2\2\u01d3\u01d7\7\63\2\2\u01d4\u01d7\7\64\2\2\u01d5\u01d7\3\2\2\2\u01d6"
			+ "\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7U\3\2\2\2"
			+ "\u01d8\u01d9\5T+\2\u01d9\u01da\5Z.\2\u01da\u01db\7\65\2\2\u01db\u01dc"
			+ "\5Z.\2\u01dc\u01dd\5X-\2\u01ddW\3\2\2\2\u01de\u01df\7\66\2\2\u01df\u01e0"
			+ "\5T+\2\u01e0\u01e1\5Z.\2\u01e1\u01e8\3\2\2\2\u01e2\u01e3\7\67\2\2\u01e3"
			+ "\u01e4\5T+\2\u01e4\u01e5\5Z.\2\u01e5\u01e8\3\2\2\2\u01e6\u01e8\3\2\2\2"
			+ "\u01e7\u01de\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8Y\3"
			+ "\2\2\2\u01e9\u01ed\5\\/\2\u01ea\u01ed\5^\60\2\u01eb\u01ed\7N\2\2\u01ec"
			+ "\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed[\3\2\2\2"
			+ "\u01ee\u01ef\78\2\2\u01ef]\3\2\2\2\u01f0\u01f1\t\5\2\2\u01f1_\3\2\2\2"
			+ "\u01f2\u01f3\t\6\2\2\u01f3\u01f4\5b\62\2\u01f4a\3\2\2\2\u01f5\u01fa\5"
			+ "d\63\2\u01f6\u01f7\5d\63\2\u01f7\u01f8\5b\62\2\u01f8\u01fa\3\2\2\2\u01f9"
			+ "\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fac\3\2\2\2\u01fb\u01fd\t\7\2\2"
			+ "\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff"
			+ "\3\2\2\2\u01ffe\3\2\2\2%\u0081\u008f\u00a3\u00b6\u00bb\u0103\u010a\u0111"
			+ "\u0115\u011b\u0124\u012e\u0138\u013e\u0143\u014c\u015a\u0162\u016f\u0178"
			+ "\u0181\u018a\u018f\u019b\u01a0\u01a5\u01ab\u01b6\u01c8\u01ce\u01d6\u01e7" + "\u01ec\u01f9\u01fe";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	private void finalizeOilObjCreation() {
		if (currentObject instanceof OilTask) {
			oil.addTask((OilTask) currentObject);
		} else if (currentObject instanceof OilEvent) {
			oil.addEvent((OilEvent) currentObject);
		} else if (currentObject instanceof OilResource) {
			oil.addResource((OilResource) currentObject);
		} else if (currentObject instanceof OilAlarm) {
			oil.addAlarm((OilAlarm) currentObject);
		} else if (currentObject instanceof OilISR) {
			oil.addIsr((OilISR) currentObject);
		} else if (currentObject instanceof OilOs) {
			/*
			if (!((OilOs) currentObject).getOtherAttributes().isEmpty()) {
				String[] temp = ((OilOs) currentObject).getOtherAttributes().get(0).toString().split(" = \"");
				((OilOs) currentObject).setAppSrc(temp[1]);
				((OilOs) currentObject).getOtherAttributes().remove(0);
			}
			*/
			oil.setOs((OilOs) currentObject);
		} else if (currentObject instanceof OilAppMode) {

		}
	}

	public void makeObject(String Name) {
		switch (Name) {
		case "OS":
			try {
				currentObject = new OilOs();
				currentObject.setName(Name);
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "APPMODE":
			currentObject = new OilAppMode();
			try {
				currentObject.setName(Name);
			} catch (InvalidOilException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "TASK":
			currentObject = new OilTask();
			try {
				currentObject.setName(Name);
			} catch (InvalidOilException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "RESOURCE":
			currentObject = new OilResource();
			try {
				currentObject.setName(Name);
			} catch (InvalidOilException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "EVENT":
			currentObject = new OilEvent();
			try {
				currentObject.setName(Name);
			} catch (InvalidOilException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "ALARM":
			currentObject = new OilAlarm();
			try {
				currentObject.setName(Name);
			} catch (InvalidOilException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "ISR":
			currentObject = new OilISR();
			try {
				currentObject.setName(Name);
			} catch (InvalidOilException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "COUNTER":
			try {
				currentObject = new OilCounter();
				currentObject.setName(Name);
			} catch (InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
			
	}
	public void addAttribute_list(){
		String list_name = (String)attr_list.poll();
		String list_value = (String)attr_list.poll();
		while(attr_list.peek() != null)
		{
			String name = (String)attr_list.poll();
			String value = (String)attr_list.poll();
			try {
				currentObject.addAttribute(list_name, list_value, name,  value);
			} catch (NumberFormatException | InvalidOilException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public OilSpec getOilSpec() {
	    this.oil.updateCeilingPriority();
	    return this.oil;
	  }

}
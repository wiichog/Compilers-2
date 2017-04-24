package compilers;
// Generated from Compilers.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, STRUCT=2, TRUE=3, FALSE=4, INT=5, IF=6, ELSE=7, WHILE=8, RETURN=9, 
		CHAR=10, BOOLEAN=11, VOID=12, SCAN=13, PRINT=14, WS=15, CHR=16, ID=17, 
		NUM=18, STRING=19, COMMENT=20, COMA=21, AND=22, OR=23, LBRACE=24, RBRACE=25, 
		DOTCOMMA=26, RCORCH=27, LCORCH=28, LPARENT=29, RPARENT=30, EQ=31, DOT=32, 
		PLUS=33, MINUS=34, EXC=35, AST=36, SLSH=37, PRCNT=38, MTHAN=39, LTHAN=40, 
		EQMTHAN=41, EQLTHAN=42, EQEQ=43, NOTEQ=44;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_varDeclaration = 2, RULE_structDeclaration = 3, 
		RULE_varType = 4, RULE_methodDeclaration = 5, RULE_methodType = 6, RULE_parameterDeclaration = 7, 
		RULE_parameterType = 8, RULE_block = 9, RULE_statement = 10, RULE_assignation = 11, 
		RULE_whileBlock = 12, RULE_returnBlock = 13, RULE_print = 14, RULE_scan = 15, 
		RULE_ifBlock = 16, RULE_elseBlock = 17, RULE_elseTailBlock = 18, RULE_location = 19, 
		RULE_dotLocation = 20, RULE_declaredVariable = 21, RULE_variable = 22, 
		RULE_arrayVariable = 23, RULE_expressionInP = 24, RULE_nExpression = 25, 
		RULE_orExpression = 26, RULE_andExpression = 27, RULE_equalsExpression = 28, 
		RULE_relationExpression = 29, RULE_addSubsExpression = 30, RULE_mulDivExpression = 31, 
		RULE_prExpression = 32, RULE_basicExpression = 33, RULE_basic = 34, RULE_arg = 35, 
		RULE_declaredMethodCall = 36, RULE_as_op = 37, RULE_md_op = 38, RULE_pr_op = 39, 
		RULE_rel_op = 40, RULE_eq_op = 41, RULE_cond_op = 42, RULE_literal = 43, 
		RULE_int_literal = 44, RULE_char_literal = 45, RULE_bool_literal = 46;
	public static final String[] ruleNames = {
		"program", "declaration", "varDeclaration", "structDeclaration", "varType", 
		"methodDeclaration", "methodType", "parameterDeclaration", "parameterType", 
		"block", "statement", "assignation", "whileBlock", "returnBlock", "print", 
		"scan", "ifBlock", "elseBlock", "elseTailBlock", "location", "dotLocation", 
		"declaredVariable", "variable", "arrayVariable", "expressionInP", "nExpression", 
		"orExpression", "andExpression", "equalsExpression", "relationExpression", 
		"addSubsExpression", "mulDivExpression", "prExpression", "basicExpression", 
		"basic", "arg", "declaredMethodCall", "as_op", "md_op", "pr_op", "rel_op", 
		"eq_op", "cond_op", "literal", "int_literal", "char_literal", "bool_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'struct'", "'true'", "'false'", "'int'", "'if'", "'else'", 
		"'while'", "'return'", "'char'", "'boolean'", "'void'", "'scan'", "'print'", 
		null, null, null, null, null, null, "','", "'&&'", "'||'", "'{'", "'}'", 
		"';'", "']'", "'['", "'('", "')'", "'='", "'.'", "'+'", "'-'", "'!'", 
		"'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "STRUCT", "TRUE", "FALSE", "INT", "IF", "ELSE", "WHILE", 
		"RETURN", "CHAR", "BOOLEAN", "VOID", "SCAN", "PRINT", "WS", "CHR", "ID", 
		"NUM", "STRING", "COMMENT", "COMA", "AND", "OR", "LBRACE", "RBRACE", "DOTCOMMA", 
		"RCORCH", "LCORCH", "LPARENT", "RPARENT", "EQ", "DOT", "PLUS", "MINUS", 
		"EXC", "AST", "SLSH", "PRCNT", "MTHAN", "LTHAN", "EQMTHAN", "EQLTHAN", 
		"EQEQ", "NOTEQ"
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
	public String getGrammarFileName() { return "Compilers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompilersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CompilersParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(CompilersParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CompilersParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(CLASS);
			setState(95);
			match(ID);
			setState(96);
			match(LBRACE);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(97);
				declaration();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(RBRACE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				structDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				methodDeclaration();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CompilersParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CompilersParser.ID, i);
		}
		public TerminalNode DOTCOMMA() { return getToken(CompilersParser.DOTCOMMA, 0); }
		public TerminalNode LCORCH() { return getToken(CompilersParser.LCORCH, 0); }
		public TerminalNode NUM() { return getToken(CompilersParser.NUM, 0); }
		public TerminalNode RCORCH() { return getToken(CompilersParser.RCORCH, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				varType();
				setState(111);
				match(ID);
				setState(112);
				match(DOTCOMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				varType();
				setState(115);
				match(ID);
				setState(116);
				match(LCORCH);
				setState(117);
				match(NUM);
				setState(118);
				match(RCORCH);
				setState(119);
				match(DOTCOMMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(ID);
				setState(122);
				match(ID);
				setState(123);
				match(DOTCOMMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(ID);
				setState(125);
				match(ID);
				setState(126);
				match(LCORCH);
				setState(127);
				match(NUM);
				setState(128);
				match(RCORCH);
				setState(129);
				match(DOTCOMMA);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CompilersParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(CompilersParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CompilersParser.RBRACE, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(STRUCT);
			setState(133);
			match(ID);
			setState(134);
			match(LBRACE);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(135);
				varDeclaration();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(RBRACE);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CompilersParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CompilersParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(CompilersParser.BOOLEAN, 0); }
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CompilersParser.VOID, 0); }
		public TerminalNode STRUCT() { return getToken(CompilersParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(143);
				match(INT);
				}
				break;
			case 2:
				{
				setState(144);
				match(CHAR);
				}
				break;
			case 3:
				{
				setState(145);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				{
				setState(146);
				match(STRUCT);
				setState(147);
				match(ID);
				}
				}
				break;
			case 5:
				{
				setState(148);
				structDeclaration();
				}
				break;
			case 6:
				{
				setState(149);
				match(VOID);
				}
				break;
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CompilersParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CompilersParser.COMA, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			methodType();
			setState(153);
			match(ID);
			setState(154);
			match(LPARENT);
			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) {
				{
				setState(155);
				parameterDeclaration();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(156);
					match(COMA);
					setState(157);
					parameterDeclaration();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(165);
			match(RPARENT);
			setState(166);
			block();
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CompilersParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CompilersParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(CompilersParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(CompilersParser.VOID, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CompilersParser.LCORCH, 0); }
		public TerminalNode RCORCH() { return getToken(CompilersParser.RCORCH, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterDeclaration);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				parameterType();
				setState(171);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				parameterType();
				setState(174);
				match(ID);
				setState(175);
				match(LCORCH);
				setState(176);
				match(RCORCH);
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

	public static class ParameterTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CompilersParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CompilersParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(CompilersParser.BOOLEAN, 0); }
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CompilersParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CompilersParser.RBRACE, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LBRACE);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					varDeclaration();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << CHR) | (1L << ID) | (1L << NUM) | (1L << LPARENT) | (1L << MINUS) | (1L << EXC))) != 0)) {
				{
				{
				setState(189);
				statement();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DeclaredMethodCallContext declaredMethodCall() {
			return getRuleContext(DeclaredMethodCallContext.class,0);
		}
		public TerminalNode DOTCOMMA() { return getToken(CompilersParser.DOTCOMMA, 0); }
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				returnBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				whileBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				declaredMethodCall();
				setState(201);
				match(DOTCOMMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				assignation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				orExpression(0);
				setState(205);
				match(DOTCOMMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				print();
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

	public static class AssignationContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CompilersParser.EQ, 0); }
		public TerminalNode DOTCOMMA() { return getToken(CompilersParser.DOTCOMMA, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			location();
			setState(211);
			match(EQ);
			setState(214);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CHR:
			case ID:
			case NUM:
			case LPARENT:
			case MINUS:
			case EXC:
				{
				setState(212);
				orExpression(0);
				}
				break;
			case SCAN:
				{
				setState(213);
				scan();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			match(DOTCOMMA);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CompilersParser.WHILE, 0); }
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(WHILE);
			setState(219);
			match(LPARENT);
			setState(220);
			orExpression(0);
			setState(221);
			match(RPARENT);
			setState(222);
			block();
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

	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CompilersParser.RETURN, 0); }
		public TerminalNode DOTCOMMA() { return getToken(CompilersParser.DOTCOMMA, 0); }
		public NExpressionContext nExpression() {
			return getRuleContext(NExpressionContext.class,0);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(RETURN);
			{
			setState(225);
			nExpression();
			}
			setState(226);
			match(DOTCOMMA);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CompilersParser.PRINT, 0); }
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public TerminalNode DOTCOMMA() { return getToken(CompilersParser.DOTCOMMA, 0); }
		public TerminalNode STRING() { return getToken(CompilersParser.STRING, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(PRINT);
			setState(229);
			match(LPARENT);
			setState(232);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(230);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(231);
				location();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(234);
			match(RPARENT);
			setState(235);
			match(DOTCOMMA);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(CompilersParser.SCAN, 0); }
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(SCAN);
			setState(238);
			match(LPARENT);
			setState(239);
			match(RPARENT);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompilersParser.IF, 0); }
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IF);
			setState(242);
			match(LPARENT);
			setState(243);
			orExpression(0);
			setState(244);
			match(RPARENT);
			setState(245);
			block();
			setState(246);
			elseBlock();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompilersParser.ELSE, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseTailBlockContext elseTailBlock() {
			return getRuleContext(ElseTailBlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseBlock);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(ELSE);
				setState(249);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				elseTailBlock();
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

	public static class ElseTailBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompilersParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseTailBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseTailBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitElseTailBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseTailBlockContext elseTailBlock() throws RecognitionException {
		ElseTailBlockContext _localctx = new ElseTailBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseTailBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ELSE);
			setState(255);
			block();
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

	public static class LocationContext extends ParserRuleContext {
		public DeclaredVariableContext declaredVariable() {
			return getRuleContext(DeclaredVariableContext.class,0);
		}
		public DotLocationContext dotLocation() {
			return getRuleContext(DotLocationContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_location);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				declaredVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				dotLocation();
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

	public static class DotLocationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CompilersParser.DOT, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ArrayVariableContext arrayVariable() {
			return getRuleContext(ArrayVariableContext.class,0);
		}
		public DotLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotLocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitDotLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotLocationContext dotLocation() throws RecognitionException {
		DotLocationContext _localctx = new DotLocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dotLocation);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				variable();
				{
				setState(262);
				match(DOT);
				setState(263);
				location();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				arrayVariable();
				{
				setState(266);
				match(DOT);
				setState(267);
				location();
				}
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

	public static class DeclaredVariableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrayVariableContext arrayVariable() {
			return getRuleContext(ArrayVariableContext.class,0);
		}
		public DeclaredVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaredVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitDeclaredVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaredVariableContext declaredVariable() throws RecognitionException {
		DeclaredVariableContext _localctx = new DeclaredVariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaredVariable);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				arrayVariable();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
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

	public static class ArrayVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CompilersParser.LCORCH, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CompilersParser.RCORCH, 0); }
		public ArrayVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitArrayVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableContext arrayVariable() throws RecognitionException {
		ArrayVariableContext _localctx = new ArrayVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(278);
			match(LCORCH);
			setState(279);
			orExpression(0);
			setState(280);
			match(RCORCH);
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

	public static class ExpressionInPContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public ExpressionInPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInP; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitExpressionInP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionInPContext expressionInP() throws RecognitionException {
		ExpressionInPContext _localctx = new ExpressionInPContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionInP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LPARENT);
			setState(283);
			orExpression(0);
			setState(284);
			match(RPARENT);
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

	public static class NExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public NExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitNExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NExpressionContext nExpression() throws RecognitionException {
		NExpressionContext _localctx = new NExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nExpression);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CHR:
			case ID:
			case NUM:
			case LPARENT:
			case MINUS:
			case EXC:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				orExpression(0);
				}
				break;
			case DOTCOMMA:
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

	public static class OrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(CompilersParser.OR, 0); }
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(293);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(294);
					match(OR);
					setState(295);
					andExpression(0);
					}
					} 
				}
				setState(300);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CompilersParser.AND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			equalsExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(304);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(305);
					match(AND);
					setState(306);
					equalsExpression(0);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class EqualsExpressionContext extends ParserRuleContext {
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public EqualsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsExpressionContext equalsExpression() throws RecognitionException {
		return equalsExpression(0);
	}

	private EqualsExpressionContext equalsExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualsExpressionContext _localctx = new EqualsExpressionContext(_ctx, _parentState);
		EqualsExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_equalsExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			relationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualsExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalsExpression);
					setState(315);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(316);
					eq_op();
					setState(317);
					relationExpression(0);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class RelationExpressionContext extends ParserRuleContext {
		public AddSubsExpressionContext addSubsExpression() {
			return getRuleContext(AddSubsExpressionContext.class,0);
		}
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitRelationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExpressionContext relationExpression() throws RecognitionException {
		return relationExpression(0);
	}

	private RelationExpressionContext relationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, _parentState);
		RelationExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_relationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(325);
			addSubsExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpression);
					setState(327);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(328);
					rel_op();
					setState(329);
					addSubsExpression(0);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class AddSubsExpressionContext extends ParserRuleContext {
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public AddSubsExpressionContext addSubsExpression() {
			return getRuleContext(AddSubsExpressionContext.class,0);
		}
		public As_opContext as_op() {
			return getRuleContext(As_opContext.class,0);
		}
		public AddSubsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubsExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitAddSubsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubsExpressionContext addSubsExpression() throws RecognitionException {
		return addSubsExpression(0);
	}

	private AddSubsExpressionContext addSubsExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubsExpressionContext _localctx = new AddSubsExpressionContext(_ctx, _parentState);
		AddSubsExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_addSubsExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(337);
			mulDivExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubsExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addSubsExpression);
					setState(339);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(340);
					as_op();
					setState(341);
					mulDivExpression(0);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class MulDivExpressionContext extends ParserRuleContext {
		public PrExpressionContext prExpression() {
			return getRuleContext(PrExpressionContext.class,0);
		}
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public Md_opContext md_op() {
			return getRuleContext(Md_opContext.class,0);
		}
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		return mulDivExpression(0);
	}

	private MulDivExpressionContext mulDivExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, _parentState);
		MulDivExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_mulDivExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			prExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulDivExpression);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					md_op();
					setState(353);
					prExpression(0);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class PrExpressionContext extends ParserRuleContext {
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public PrExpressionContext prExpression() {
			return getRuleContext(PrExpressionContext.class,0);
		}
		public Pr_opContext pr_op() {
			return getRuleContext(Pr_opContext.class,0);
		}
		public PrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitPrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrExpressionContext prExpression() throws RecognitionException {
		return prExpression(0);
	}

	private PrExpressionContext prExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrExpressionContext _localctx = new PrExpressionContext(_ctx, _parentState);
		PrExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_prExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(361);
			basicExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_prExpression);
					setState(363);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(364);
					pr_op();
					setState(365);
					basicExpression();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class BasicExpressionContext extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public BasicContext basic() {
			return getRuleContext(BasicContext.class,0);
		}
		public TerminalNode INT() { return getToken(CompilersParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CompilersParser.CHAR, 0); }
		public TerminalNode MINUS() { return getToken(CompilersParser.MINUS, 0); }
		public TerminalNode EXC() { return getToken(CompilersParser.EXC, 0); }
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitBasicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_basicExpression);
		int _la;
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(LPARENT);
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==CHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(374);
				match(RPARENT);
				setState(375);
				basic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(MINUS);
				setState(377);
				basic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(EXC);
				setState(379);
				basic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				basic();
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

	public static class BasicContext extends ParserRuleContext {
		public ExpressionInPContext expressionInP() {
			return getRuleContext(ExpressionInPContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public DeclaredMethodCallContext declaredMethodCall() {
			return getRuleContext(DeclaredMethodCallContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicContext basic() throws RecognitionException {
		BasicContext _localctx = new BasicContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_basic);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				expressionInP();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				location();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				declaredMethodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				literal();
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

	public static class ArgContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			orExpression(0);
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

	public static class DeclaredMethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilersParser.ID, 0); }
		public TerminalNode LPARENT() { return getToken(CompilersParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(CompilersParser.RPARENT, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CompilersParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CompilersParser.COMA, i);
		}
		public DeclaredMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaredMethodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitDeclaredMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaredMethodCallContext declaredMethodCall() throws RecognitionException {
		DeclaredMethodCallContext _localctx = new DeclaredMethodCallContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declaredMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(ID);
			setState(392);
			match(LPARENT);
			setState(401);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << CHR) | (1L << ID) | (1L << NUM) | (1L << LPARENT) | (1L << MINUS) | (1L << EXC))) != 0)) {
				{
				setState(393);
				arg();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(394);
					match(COMA);
					setState(395);
					arg();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(403);
			match(RPARENT);
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

	public static class As_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CompilersParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CompilersParser.MINUS, 0); }
		public As_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitAs_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_opContext as_op() throws RecognitionException {
		As_opContext _localctx = new As_opContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_as_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Md_opContext extends ParserRuleContext {
		public TerminalNode AST() { return getToken(CompilersParser.AST, 0); }
		public TerminalNode SLSH() { return getToken(CompilersParser.SLSH, 0); }
		public Md_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitMd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Md_opContext md_op() throws RecognitionException {
		Md_opContext _localctx = new Md_opContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_md_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !(_la==AST || _la==SLSH) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Pr_opContext extends ParserRuleContext {
		public TerminalNode PRCNT() { return getToken(CompilersParser.PRCNT, 0); }
		public Pr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitPr_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pr_opContext pr_op() throws RecognitionException {
		Pr_opContext _localctx = new Pr_opContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pr_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(PRCNT);
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode LTHAN() { return getToken(CompilersParser.LTHAN, 0); }
		public TerminalNode MTHAN() { return getToken(CompilersParser.MTHAN, 0); }
		public TerminalNode EQLTHAN() { return getToken(CompilersParser.EQLTHAN, 0); }
		public TerminalNode EQMTHAN() { return getToken(CompilersParser.EQMTHAN, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MTHAN) | (1L << LTHAN) | (1L << EQMTHAN) | (1L << EQLTHAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(CompilersParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(CompilersParser.NOTEQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==EQEQ || _la==NOTEQ) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CompilersParser.AND, 0); }
		public TerminalNode OR() { return getToken(CompilersParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				int_literal();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				char_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				bool_literal();
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

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(CompilersParser.NUM, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(NUM);
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(CompilersParser.CHR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(CHR);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CompilersParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CompilersParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilersVisitor ) return ((CompilersVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 27:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 28:
			return equalsExpression_sempred((EqualsExpressionContext)_localctx, predIndex);
		case 29:
			return relationExpression_sempred((RelationExpressionContext)_localctx, predIndex);
		case 30:
			return addSubsExpression_sempred((AddSubsExpressionContext)_localctx, predIndex);
		case 31:
			return mulDivExpression_sempred((MulDivExpressionContext)_localctx, predIndex);
		case 32:
			return prExpression_sempred((PrExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalsExpression_sempred(EqualsExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationExpression_sempred(RelationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addSubsExpression_sempred(AddSubsExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulDivExpression_sempred(MulDivExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean prExpression_sempred(PrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u01af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\7\2e\n\2\f\2\16\2h\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0085\n\4\3\5\3\5\3\5\3"+
		"\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0099\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a1\n\7\f\7\16\7\u00a4"+
		"\13\7\5\7\u00a6\n\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00b5\n\t\3\n\3\n\3\13\3\13\7\13\u00bb\n\13\f\13\16\13\u00be\13"+
		"\13\3\13\7\13\u00c1\n\13\f\13\16\13\u00c4\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\3\r\3\r\3\r\3\r\5\r\u00d9"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\5\20\u00eb\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00ff\n\23\3\24"+
		"\3\24\3\24\3\25\3\25\5\25\u0106\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0110\n\26\3\27\3\27\5\27\u0114\n\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u0123\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\7\34\u012b\n\34\f\34\16\34\u012e\13\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u0136\n\35\f\35\16\35\u0139\13\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u0142\n\36\f\36\16\36\u0145\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u014e\n\37\f\37\16\37\u0151\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \7 \u015a\n \f \16 \u015d\13 \3!\3!\3!\3!\3!\3!\3"+
		"!\7!\u0166\n!\f!\16!\u0169\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0172\n"+
		"\"\f\"\16\"\u0175\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0180\n#\3$\3$\3"+
		"$\3$\5$\u0186\n$\3%\3%\3&\3&\3&\3&\3&\7&\u018f\n&\f&\16&\u0192\13&\5&"+
		"\u0194\n&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\5-\u01a7"+
		"\n-\3.\3.\3/\3/\3\60\3\60\3\60\2\t\668:<>@B\61\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\13\4\2\7\7"+
		"\f\16\4\2\7\7\f\r\4\2\7\7\f\f\3\2#$\3\2&\'\3\2),\3\2-.\3\2\30\31\3\2\5"+
		"\6\u01af\2`\3\2\2\2\4n\3\2\2\2\6\u0084\3\2\2\2\b\u0086\3\2\2\2\n\u0098"+
		"\3\2\2\2\f\u009a\3\2\2\2\16\u00aa\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3"+
		"\2\2\2\24\u00b8\3\2\2\2\26\u00d2\3\2\2\2\30\u00d4\3\2\2\2\32\u00dc\3\2"+
		"\2\2\34\u00e2\3\2\2\2\36\u00e6\3\2\2\2 \u00ef\3\2\2\2\"\u00f3\3\2\2\2"+
		"$\u00fe\3\2\2\2&\u0100\3\2\2\2(\u0105\3\2\2\2*\u010f\3\2\2\2,\u0113\3"+
		"\2\2\2.\u0115\3\2\2\2\60\u0117\3\2\2\2\62\u011c\3\2\2\2\64\u0122\3\2\2"+
		"\2\66\u0124\3\2\2\28\u012f\3\2\2\2:\u013a\3\2\2\2<\u0146\3\2\2\2>\u0152"+
		"\3\2\2\2@\u015e\3\2\2\2B\u016a\3\2\2\2D\u017f\3\2\2\2F\u0185\3\2\2\2H"+
		"\u0187\3\2\2\2J\u0189\3\2\2\2L\u0197\3\2\2\2N\u0199\3\2\2\2P\u019b\3\2"+
		"\2\2R\u019d\3\2\2\2T\u019f\3\2\2\2V\u01a1\3\2\2\2X\u01a6\3\2\2\2Z\u01a8"+
		"\3\2\2\2\\\u01aa\3\2\2\2^\u01ac\3\2\2\2`a\7\3\2\2ab\7\23\2\2bf\7\32\2"+
		"\2ce\5\4\3\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2"+
		"\2ij\7\33\2\2j\3\3\2\2\2ko\5\b\5\2lo\5\6\4\2mo\5\f\7\2nk\3\2\2\2nl\3\2"+
		"\2\2nm\3\2\2\2o\5\3\2\2\2pq\5\n\6\2qr\7\23\2\2rs\7\34\2\2s\u0085\3\2\2"+
		"\2tu\5\n\6\2uv\7\23\2\2vw\7\36\2\2wx\7\24\2\2xy\7\35\2\2yz\7\34\2\2z\u0085"+
		"\3\2\2\2{|\7\23\2\2|}\7\23\2\2}\u0085\7\34\2\2~\177\7\23\2\2\177\u0080"+
		"\7\23\2\2\u0080\u0081\7\36\2\2\u0081\u0082\7\24\2\2\u0082\u0083\7\35\2"+
		"\2\u0083\u0085\7\34\2\2\u0084p\3\2\2\2\u0084t\3\2\2\2\u0084{\3\2\2\2\u0084"+
		"~\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7\4\2\2\u0087\u0088\7\23\2\2\u0088"+
		"\u008c\7\32\2\2\u0089\u008b\5\6\4\2\u008a\u0089\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7\33\2\2\u0090\t\3\2\2\2\u0091\u0099\7\7\2"+
		"\2\u0092\u0099\7\f\2\2\u0093\u0099\7\r\2\2\u0094\u0095\7\4\2\2\u0095\u0099"+
		"\7\23\2\2\u0096\u0099\5\b\5\2\u0097\u0099\7\16\2\2\u0098\u0091\3\2\2\2"+
		"\u0098\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0097\3\2\2\2\u0099\13\3\2\2\2\u009a\u009b\5\16\b\2\u009b"+
		"\u009c\7\23\2\2\u009c\u00a5\7\37\2\2\u009d\u00a2\5\20\t\2\u009e\u009f"+
		"\7\27\2\2\u009f\u00a1\5\20\t\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\7 \2\2\u00a8\u00a9\5\24\13\2\u00a9\r\3\2\2\2\u00aa\u00ab\t\2\2"+
		"\2\u00ab\17\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\23\2\2\u00ae\u00b5"+
		"\3\2\2\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\7\36\2"+
		"\2\u00b2\u00b3\7\35\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00af\3\2\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\23\3\2\2\2\u00b8"+
		"\u00bc\7\32\2\2\u00b9\u00bb\5\6\4\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c1\5\26\f\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\33\2\2\u00c6\25\3\2\2\2\u00c7\u00d3\5\"\22"+
		"\2\u00c8\u00d3\5\34\17\2\u00c9\u00d3\5\32\16\2\u00ca\u00cb\5J&\2\u00cb"+
		"\u00cc\7\34\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00d3\5\30\r\2\u00ce\u00cf\5"+
		"\66\34\2\u00cf\u00d0\7\34\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5\36\20"+
		"\2\u00d2\u00c7\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca"+
		"\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\27\3\2\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d8\7!\2\2\u00d6\u00d9\5\66\34"+
		"\2\u00d7\u00d9\5 \21\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\7\34\2\2\u00db\31\3\2\2\2\u00dc\u00dd\7\n\2\2\u00dd"+
		"\u00de\7\37\2\2\u00de\u00df\5\66\34\2\u00df\u00e0\7 \2\2\u00e0\u00e1\5"+
		"\24\13\2\u00e1\33\3\2\2\2\u00e2\u00e3\7\13\2\2\u00e3\u00e4\5\64\33\2\u00e4"+
		"\u00e5\7\34\2\2\u00e5\35\3\2\2\2\u00e6\u00e7\7\20\2\2\u00e7\u00ea\7\37"+
		"\2\2\u00e8\u00eb\7\25\2\2\u00e9\u00eb\5(\25\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7 \2\2\u00ed\u00ee\7\34"+
		"\2\2\u00ee\37\3\2\2\2\u00ef\u00f0\7\17\2\2\u00f0\u00f1\7\37\2\2\u00f1"+
		"\u00f2\7 \2\2\u00f2!\3\2\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\7\37\2\2"+
		"\u00f5\u00f6\5\66\34\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\5\24\13\2\u00f8"+
		"\u00f9\5$\23\2\u00f9#\3\2\2\2\u00fa\u00fb\7\t\2\2\u00fb\u00ff\5\"\22\2"+
		"\u00fc\u00ff\5&\24\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff%\3\2\2\2\u0100\u0101\7\t\2\2\u0101"+
		"\u0102\5\24\13\2\u0102\'\3\2\2\2\u0103\u0106\5,\27\2\u0104\u0106\5*\26"+
		"\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106)\3\2\2\2\u0107\u0108"+
		"\5.\30\2\u0108\u0109\7\"\2\2\u0109\u010a\5(\25\2\u010a\u0110\3\2\2\2\u010b"+
		"\u010c\5\60\31\2\u010c\u010d\7\"\2\2\u010d\u010e\5(\25\2\u010e\u0110\3"+
		"\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110+\3\2\2\2\u0111\u0114"+
		"\5.\30\2\u0112\u0114\5\60\31\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2"+
		"\u0114-\3\2\2\2\u0115\u0116\7\23\2\2\u0116/\3\2\2\2\u0117\u0118\7\23\2"+
		"\2\u0118\u0119\7\36\2\2\u0119\u011a\5\66\34\2\u011a\u011b\7\35\2\2\u011b"+
		"\61\3\2\2\2\u011c\u011d\7\37\2\2\u011d\u011e\5\66\34\2\u011e\u011f\7 "+
		"\2\2\u011f\63\3\2\2\2\u0120\u0123\5\66\34\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\65\3\2\2\2\u0124\u0125\b\34\1"+
		"\2\u0125\u0126\58\35\2\u0126\u012c\3\2\2\2\u0127\u0128\f\3\2\2\u0128\u0129"+
		"\7\31\2\2\u0129\u012b\58\35\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\67\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012f\u0130\b\35\1\2\u0130\u0131\5:\36\2\u0131\u0137\3\2\2\2"+
		"\u0132\u0133\f\3\2\2\u0133\u0134\7\30\2\2\u0134\u0136\5:\36\2\u0135\u0132"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"9\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\b\36\1\2\u013b\u013c\5<\37\2"+
		"\u013c\u0143\3\2\2\2\u013d\u013e\f\3\2\2\u013e\u013f\5T+\2\u013f\u0140"+
		"\5<\37\2\u0140\u0142\3\2\2\2\u0141\u013d\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144;\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0146\u0147\b\37\1\2\u0147\u0148\5> \2\u0148\u014f\3\2\2\2\u0149\u014a"+
		"\f\3\2\2\u014a\u014b\5R*\2\u014b\u014c\5> \2\u014c\u014e\3\2\2\2\u014d"+
		"\u0149\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150=\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b \1\2\u0153\u0154"+
		"\5@!\2\u0154\u015b\3\2\2\2\u0155\u0156\f\3\2\2\u0156\u0157\5L\'\2\u0157"+
		"\u0158\5@!\2\u0158\u015a\3\2\2\2\u0159\u0155\3\2\2\2\u015a\u015d\3\2\2"+
		"\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c?\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015e\u015f\b!\1\2\u015f\u0160\5B\"\2\u0160\u0167\3\2\2\2\u0161"+
		"\u0162\f\3\2\2\u0162\u0163\5N(\2\u0163\u0164\5B\"\2\u0164\u0166\3\2\2"+
		"\2\u0165\u0161\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168A\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\b\"\1\2\u016b"+
		"\u016c\5D#\2\u016c\u0173\3\2\2\2\u016d\u016e\f\3\2\2\u016e\u016f\5P)\2"+
		"\u016f\u0170\5D#\2\u0170\u0172\3\2\2\2\u0171\u016d\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174C\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0177\7\37\2\2\u0177\u0178\t\4\2\2\u0178\u0179\7"+
		" \2\2\u0179\u0180\5F$\2\u017a\u017b\7$\2\2\u017b\u0180\5F$\2\u017c\u017d"+
		"\7%\2\2\u017d\u0180\5F$\2\u017e\u0180\5F$\2\u017f\u0176\3\2\2\2\u017f"+
		"\u017a\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017e\3\2\2\2\u0180E\3\2\2\2"+
		"\u0181\u0186\5\62\32\2\u0182\u0186\5(\25\2\u0183\u0186\5J&\2\u0184\u0186"+
		"\5X-\2\u0185\u0181\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0184\3\2\2\2\u0186G\3\2\2\2\u0187\u0188\5\66\34\2\u0188I\3\2\2\2\u0189"+
		"\u018a\7\23\2\2\u018a\u0193\7\37\2\2\u018b\u0190\5H%\2\u018c\u018d\7\27"+
		"\2\2\u018d\u018f\5H%\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u018b\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7 "+
		"\2\2\u0196K\3\2\2\2\u0197\u0198\t\5\2\2\u0198M\3\2\2\2\u0199\u019a\t\6"+
		"\2\2\u019aO\3\2\2\2\u019b\u019c\7(\2\2\u019cQ\3\2\2\2\u019d\u019e\t\7"+
		"\2\2\u019eS\3\2\2\2\u019f\u01a0\t\b\2\2\u01a0U\3\2\2\2\u01a1\u01a2\t\t"+
		"\2\2\u01a2W\3\2\2\2\u01a3\u01a7\5Z.\2\u01a4\u01a7\5\\/\2\u01a5\u01a7\5"+
		"^\60\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"Y\3\2\2\2\u01a8\u01a9\7\24\2\2\u01a9[\3\2\2\2\u01aa\u01ab\7\22\2\2\u01ab"+
		"]\3\2\2\2\u01ac\u01ad\t\n\2\2\u01ad_\3\2\2\2 fn\u0084\u008c\u0098\u00a2"+
		"\u00a5\u00b4\u00bc\u00c2\u00d2\u00d8\u00ea\u00fe\u0105\u010f\u0113\u0122"+
		"\u012c\u0137\u0143\u014f\u015b\u0167\u0173\u017f\u0185\u0190\u0193\u01a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
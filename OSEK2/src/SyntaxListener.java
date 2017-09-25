// Generated from Syntax.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaxParser}.
 */
public interface SyntaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SyntaxParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SyntaxParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#oil_version}.
	 * @param ctx the parse tree
	 */
	void enterOil_version(SyntaxParser.Oil_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#oil_version}.
	 * @param ctx the parse tree
	 */
	void exitOil_version(SyntaxParser.Oil_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(SyntaxParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(SyntaxParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#application_definition}.
	 * @param ctx the parse tree
	 */
	void enterApplication_definition(SyntaxParser.Application_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#application_definition}.
	 * @param ctx the parse tree
	 */
	void exitApplication_definition(SyntaxParser.Application_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#object_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterObject_definition_list(SyntaxParser.Object_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#object_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitObject_definition_list(SyntaxParser.Object_definition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#object_definition}.
	 * @param ctx the parse tree
	 */
	void enterObject_definition(SyntaxParser.Object_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#object_definition}.
	 * @param ctx the parse tree
	 */
	void exitObject_definition(SyntaxParser.Object_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(SyntaxParser.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(SyntaxParser.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#implementation_definition}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_definition(SyntaxParser.Implementation_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#implementation_definition}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_definition(SyntaxParser.Implementation_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#implementation_spec_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_spec_list(SyntaxParser.Implementation_spec_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#implementation_spec_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_spec_list(SyntaxParser.Implementation_spec_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#implementation_spec}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_spec(SyntaxParser.Implementation_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#implementation_spec}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_spec(SyntaxParser.Implementation_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(SyntaxParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(SyntaxParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#implementation_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_list(SyntaxParser.Implementation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#implementation_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_list(SyntaxParser.Implementation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#implementation_def}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_def(SyntaxParser.Implementation_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#implementation_def}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_def(SyntaxParser.Implementation_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#impl_attr_def}.
	 * @param ctx the parse tree
	 */
	void enterImpl_attr_def(SyntaxParser.Impl_attr_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#impl_attr_def}.
	 * @param ctx the parse tree
	 */
	void exitImpl_attr_def(SyntaxParser.Impl_attr_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#impl_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterImpl_parameter_list(SyntaxParser.Impl_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#impl_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitImpl_parameter_list(SyntaxParser.Impl_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#impl_def_list}.
	 * @param ctx the parse tree
	 */
	void enterImpl_def_list(SyntaxParser.Impl_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#impl_def_list}.
	 * @param ctx the parse tree
	 */
	void exitImpl_def_list(SyntaxParser.Impl_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#auto_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAuto_specifier(SyntaxParser.Auto_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#auto_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAuto_specifier(SyntaxParser.Auto_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#number_range}.
	 * @param ctx the parse tree
	 */
	void enterNumber_range(SyntaxParser.Number_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#number_range}.
	 * @param ctx the parse tree
	 */
	void exitNumber_range(SyntaxParser.Number_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(SyntaxParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(SyntaxParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#default_number}.
	 * @param ctx the parse tree
	 */
	void enterDefault_number(SyntaxParser.Default_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#default_number}.
	 * @param ctx the parse tree
	 */
	void exitDefault_number(SyntaxParser.Default_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#float_range}.
	 * @param ctx the parse tree
	 */
	void enterFloat_range(SyntaxParser.Float_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#float_range}.
	 * @param ctx the parse tree
	 */
	void exitFloat_range(SyntaxParser.Float_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#default_float}.
	 * @param ctx the parse tree
	 */
	void enterDefault_float(SyntaxParser.Default_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#default_float}.
	 * @param ctx the parse tree
	 */
	void exitDefault_float(SyntaxParser.Default_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(SyntaxParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(SyntaxParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(SyntaxParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(SyntaxParser.Enumerator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(SyntaxParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(SyntaxParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#bool_values}.
	 * @param ctx the parse tree
	 */
	void enterBool_values(SyntaxParser.Bool_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#bool_values}.
	 * @param ctx the parse tree
	 */
	void exitBool_values(SyntaxParser.Bool_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#default_Namedef}.
	 * @param ctx the parse tree
	 */
	void enterDefault_Namedef(SyntaxParser.Default_NamedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#default_Namedef}.
	 * @param ctx the parse tree
	 */
	void exitDefault_Namedef(SyntaxParser.Default_NamedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#default_string}.
	 * @param ctx the parse tree
	 */
	void enterDefault_string(SyntaxParser.Default_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#default_string}.
	 * @param ctx the parse tree
	 */
	void exitDefault_string(SyntaxParser.Default_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#default_bool}.
	 * @param ctx the parse tree
	 */
	void enterDefault_bool(SyntaxParser.Default_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#default_bool}.
	 * @param ctx the parse tree
	 */
	void exitDefault_bool(SyntaxParser.Default_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(SyntaxParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(SyntaxParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#impl_ref_def}.
	 * @param ctx the parse tree
	 */
	void enterImpl_ref_def(SyntaxParser.Impl_ref_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#impl_ref_def}.
	 * @param ctx the parse tree
	 */
	void exitImpl_ref_def(SyntaxParser.Impl_ref_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#object_ref_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_ref_type(SyntaxParser.Object_ref_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#object_ref_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_ref_type(SyntaxParser.Object_ref_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#reference_Namedef}.
	 * @param ctx the parse tree
	 */
	void enterReference_Namedef(SyntaxParser.Reference_NamedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#reference_Namedef}.
	 * @param ctx the parse tree
	 */
	void exitReference_Namedef(SyntaxParser.Reference_NamedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#multiple_specifier}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_specifier(SyntaxParser.Multiple_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#multiple_specifier}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_specifier(SyntaxParser.Multiple_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(SyntaxParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(SyntaxParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SyntaxParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SyntaxParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#attribute_Namedef}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_Namedef(SyntaxParser.Attribute_NamedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#attribute_Namedef}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_Namedef(SyntaxParser.Attribute_NamedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_value(SyntaxParser.Attribute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_value(SyntaxParser.Attribute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(SyntaxParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(SyntaxParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SyntaxParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SyntaxParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(SyntaxParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(SyntaxParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SyntaxParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SyntaxParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#float_num}.
	 * @param ctx the parse tree
	 */
	void enterFloat_num(SyntaxParser.Float_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#float_num}.
	 * @param ctx the parse tree
	 */
	void exitFloat_num(SyntaxParser.Float_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(SyntaxParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(SyntaxParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#dec_digits}.
	 * @param ctx the parse tree
	 */
	void enterDec_digits(SyntaxParser.Dec_digitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#dec_digits}.
	 * @param ctx the parse tree
	 */
	void exitDec_digits(SyntaxParser.Dec_digitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#zero_digit}.
	 * @param ctx the parse tree
	 */
	void enterZero_digit(SyntaxParser.Zero_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#zero_digit}.
	 * @param ctx the parse tree
	 */
	void exitZero_digit(SyntaxParser.Zero_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#pos_digit}.
	 * @param ctx the parse tree
	 */
	void enterPos_digit(SyntaxParser.Pos_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#pos_digit}.
	 * @param ctx the parse tree
	 */
	void exitPos_digit(SyntaxParser.Pos_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#hex_number}.
	 * @param ctx the parse tree
	 */
	void enterHex_number(SyntaxParser.Hex_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#hex_number}.
	 * @param ctx the parse tree
	 */
	void exitHex_number(SyntaxParser.Hex_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#hex_digits}.
	 * @param ctx the parse tree
	 */
	void enterHex_digits(SyntaxParser.Hex_digitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#hex_digits}.
	 * @param ctx the parse tree
	 */
	void exitHex_digits(SyntaxParser.Hex_digitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void enterHex_digit(SyntaxParser.Hex_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void exitHex_digit(SyntaxParser.Hex_digitContext ctx);
}
package sselab.nusek.oil.file;

// Generated from .\Oil.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OilParser}.
 */
public interface OilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OilParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(OilParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(OilParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#oil_version}.
	 * @param ctx the parse tree
	 */
	void enterOil_version(OilParser.Oil_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#oil_version}.
	 * @param ctx the parse tree
	 */
	void exitOil_version(OilParser.Oil_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(OilParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(OilParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#application_definition}.
	 * @param ctx the parse tree
	 */
	void enterApplication_definition(OilParser.Application_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#application_definition}.
	 * @param ctx the parse tree
	 */
	void exitApplication_definition(OilParser.Application_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#object_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterObject_definition_list(OilParser.Object_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#object_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitObject_definition_list(OilParser.Object_definition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#object_definition}.
	 * @param ctx the parse tree
	 */
	void enterObject_definition(OilParser.Object_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#object_definition}.
	 * @param ctx the parse tree
	 */
	void exitObject_definition(OilParser.Object_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(OilParser.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(OilParser.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#implementation_definition}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_definition(OilParser.Implementation_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#implementation_definition}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_definition(OilParser.Implementation_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#implementation_spec_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_spec_list(OilParser.Implementation_spec_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#implementation_spec_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_spec_list(OilParser.Implementation_spec_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#implementation_spec}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_spec(OilParser.Implementation_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#implementation_spec}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_spec(OilParser.Implementation_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(OilParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(OilParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#implementation_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_list(OilParser.Implementation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#implementation_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_list(OilParser.Implementation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#implementation_def}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_def(OilParser.Implementation_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#implementation_def}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_def(OilParser.Implementation_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#impl_attr_def}.
	 * @param ctx the parse tree
	 */
	void enterImpl_attr_def(OilParser.Impl_attr_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#impl_attr_def}.
	 * @param ctx the parse tree
	 */
	void exitImpl_attr_def(OilParser.Impl_attr_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#impl_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterImpl_parameter_list(OilParser.Impl_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#impl_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitImpl_parameter_list(OilParser.Impl_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#impl_def_list}.
	 * @param ctx the parse tree
	 */
	void enterImpl_def_list(OilParser.Impl_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#impl_def_list}.
	 * @param ctx the parse tree
	 */
	void exitImpl_def_list(OilParser.Impl_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#auto_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAuto_specifier(OilParser.Auto_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#auto_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAuto_specifier(OilParser.Auto_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#number_range}.
	 * @param ctx the parse tree
	 */
	void enterNumber_range(OilParser.Number_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#number_range}.
	 * @param ctx the parse tree
	 */
	void exitNumber_range(OilParser.Number_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(OilParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(OilParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#default_number}.
	 * @param ctx the parse tree
	 */
	void enterDefault_number(OilParser.Default_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#default_number}.
	 * @param ctx the parse tree
	 */
	void exitDefault_number(OilParser.Default_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#float_range}.
	 * @param ctx the parse tree
	 */
	void enterFloat_range(OilParser.Float_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#float_range}.
	 * @param ctx the parse tree
	 */
	void exitFloat_range(OilParser.Float_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#default_float}.
	 * @param ctx the parse tree
	 */
	void enterDefault_float(OilParser.Default_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#default_float}.
	 * @param ctx the parse tree
	 */
	void exitDefault_float(OilParser.Default_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(OilParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(OilParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(OilParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(OilParser.Enumerator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(OilParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(OilParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#bool_values}.
	 * @param ctx the parse tree
	 */
	void enterBool_values(OilParser.Bool_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#bool_values}.
	 * @param ctx the parse tree
	 */
	void exitBool_values(OilParser.Bool_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#default_Namedef}.
	 * @param ctx the parse tree
	 */
	void enterDefault_Namedef(OilParser.Default_NamedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#default_Namedef}.
	 * @param ctx the parse tree
	 */
	void exitDefault_Namedef(OilParser.Default_NamedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#default_string}.
	 * @param ctx the parse tree
	 */
	void enterDefault_string(OilParser.Default_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#default_string}.
	 * @param ctx the parse tree
	 */
	void exitDefault_string(OilParser.Default_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#default_bool}.
	 * @param ctx the parse tree
	 */
	void enterDefault_bool(OilParser.Default_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#default_bool}.
	 * @param ctx the parse tree
	 */
	void exitDefault_bool(OilParser.Default_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(OilParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(OilParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#impl_ref_def}.
	 * @param ctx the parse tree
	 */
	void enterImpl_ref_def(OilParser.Impl_ref_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#impl_ref_def}.
	 * @param ctx the parse tree
	 */
	void exitImpl_ref_def(OilParser.Impl_ref_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#object_ref_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_ref_type(OilParser.Object_ref_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#object_ref_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_ref_type(OilParser.Object_ref_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#reference_Namedef}.
	 * @param ctx the parse tree
	 */
	void enterReference_Namedef(OilParser.Reference_NamedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#reference_Namedef}.
	 * @param ctx the parse tree
	 */
	void exitReference_Namedef(OilParser.Reference_NamedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#multiple_specifier}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_specifier(OilParser.Multiple_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#multiple_specifier}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_specifier(OilParser.Multiple_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(OilParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(OilParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(OilParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(OilParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#attribute_Namedef}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_Namedef(OilParser.Attribute_NamedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#attribute_Namedef}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_Namedef(OilParser.Attribute_NamedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_value(OilParser.Attribute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_value(OilParser.Attribute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(OilParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(OilParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(OilParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(OilParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(OilParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(OilParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(OilParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(OilParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#float_num}.
	 * @param ctx the parse tree
	 */
	void enterFloat_num(OilParser.Float_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#float_num}.
	 * @param ctx the parse tree
	 */
	void exitFloat_num(OilParser.Float_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(OilParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(OilParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OilParser#dec_digits}.
	 * @param ctx the parse tree
	 */
	void enterDec_digits(OilParser.Dec_digitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OilParser#dec_digits}.
	 * @param ctx the parse tree
	 */
	void exitDec_digits(OilParser.Dec_digitsContext ctx);
}
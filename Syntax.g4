/**
 * Define a grammar called Syntax
 */
grammar Syntax;

file
:
	OIL_Version implementation_definition application_definition
;

OIL_Version
:
	'OIL_VERSION' '=' VERSION DESCRIPTION ';'
;

VERSION
:
	STRING
;


application_definition
:
	'CPU' Name_def '{' object_definition_list '}' DESCRIPTION ';'
;

implementation_definition
:
	'IMPLEMENTATION' Name_def '{' implementation_spec_list '}'
;

implementation_spec_list
:
	implementation_spec
	| implementation_spec_list implementation_spec
;

implementation_spec
:
	object '{' implementation_list ';' DESCRIPTION ';'
;

object
:
	'OS'
	| 'TASK'
	| 'COUNTER'
	| 'ALARM'
	| 'RESOURCE'
	| 'EVENT'
	| 'ISR'
	| 'MESSAGE'
	| 'COM'
	| 'NM'
	| 'APPMODE'
	| 'IPDU'
;

implementation_list
:
	| implementation_def
	| implementation_list implementation_def
	| /* epsilon */ 
;

implementation_def
:
	impl_attr_def
	| impl_ref_def
;

impl_attr_def
:
	'UINT32' auto_specifier number_range attribute_Name_def multiple_specifier
	default_number DESCRIPTION ';'
	| 'INT32' auto_specifier number_range attribute_Name_def multiple_specifier
	default_number DESCRIPTION ';'
	| 'UINT64' auto_specifier number_range attribute_Name_def multiple_specifier
	default_number DESCRIPTION ';'
	| 'INT64' auto_specifier number_range attribute_Name_def multiple_specifier
	default_number DESCRIPTION ';'
	| 'FLOAT' auto_specifier float_range attribute_Name_def multiple_specifier
	default_float DESCRIPTION ';'
	| 'ENUM' auto_specifier enumeration attribute_Name_def multiple_specifier
	default_Name_def DESCRIPTION ';'
	| 'STRING' auto_specifier attribute_Name_def multiple_specifier default_string
	DESCRIPTION ';'
	| 'BOOLEAN' auto_specifier bool_values attribute_Name_def multiple_specifier
	default_bool DESCRIPTION ';'
;

impl_parameter_list
:
	'{' impl_def_list '}'
	| /* epsilon */ 
;

impl_def_list
:
	implementation_def
	| implementation_def impl_def_list
	| /* epsilon */ 
;

auto_specifier
:
	'WITH_AUTO'
	| /* epsilon */ 
;

number_range
:
	'[' (number)+ ']'
	| '[' number_list ']'
	| /* epsilon */ 
;

number_list
:
	number
	| number_list ',' number
;

default_number
:
	'=' number
	| '=' 'NO_DEFAULT'
	| '=' 'AUTO'
	| /* epsilon */ 
;

DESCRIPTION
:
	':' STRING
	| /* epsilon */ 
; 

float_range
:
	'[' (float_num)+ ']'
	| /* epsilon */ 
;

default_float
:
	'=' float_num
	| '=' 'NO_DEFAULT'
	| '=' 'AUTO'
	| /* epsilon */ 
;

enumeration
:
	'[' enumerator_list ']'
;

enumerator_list
:
	enumerator
	| enumerator_list ',' enumerator
;

enumerator
:
	Name_def DESCRIPTION
	| Name_def impl_parameter_list DESCRIPTION
;

bool_values
:
	'[' 'TRUE' impl_parameter_list DESCRIPTION ',' 'FALSE' impl_parameter_list DESCRIPTION ']'
	| /* epsilon */ 
; 

default_Name_def
:
	'=' Name_def
	| '=' 'NO_DEFAULT'
	| '=' 'AUTO'
	| /* epsilon */ 
;

default_string
:
	'=' STRING
	| '=' 'NO_DEFAULT'
	| '=' 'AUTO'
	| /* epsilon */ 
;

default_bool
:
	'=' bool
	| '=' 'NO_DEFAULT'
	| '=' 'AUTO'
	| /* epsilon */ 
;

impl_ref_def
:
	object_ref_type reference_Name_def multiple_specifier DESCRIPTION ';'
;

object_ref_type
:
	'OS_TYPE'
	| 'TASK_TYPE'
	| 'COUNTER+TYPE'
	| 'ALARM_TYPE'
	| 'RESOURCE_TYPE'
	| 'EVENT_TYPE'
	| 'ISR_TYPE'
	| 'MESSAGE_TYPE'
	| 'COM_TYPE'
	| 'NM_TYPE'
	| 'APPMODE_TYPE'
	| 'IPDU_TYPE'
;

reference_Name_def
:
	Name_def
	| object
;

multiple_specifier
:
	'[' ']'
	| /* epsilon */ 
;

applcation_definition
:
	'CPU' Name_def '{' object_definition_list '}' DESCRIPTION ';'
;

object_definition_list
:
	object_definition
	| object_definition_list object_definition
	| /* epsilon */ 
;

object_definition
:
	object_Name_def DESCRIPTION ';'
	| object_Name_def '{' parameter_list '}' DESCRIPTION ';'
;

object_Name_def
:
	object Name_def
;

parameter_list
:
	parameter
	| parameter_list parameter
	| /* epsilon */ 
;

parameter
:
	attribute_Name_def '=' attribute_value DESCRIPTION ';'
;

attribute_Name_def
:
	Name_def
	| object
;

attribute_value
:
	Name_def
	| Name_def '{' parameter_list '}'
	| bool
	| bool '{' parameter_list '}'
	| number
	| float_num
	| STRING
	| 'AUTO'
;

bool
:
	'FALSE'
	| 'TRUE'
;

number
:
	dec_number
	| hex_number
;

dec_number
:
	sign int_digits
;

sign
:
	'+'
	| '-'
	| /* epsilon */ 
;

int_digits
:
	zero_digit
	| pos_digit
	| pos_digit dec_digit
;

dec_digits
:
	dec_digit
	| dec_digit dec_digits
;

float_num
:
	sign dec_digits '.' dec_digits exponent
;

exponent
:
	'e' sign dec_digits
	| 'E' sign dec_digits
	| /* epsilon */ 
;

zero_digit
:
	'0'
;

pos_digit
:
	Name_def
;

dec_digit
:
	zero_digit
	| pos_digit
;

hex_number
:
	'0x' hex_digits
;

hex_digits
:
	hex_digit
	| hex_digit hex_digits
;

hex_digit
:
	'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8'| '9' |
	'a'| 'b' | 'c' | 'd' | 'e'| 'f'|
	'A'| 'B' | 'C' | 'D' | 'E'| 'F'
;

STRING
:
	Name_def
;

Name_def
   : 'A'..'Z' | 'a'..'z'
   | '\u00C0'..'\u00D6'
   | '\u00D8'..'\u00F6'
   | '\u00F8'..'\u02FF'
   | '\u0370'..'\u037D'
   | '\u037F'..'\u1FFF'
   | '\u200C'..'\u200D'
   | '\u2070'..'\u218F'
   | '\u2C00'..'\u2FEF'
   | '\u3001'..'\uD7FF'
   | '\uF900'..'\uFDCF'
   | '\uFDF0'..'\uFFFD'
   ;
   
WS : [\r\t\n]+ -> skip;

BlockComment
:
	'/*' .*? '*/' -> skip
;
LineComment
:
	'//' ~[\r\n]* -> skip
;
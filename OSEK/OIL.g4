/**
 * Define a grammar called Syntax
 */
grammar OIL;

file
:
	oil_version implementation_definition application_definition
;

oil_version
:
	'OIL_VERSION' '=' version description ';'
;

version
:
	STRING
;

application_definition
:
	'CPU' NAME '{' object_definition_list '}'description ';'
;
object_definition_list
:
	object_definition
	| object_definition_list object_definition
;

object_definition
:
	object_name '{' parameter_list '}' description ';' 
	| object_name description ';'
;

object_name
:
	object NAME
;

implementation_definition
:
	'IMPLEMENTATION' NAME '{' implementation_spec_list '}' description ';'
;

implementation_spec_list
:
	implementation_spec_list implementation_spec
	| implementation_spec
;

implementation_spec
:
	object '{' implementation_list '}' description ';'
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
	implementation_def
	| implementation_list implementation_def 
;

implementation_def
:
	impl_attr_def
	| impl_ref_def
;

impl_attr_def
:
	'UINT32' auto_specifier number_range attribute_Namedef multiple_specifier
	default_number description ';'
	| 'INT32' auto_specifier number_range attribute_Namedef multiple_specifier
	default_number description ';'
	| 'UINT64' auto_specifier number_range attribute_Namedef multiple_specifier
	default_number description ';'
	| 'INT64' auto_specifier number_range attribute_Namedef multiple_specifier
	default_number description ';'
	| 'FLOAT' auto_specifier float_range attribute_Namedef multiple_specifier
	default_float description ';'
	| 'ENUM' auto_specifier enumeration attribute_Namedef multiple_specifier
	default_Namedef description ';'
	| 'STRING' auto_specifier attribute_Namedef multiple_specifier default_string
	';'
	| 'BOOLEAN' auto_specifier bool_values attribute_Namedef multiple_specifier
	default_bool description ';'
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
	|/* epsilon */ 
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
	NAME 
	| NAME impl_parameter_list description ;

bool_values
:
	'[' 'TRUE' impl_parameter_list description ',' 'FALSE' impl_parameter_list description ']'
	| /* epsilon */ 
; 

default_Namedef
:
	'=' NAME
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
description
:
	':' STRING
	| /* epsilon */  
;
impl_ref_def
:
	object_ref_type reference_Namedef multiple_specifier description ';'
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

reference_Namedef
:
	NAME
	| object
;

multiple_specifier
:
	'[' ']'
	| /* epsilon */ 
;


parameter_list
:
	parameter
	| parameter_list parameter
	| /* epsilon */ 
;

parameter
:
	attribute_Namedef '=' attribute_value description ';'
;

attribute_Namedef
:
	NAME
	| object
;

attribute_value
:
	NAME
	| NAME '{' parameter_list '}'
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
	dec_number	| hex_number
;

dec_number
:
	sign dec_digits
;

sign
:
	'+'
	| '-'
	| /* epsilon */ 
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

dec_digits
:
	zero_digit | pos_digit | DIGIT
;
DIGIT
:
	('0'..'9')+
;
zero_digit
:
	'0'
;
pos_digit
:
	'1' | '2' | '3' | '4' | '5' | '6' | '7' | '8'| '9'
;

hex_number
:
	('0x'|'0X') hex_digits
;

hex_digits
:
	hex_digit
	| hex_digit hex_digits
;

hex_digit
:
	('a' | 'b' | 'c'| 'd'|'e'|'f'|
	'A' | 'B' | 'C'| 'D'|'E'|'F'|
	'0'| '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8'| '9')+
;

NAME:
	Letter LetterOrDigit*
;
fragment
Letter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;
	
fragment
LetterOrDigit
:
	[a-zA-Z0-9$_]
    |   ~[\u0000-\u007F\uD800-\uDBFF]
    |   [\uD800-\uDBFF] [\uDC00-\uDFFF]
    
;
STRING
:
	'"' ~('\\'|'"')* '"' 
;

   
 WS  : [ \t\r\n]+ -> skip;
 
 COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
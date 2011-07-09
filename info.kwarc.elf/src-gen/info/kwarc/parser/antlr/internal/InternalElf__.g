lexer grammar InternalElf;
@header {
package info.kwarc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : '%namespace' ;
T14 : '=' ;
T15 : '.' ;
T16 : '%sig' ;
T17 : '{' ;
T18 : '}' ;
T19 : ':' ;

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 435
RULE_INT : ('0'..'9')+;

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 437
RULE_URI : '"' ('a'..'z'|'A'..'Z'|'/'|':'|'.'|'-'|'%')+ '"';

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 439
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 441
RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'}%';

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 443
RULE_ML2_COMMENT : '%*' ( options {greedy=false;} : . )*'*%';

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 445
RULE_SL_COMMENT : '%' (' '|'%') ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 447
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 449
RULE_ID : ~(('"'|'\''|'%'|'*'|'{'|'}'|'.'|'['|']'|'='|':'|' '))*;

// $ANTLR src "../info.kwarc.elf/src-gen/info/kwarc/parser/antlr/internal/InternalElf.g" 451
RULE_ANY_OTHER : .;



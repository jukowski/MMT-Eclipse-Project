lexer grammar InternalElf;
@header {
package info.kwarc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '%namespace' ;
T14 : '.' ;
T15 : '=' ;
T16 : '%sig' ;
T17 : '{' ;
T18 : '}' ;
T19 : ':' ;

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 990
RULE_INT : ('0'..'9')+;

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 992
RULE_URI : '"' ('a'..'z'|'A'..'Z'|'/'|':'|'.'|'-'|'%')+ '"';

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 994
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 996
RULE_ML_COMMENT : '%{' ( options {greedy=false;} : . )*'}%';

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 998
RULE_ML2_COMMENT : '%*' ( options {greedy=false;} : . )*'*%';

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 1000
RULE_SL_COMMENT : '%' (' '|'%') ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 1002
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 1004
RULE_ID : ~(('"'|'\''|'%'|'*'|'{'|'}'|'.'|'['|']'|'='|':'|' '))*;

// $ANTLR src "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g" 1006
RULE_ANY_OTHER : .;



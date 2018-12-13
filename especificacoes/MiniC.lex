
package com.br.praticasjflex.extratorliteraisinteirospalavras;

import com.br.praticasjflex.javaCup.sym;

import java_cup.runtime.*;

%%  

%class IdentificadorLiteraisNumericosePalavras
%type Symbol
%line
%column 
%cup
%unicode
%public 
 
DIGITO = [0-9] 
LITERALNUMERICO = {DIGITO}+
LETRA = [A-Za-z]
IDENTIFICADORES = ( {LETRA} | \_ )( {LETRA} | {DIGITO} | \_ )*
InputCharacter = [^\r\n]

NOVALINHA = \n | \r\n | \t\n  | \r | \t
ESPACO = [ ]

LITERAISPONTOFLUTUANTE = {DIGITO}+ "." {DIGITO}* | {DIGITO}* "." {DIGITO}+

CHAR = \'({LETRA} | \\n | \\r | \\t)+\'
LITERALSTRING = \"(([ ] | {LETRA} | {DIGITO} | \\n | \\r | \\t)*)\"

COMENTARIO = {COMENTARIOTRADICIONAL} | {COMENTARIOLINHA} | {COMENTARIODOCUMENTACAO}
COMENTARIOTRADICIONAL = "/*" [^*] ~"*/" | "*/" "*"+ "/"
COMENTARIOLINHA = "//" {InputCharacter}* {NOVALINHA}?
COMENTARIODOCUMENTACAO = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

%% 
"char"						{ return new Symbol(sym.CHAR, yyline, yycolumn, yytext()); }
"int"						{ return new Symbol(sym.INT, yyline, yycolumn, yytext()); }
"float"						{ return new Symbol(sym.FLOAT, yyline, yycolumn, yytext()); }
"double"					{ return new Symbol(sym.DOUBLE, yyline, yycolumn, yytext()); }

"while"						{ return new Symbol(sym.WHILE, yyline, yycolumn, yytext()); }
"if"						{ return new Symbol(sym.IF, yyline, yycolumn, yytext()); }
"else"						{ return new Symbol(sym.ELSE, yyline, yycolumn, yytext()); }

"static"					{ return new Symbol(sym.STATIC, yyline, yycolumn, yytext()); }
"void"						{ return new Symbol(sym.VOID, yyline, yycolumn, yytext()); }
"return"					{ return new Symbol(sym.RETURN, yyline, yycolumn, yytext()); }
"include"					{ return new Symbol(sym.INCLUDE, yyline, yycolumn, yytext()); }
"main"						{ return new Symbol(sym.MAIN, yyline, yycolumn, yytext()); }

"printf"					{ return new Symbol(sym.PRINTF, yyline, yycolumn, yytext()); }
"printint"					{ return new Symbol(sym.PRINTINT, yyline, yycolumn, yytext()); }
"printstr"					{ return new Symbol(sym.PRINTSTR, yyline, yycolumn, yytext()); }

"<=" 						{ return new Symbol( sym.MENOR_IGUAL, yyline, yycolumn, yytext() ); } 
"<" 						{ return new Symbol( sym.MENOR, yyline, yycolumn, yytext() ); }
">=" 						{ return new Symbol( sym.MAIOR_IGUAL, yyline, yycolumn, yytext() ); }
">" 						{ return new Symbol( sym.MAIOR, yyline, yycolumn, yytext() ); }
"==" 						{ return new Symbol( sym.IGUAL, yyline, yycolumn, yytext() ); }
"=" 						{ return new Symbol( sym.ATRIBUICAO, yyline, yycolumn, yytext() ); }
"!=" 						{ return new Symbol( sym.DIFERENTE, yyline, yycolumn, yytext() ); }
"!" 						{ return new Symbol( sym.NEGACAO, yyline, yycolumn, yytext() ); }

"+" 						{ return new Symbol( sym.SOMA, yyline, yycolumn, yytext() ); }
"-" 						{ return new Symbol( sym.SUB, yyline, yycolumn, yytext() ); }
"/" 						{ return new Symbol( sym.DIV, yyline, yycolumn, yytext() ); }
"*" 						{ return new Symbol( sym.MULT, yyline, yycolumn, yytext() ); }

"#" 						{ return new Symbol( sym.HASTAG, yyline, yycolumn, yytext() ); }
"." 						{ return new Symbol( sym.PONTO, yyline, yycolumn, yytext() ); }
";" 						{ return new Symbol( sym.PONTO_VIRGULA, yyline, yycolumn, yytext() ); }
"," 						{ return new Symbol( sym.VIRGULA, yyline, yycolumn, yytext() ); }
"{" 						{ return new Symbol( sym.ABRE_CHAVE, yyline, yycolumn, yytext() ); }
"}" 						{ return new Symbol( sym.FECHA_CHAVE, yyline, yycolumn, yytext() ); }
"(" 						{ return new Symbol( sym.ABRE_PARENTESES, yyline, yycolumn, yytext() ); }
")" 						{ return new Symbol( sym.FECHA_PARENTESES, yyline, yycolumn, yytext() ); }

"h" 						{ return new Symbol( sym.H, yyline, yycolumn, yytext() ); }

{LITERALNUMERICO}       	{ return new Symbol(sym.LITERAL_INTEIRO, yyline, yycolumn, yytext()); }
{IDENTIFICADORES} 			{ return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext()); }
{LITERAISPONTOFLUTUANTE}	{ return new Symbol(sym.LITERAL_PONTO_FLUTUANTE, yyline, yycolumn, yytext()); }
{CHAR}						{ return new Symbol(sym.CHAR, yyline, yycolumn, yytext()); }
{LITERALSTRING}     		{ return new Symbol(sym.LITERAL_CHAR, yyline, yycolumn, yytext()); }
{COMENTARIO} 				{/* ignore */}
{NOVALINHA} 				{}
{ESPACO}					{/* ignore */}
. 						 	{System.out.printf("error: unexpected char |%s|\n",yytext());}
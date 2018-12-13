package com.br.unipe.projetominic;

import java.io.File;
import java.io.FileReader;

import com.br.unipe.projetominic.analisadorlexico.AnalisadorLexico;
import com.br.unipe.projetominic.analisadorsintatico.parser;
import com.br.unipe.projetominic.elementos.ProgramaMiniC;

import java_cup.runtime.Symbol;

public class Projeto {

	public static void main(String[] args) throws Exception {

		File programaTeste = new File("programas/ProgramaTeste.txt");

		AnalisadorLexico analisadorLexico = new AnalisadorLexico(new FileReader(programaTeste));

		parser parser = new parser(analisadorLexico);

		Symbol symbol = parser.parse();

		ProgramaMiniC programaMiniC = (ProgramaMiniC) symbol.value;

		System.out.println(programaMiniC);

	}

}
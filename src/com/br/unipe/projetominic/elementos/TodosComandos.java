package com.br.unipe.projetominic.elementos;

import java.util.List;

public class TodosComandos implements IComando{
	private List<IComando> Comandos;
	
	public List<IComando> getComandos() {
		return Comandos;
	}

	public void setComandos(List<IComando> comandos) {
		Comandos = comandos;
	}

	public TodosComandos (List<IComando> comandos) {
		this.Comandos = comandos;
	}

	public String toString() {
		  StringBuilder todoscomandos = new StringBuilder();
		  
		  todoscomandos.append( " if (" );
		  todoscomandos.append( this.getComandos());
		
		  return todoscomandos.toString();
	  }

	public void setEntreParenteses(boolean isEntreParenteses) {
	}

}

package com.br.unipe.projetominic.elementos;

public class DeclInclude {

	private String id;

	  public DeclInclude(String identificador){
		  this.setId( identificador );
	  }

	  public String getId() {
		    return id;
		  }

	  public void setId(String id) {
		    this.id = id;
	  	  }

	  @Override
	  public String toString() {
		  StringBuilder declarainclude = new StringBuilder();
		  
		  declarainclude.append( "#include <" );	
		  declarainclude.append( this.getId());
		  declarainclude.append( ".h>" );    
		  return declarainclude.toString();
	  }

}

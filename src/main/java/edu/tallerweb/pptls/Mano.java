package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	Forma forma;
	
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		
		this.forma = forma;
		
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		
		if(this.forma==otra.forma)	
		{
		 return Resultado.EMPATA;		
		}
		else
		{	
		switch(forma)
		{
		 case PIEDRA:
			 if(otra.forma==Forma.TIJERA || otra.forma==Forma.LAGARTO)
			 {
				 return Resultado.GANA; 
			 }	 
			 else
			 {
				 return Resultado.PIERDE;
			 }
		 case PAPEL: 
			 if(otra.forma==Forma.PIEDRA || otra.forma==Forma.SPOCK)
			 {
				 return Resultado.GANA; 
			 }	 
			 else
			 {
				 return Resultado.PIERDE;
			 }
		 case TIJERA:
			 if(otra.forma==Forma.PAPEL || otra.forma==Forma.LAGARTO)
			 {
				 return Resultado.GANA; 
			 }	 
			 else
			 {
				 return Resultado.PIERDE;
			 }
		 case LAGARTO: 
			 if(otra.forma==Forma.PAPEL || otra.forma==Forma.SPOCK)
			 {
				 return Resultado.GANA; 
			 }	 
			 else
			 {
				 return Resultado.PIERDE;
			 }
		 case SPOCK: 			 
			 if(otra.forma==Forma.TIJERA || otra.forma==Forma.PIEDRA)
			 {
				 return Resultado.GANA; 
			 }	 
			 else
			 {
				 return Resultado.PIERDE;
			 }
		 default: 
		     break;
		 }
		}
		
		return null;
		
	}
	
	
}

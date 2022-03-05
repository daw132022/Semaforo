package clases;
/**
 * Clase estudiante que extiende de la clase persona
 * @author Aurora Tejada Cordón
 *
 */
public class estudiante extends persona{
	/**
	 *  Incluye un metodo de clase que se une a los heredados
	 */
	int i_Curso; 
	/**
	 * Constructor estudiante
	 */
    	public estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
    	/**
    	 * Método presentarse que imprime un String que sirve para que el alumno se presente, cogiendo los datos del constructor
    	 */
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
	/**
	 * Método String asociado a la clase ordenador, que devuelve el print del método anterior y a su vez pregunta un color 
	 * @return String
	 */
	public String preguntacolor(){
		presentarse();
		ordenador mipc = new ordenador();
        	return mipc.color();
    	}
}

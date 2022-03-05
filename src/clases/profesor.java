package clases;

public class profesor  extends persona{
	/**
	 * Constructor
	 */
    	public profesor() {}	

	/**
	 *  Hace la pregunta al estudiante sobre el color
	 * @return String
	 */
    	public String preguntacolor(){

		estudiante alumno = new estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
    	}
}

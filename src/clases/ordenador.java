package clases;
import java.util.Random;
/**
 * Clase p�blica ordenador con m�todo que refleja el funcionamiento de un sem�foro seg�n el n�mero introducido
 * @author Aurora Tejada Cord�n
 *
 */
public class ordenador {
    public ordenador() {}
    /**
     * M�todo String que contiene la clase randomGenerator, para que devuelve colores seg�n el n�mero introducido
     * @return
     */
    public String color(){
    	/**
    	 * Creaci�n del objeto Random que se utilizar� en la condicion para devolver aleatoriamente los colores
    	 */
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
	/**
	 * Condici�n que devuelve un color dependiendo el n�mero introducido
	 */
	if(randomInt == 0)
	{  return "rojo";}
	else if(randomInt == 1)
	{ return "amarillo";}
	else
	{ return "verde";}
    }
}

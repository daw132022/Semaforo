package clases;
import java.util.Random;
/**
 * Clase pública ordenador con método que refleja el funcionamiento de un semáforo según el número introducido
 * @author Aurora Tejada Cordón
 *
 */
public class ordenador {
    public ordenador() {}
    /**
     * Método String que contiene la clase randomGenerator, para que devuelve colores según el número introducido
     * @return
     */
    public String color(){
    	/**
    	 * Creación del objeto Random que se utilizará en la condicion para devolver aleatoriamente los colores
    	 */
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
	/**
	 * Condición que devuelve un color dependiendo el número introducido
	 */
	if(randomInt == 0)
	{  return "rojo";}
	else if(randomInt == 1)
	{ return "amarillo";}
	else
	{ return "verde";}
    }
}

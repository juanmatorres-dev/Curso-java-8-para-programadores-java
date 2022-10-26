/**
 * Clase que implementa la interfaz Hija
 */
package polimorfismo.interfaz;

/**
 * @author Openwebinars
 *
 */
public class ClaseQueImplementaInterfaz implements Hija {
	public void saludar(String s) {
		System.out.println(s + " desde la clase");
	}
}

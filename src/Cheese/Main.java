/*
*	grupo  : GDAM 2-1
*	alumno : Antonio Blanco Araya
*	n.exp. : 7250
*	fecha  : 09/06/2022
*	//Versi�n final
 */
package Cheese;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         Producto patatas = new Producto("PATATAS12345", "hortalizas", 10, 5.5);
         Producto helados = new Producto("HELADOSMAGNUM88", "helados", 6, 0.5);
         
         patatas.imprime_etiqueta();
         helados.imprime_etiqueta();

     }
}

/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el nÃºmero de productos contenidos en la lista
     */
    private static int n = 0;
    
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no estÃ¡ vacÃ­a)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vacÃ­a, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return true; else return false;
    }
    
    /**
     * 
     * @param nombre constructor en el que recibe el nombre
     *  y lo asigna a la variable nombreLista. 
     *  Si no recibe nada en el String lo asigna como noNamed.
     */
    
    public ListaProductos(String nombre) {
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    
    /**
     * 
     * @return devuelve el número de productos que es un número entero.
     */
    
    public int totalProductos(){
            return this.getNumProductos();
    }
    
    /**
     * 
     * @param prod recibe como parámetro un producto.
     * @return tras añadirlo a la listaP retorna el producto.
     */
        
    public Producto registraProducto(Producto prod) {
        if(parametro_vacio(prod.getcode())) {
        	return null;
        }
        if (listaP.containsKey(prod.getcode())) {
           return null;
        }
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }
    
    /**
     * 
     * @param codigo recibe el código del producto que es un String
     * @return tras eliminar el producto de la lista retorna el producto 
     * que se haya encontrado con ese código.
     */
    
    public Producto descartaProducto(String codigo) { 
        Producto prod = encuentraProducto(codigo);
        if(parametro_vacio(prod.getcode())) {
        	return null;
        }
        if (prod != null) {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return prod;
    }
    
    /**
     * 
     * @param codigo recibe el código del producto para encontrarlo.
     * @return si en la lista aparece el código retorna el producto,
     * en caso contratrio devuelve el código del producto.
     */

    public Producto encuentraProducto(String codigo) { 
    	if(parametro_vacio(codigo)) {
        	return null;
        }
    	
    	Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}

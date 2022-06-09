/*
*	grupo  : GDAM 2-1
*	alumno : Eduardo segura
*	n.exp. : 7260
*	fecha  : 9/6/2022
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
         Producto producto = new Producto("1928", "comida", 129, 3123);
         Producto produco1 = new Producto("213", "juguete", 123, 234234);
         ListaProductos lista = new ListaProductos("nombre");
         lista.registraProducto(producto);
         lista.registraProducto(produco1);
         lista.encuentraProducto("1928").imprime_etiqueta();
         lista.encuentraProducto("213").imprime_detalle();

     }
}

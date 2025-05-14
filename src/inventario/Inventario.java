/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import Modelo.ProductoModel;
import Modelo.ProductoCaducidad;

/**
 *
 * @author crani
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear productos
        ProductoModel producto1 = new ProductoModel("No perecedero", 10.0, 30);
        ProductoCaducidad producto2 = new ProductoCaducidad("Perecedero", 8.0, 3);

        // Calcular precio total para 5 unidades de cada producto
        System.out.println("Producto 1: " + producto1);
        System.out.println("Precio total por 5 unidades: " + producto1.calcular(5));

        System.out.println("Producto 2: " + producto2);
        System.out.println("Precio total por 5 unidades: " + producto2.calcular(5));
    }
    
}

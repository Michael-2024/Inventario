/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author crani
 */
public class ProductoCaducidad extends ProductoModel {
    
    public ProductoCaducidad(String tipo, double precio, int dias_vencer) {
        super(tipo, precio, dias_vencer);
    }
    
    // Sobrescribir el método calcular para reducir el precio según los días a caducar
    @Override
    public double calcular(int cantidad) {
        double precioFinal = getPrecio();

        // Lógica para reducir el precio si los días a caducar son bajos
        if (getDias_vencer() < 5) {
            precioFinal = precioFinal * 0.8; // Aplica un 20% de descuento
        }

        return precioFinal * cantidad;
    }

    // Método toString que usa el toString de la clase padre
    @Override
    public String toString() {
        return "ProductoPerecedero{" + super.toString() + "}";
    }
}

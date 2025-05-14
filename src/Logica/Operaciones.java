/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author crani
 */
public class Operaciones {
    
    public double PrecioDescuento(double precio, int diasCaducar) {
        if (diasCaducar <= 5) {
            return precio * 0.80;  // 20% de descuento
        } else if (diasCaducar <= 10) {
            return precio * 0.90;  // 10% de descuento
        } else {
            return precio;  // Sin descuento
        }
    }
    
}

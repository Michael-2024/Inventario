/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author crani
 */
public class ProductoModel {
    
    public String tipo;
    public double precio;
    public int dias_vencer;

    public ProductoModel(String tipo, double precio, int dias_vencer) {
        this.tipo = tipo;
        this.precio = precio;
        this.dias_vencer = dias_vencer;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDias_vencer() {
        return dias_vencer;
    }

    public void setDias_vencer(int dias_vencer) {
        this.dias_vencer = dias_vencer;
    }
    
    // Método toString para tomar datos
    @Override
    public String toString() {
        return "Producto{" +
                "tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", diasACaducar=" + dias_vencer +
                '}';
    }

    // Método calcular, simplemente multiplica el precio por la cantidad
    public double calcular(int cantidad) {
        return this.precio * cantidad;
    }
    
}

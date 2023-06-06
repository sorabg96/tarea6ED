/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author soray
 */
public class Tarea6EDClase {
    //Atributos
    private static final int LIMITE_PRODUCTO = 3;
    private static final double PORCENTAJE_2 = 0.95;
    private static final double PORCENTAJE_1 = 0.8;

    //Metodos
    public void screenOutput (double total){
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
    public void aplicarDescuento(double precioProducto, int numProductos){     double total;
        if(numProductos>LIMITE_PRODUCTO){
            precioProducto-=5;
            if (numProductos!=0){
                total = precioProducto*PORCENTAJE_1;
                screenOutput(total);
            }else {
                total = precioProducto*PORCENTAJE_2;
                screenOutput(total);
            }   
        }
    }
}


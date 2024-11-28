/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz3;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda abarrotes = new Tienda();
        String respuesta ="";
        respuesta+=abarrotes.printProductos();
        respuesta+=abarrotes.calculaTotalVentasPorProducto();
        respuesta+=abarrotes.calculaTotalVentasPorDia();
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
}

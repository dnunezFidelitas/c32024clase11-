/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz3objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Quiz3Objetos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadProductos= Integer.parseInt(JOptionPane.showInputDialog("Digite La cantidad de productos que se van agregar"));
        String resultado="";
        Producto productos[] = new Producto[cantidadProductos];
        UtilProducto utilProducto = new UtilProducto();
        utilProducto.fillVector(productos);
        resultado+=utilProducto.printVector(productos);
        resultado+=utilProducto.getProductoMasVendido(productos);
        resultado+=utilProducto.getDiaMasVendido(productos);
        JOptionPane.showMessageDialog(null, resultado);
 
    }
    
    
  
    
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Tienda {
    private String productos[];
    private String semana[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"}; 
    private int matriz[][];
    private int cantidadProductos =0;
    private int filasDias=7;

    public Tienda() {
        cantidadProductos= Integer.parseInt(JOptionPane.showInputDialog("Digite La cantidad de productos que se van agregar"));
        this.productos = new String[cantidadProductos];
        this.matriz = new int [filasDias][cantidadProductos];
        solProductos();
        llenaLaMatriz();
        printProductos();
    }
    
    public void solProductos (){
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i]=JOptionPane.showInputDialog("Digita el producto numero "+ (i+1));
        }
    }
    
    public String printProductos(){
        String resultado="productos: {";
        for (int i = 0; i < cantidadProductos; i++) {
            resultado+=productos[i]+",";
        }
        resultado+="}";
        resultado+="\nmatriz: {\n";
        for (int i = 0; i < filasDias; i++) {
            for (int j = 0; j < cantidadProductos; j++) {
               resultado+=matriz[i][j] + "-";
            }
            resultado+="\n";
        }
        resultado+="}\n\n";
        return resultado;
        //JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void llenaLaMatriz(){
        for (int i = 0; i < filasDias; i++) {
            for (int j = 0; j < cantidadProductos; j++) {
                Random rand = new Random();
                matriz[i][j]=rand.nextInt(9);
            }
        }
    }
    
    public String calculaTotalVentasPorDia (){
        String resultado="Ventas totales por día\n";
        int ventaMayor=0;
        String diaMayor="";
        for (int i = 0; i < filasDias; i++) {
            int sumaTotal=0;
            for (int j = 0; j < cantidadProductos; j++) {
               sumaTotal+=matriz[i][j];
            }
            if (ventaMayor<sumaTotal){
                ventaMayor=sumaTotal;
                diaMayor=semana[i];
            }
            resultado+=semana[i]+":"+sumaTotal+"\n";
        }
        resultado+="El día con mayor ventas es "+diaMayor+ " con " +ventaMayor+"\n";
        //JOptionPane.showMessageDialog(null, resultado);
        return resultado;
    }
    
    public String calculaTotalVentasPorProducto (){
        String resultado="Ventas totales por producto\n";
        int productoMasVendidosCantidad=0;
        String productoMasVendidos="";
        for (int i = 0; i < cantidadProductos; i++) {
            int sumaTotal=0;
            for (int j = 0; j < filasDias; j++) {
               sumaTotal+=matriz[j][i];
            }
            if (productoMasVendidosCantidad<sumaTotal){
                productoMasVendidosCantidad=sumaTotal;
                productoMasVendidos=productos[i];
            }
            resultado+=productos[i]+":"+sumaTotal+"\n";
        }
        resultado+="El producto mas vendido es "+productoMasVendidos+ " con " +productoMasVendidosCantidad+"\n\n";
        //JOptionPane.showMessageDialog(null, resultado);
        return resultado;
    }
    
    
}

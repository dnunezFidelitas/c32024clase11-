/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3objetos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Producto {
    private int ventas[];
    private String nombreProducto;
    private final int daysWeek=7;
    private int sumaTotal=0;

    public int[] getVentas() {
        return ventas;
    }
    
    

    public Producto(String name) {
        this.nombreProducto=name;
        this.ventas = new int[daysWeek];
        llenaProducto();
    }
    
    public void llenaProducto(){
        for (int i = 0; i < daysWeek; i++) {
            Random rand = new Random();
            ventas[i] = rand.nextInt(9);
            sumaTotal+= ventas[i];
        }
    }

    @Override
    public String toString() {
        String datosVentas="{";
        for (int i = 0; i < ventas.length; i++) {
            datosVentas+=ventas[i]+",";
        }
        datosVentas+="}";
 
        return "Producto{" + "ventas=" + datosVentas + ", nombreProducto=" + nombreProducto + ", sumaTotal=" + sumaTotal + '}';
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(int sumaTotal) {
        this.sumaTotal = sumaTotal;
    }
    
    
    
    
    
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class UtilProducto {
    
      private String semana[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
      public String printVector (Producto vector[] ){
        String result=""; 
        for (int i = 0; i < vector.length; i++) {
            result=result + vector[i].toString() ;
            result=result+"\n";
        }
        return result;
        
    }
    
    public void fillVector (Producto vector[] ){
        String result=""; 
        for (int i = 0; i < vector.length; i++) {
            vector[i]=new Producto(JOptionPane.showInputDialog("Digite el nombre del producto " + (i+1)));
        }
    }
    
    public String getProductoMasVendido(Producto productos[]){
        int mayor =0;
        String productoMayor="";
        for (int i = 0; i < productos.length; i++) {
            if (mayor<productos[i].getSumaTotal()){
                mayor=productos[i].getSumaTotal();
                productoMayor=productos[i].getNombreProducto();
            }
        }
        return "El producto mas vendido es " +  productoMayor + " con estas cantidades "+ mayor;
    }
    
    public String getDiaMasVendido(Producto productos[]){
        String result ="\nSuma de los días : {";
        int vectorDiasSuma[] = new int [7];
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].getVentas().length; j++) {
                vectorDiasSuma[j]+=productos[i].getVentas()[j];
            }
        }
        String diaMayor="";
        int montoMayor=0;
        for (int i = 0; i < vectorDiasSuma.length; i++) {
            result+= vectorDiasSuma[i] + ",";
            if (montoMayor < vectorDiasSuma[i]){
                diaMayor=semana[i];
                montoMayor=vectorDiasSuma[i];
            }
        }
        result+="}\n";
        result+="El día que se vendio mas es "+ diaMayor +" con un monto de "+montoMayor;
        return result;
    }
}

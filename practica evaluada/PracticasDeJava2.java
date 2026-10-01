/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas.de.java;

import javax.swing.JOptionPane;

/**
 *
 * @author devig
 */
public class PracticasDeJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
            String textoEdad = JOptionPane.showInputDialog("Ingrese tu edad en la Tierra");
            int edadTierra = Integer.parseInt(textoEdad);

            int edadMarte = (edadTierra * 53) / 100;
            int edadJupiter = (edadTierra * 84) / 1000;
            int edadSaturno = (edadTierra * 34) / 1000;

            String mensaje = "En la Tierra tienes " + edadTierra + " años, en Marte " + edadMarte + ", en Júpiter " + edadJupiter + ", y en Saturno " + edadSaturno + " años.";
            JOptionPane.showMessageDialog(null, mensaje);
    

         
            
            
               
  

  
}}
   
   
}

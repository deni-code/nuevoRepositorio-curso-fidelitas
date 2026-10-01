/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author devig
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "";
        String variableTemporal="";
        int peso=0;
        
        nombre=JOptionPane.showInputDialog("Dime tu nombre");
        JOptionPane.showMessageDialog(null,"Este es el nombre solicitado" + nombre);
        
        variableTemporal=JOptionPane.showInputDialog("Dime tu peso");
        peso=Integer.parseInt(variableTemporal);
        peso=peso-5;
        JOptionPane.showMessageDialog(null,"Mi peso:" + peso);
        
    }
}
        
        
                
    
   
        


       


   

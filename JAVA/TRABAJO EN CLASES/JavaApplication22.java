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
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia = 0;
        String temp1 = "";

        temp1 = JOptionPane.showInputDialog("Digite el dia de la semana");
        dia = Integer.parseInt(temp1);

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "LUNES");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "MARTES");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "MIERCOLES");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "JUEVES");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "VIERNES");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "SABADO");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "DOMINGO");
                break;
            case 8:
            case 9:
            case 10:

                JOptionPane.showMessageDialog(null, "es un dia vritual");
                break;
            default:
            JOptionPane.showMessageDialog(null, "Dia incorrecto");

       
        
             
           
     }
      
   
          
    }
}
          
   
      
      
       
      
    

        
        
                
    
   
        


       


   

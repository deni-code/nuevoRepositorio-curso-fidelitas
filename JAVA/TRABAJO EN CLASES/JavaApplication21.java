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
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int edad=0;
      String temp="";
      temp=JOptionPane.showInputDialog("Digite su edad");
      edad=Integer.parseInt(temp);
      JOptionPane.showMessageDialog(null, edad);
      
      if(edad>=18){
          JOptionPane.showMessageDialog(null, "Si puede tomar alcohol");
          if(edad==18){
              JOptionPane.showMessageDialog(null, "Fijo va a ir de fiesta");
              
          }
      }else{
          JOptionPane.showMessageDialog(null, "Le toca ir a misa todos los domingos");
          
      }
      if (edad==18)
          JOptionPane.showMessageDialog(null, "tiene apenas 18");
      JOptionPane.showMessageDialog(null, "esto siempre se va a imprimir");
      
   
          
    }
}
          
   
      
      
       
      
    

        
        
                
    
   
        


       


   

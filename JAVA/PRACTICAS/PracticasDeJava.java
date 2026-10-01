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
public class PracticasDeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
   String sujeto =JOptionPane.showInputDialog("Ingrese el sujeto para el poema");
   String verbo =JOptionPane.showInputDialog("Ingrese el verbo");
   String complemento =JOptionPane.showInputDialog("Ingrese el complemento");
   
   JOptionPane.showMessageDialog(null, "Poema: \"" + sujeto + " " + verbo + " " + complemento + "\"");
}}
   
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import Interfaces.interfaz;
import javax.swing.JFrame;

/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Noviembre 10  2017
 * Programa: Pruebajava3 
 * Responsabilidad: Aplicaciones Escritorio Java
 ************************************/
public class PruebaJava3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      interfaz w = new interfaz();
      w.setVisible(true);
      w.setBounds(0, 0, 400, 0x1f4);
      w.setTitle("Tercera Evaluacion Sumativa");
      
      w.setDefaulCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
}
    

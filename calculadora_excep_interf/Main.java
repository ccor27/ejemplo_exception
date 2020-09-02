/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_excep_interf;

import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Calculadora calculadora = new Calculadora();
        
        int a,b;
        
       a =Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer valor:")) ;
       b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo valor:")) ;
        
        try {
            
            System.out.println(calculadora.sumar(a, b));
            System.out.println(calculadora.resta(a, b)); 
            System.out.println(calculadora.multiplicacion(a, b)); 
            System.out.println(calculadora.division(a, b));
            
        } catch (AccionesNoValidasException e) {
            System.out.println("la accion no se pudo ejecutar: "+e.getMessage());
        }finally{
            System.out.println("operaciones completadas.");
        }
        
        
    }
    
}

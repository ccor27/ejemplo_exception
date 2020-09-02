/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_excep_interf;

/**
 *
 * @author cristian
 */
public interface Carcasa2 {
    
    public double multiplicacion(int a, int b);
    
    public double division(int a, int b) throws AccionesNoValidasException;
}

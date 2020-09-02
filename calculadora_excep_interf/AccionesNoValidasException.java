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
public class AccionesNoValidasException extends Exception{

    public static final long serialVersionUID = 700L;
    
    public AccionesNoValidasException(String mensaje) {
        super(mensaje);
    }
    
    
}

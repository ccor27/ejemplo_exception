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
public class Calculadora implements Carcasa1, Carcasa2{

    @Override
    public int sumar(int a, int b) throws AccionesNoValidasException{
        
        if(a < 0 || b < 0){
            
            throw new AccionesNoValidasException("No te permitimos sumar con numeros negativos");
         
        }
             
        return a+b;
        //throw new AccionesNoValidasException("")
    }

    @Override
    public int resta(int a, int b) throws  AccionesNoValidasException{
        
        if(b > a){
            
           throw new AccionesNoValidasException("minuendo menor que sustraendo");
        }
      
        return a-b;
    }

    @Override
    public double multiplicacion(int a, int b){
        
        return a * b;
    }

    @Override
    public double division(int a, int b) throws AccionesNoValidasException{
        
        if(b == 0){
            throw  new AccionesNoValidasException("la division por 0 no es posible");
        }
        
        return a/b;
    }
    
}

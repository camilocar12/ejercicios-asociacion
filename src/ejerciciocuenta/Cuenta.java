/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuenta;

/**
 *
 * @author PROFESOR
 */
public class Cuenta {
    public int numero;
    public int clave;
    public String usuario;
    public double saldo;
    
    public boolean consignar(double monto){
        if (monto > 0) {
           this.saldo+=monto;
           return true;
        } else {
          return false;
        }
    }
    
    public boolean retirar(double monto){
       if(monto> 0 && monto <=this.saldo){
          this.saldo-=monto;
          return true;
       }else{
         return false;
       }
    }
    
    public boolean cambiarClave(int claveActual, int nuevaClave){
       if(claveActual == this.clave){
         this.clave = nuevaClave;
         return true;
       }else{
         return false;
       }
    }
    
    public double consultarSaldo(){
        return this.saldo;
    }
}

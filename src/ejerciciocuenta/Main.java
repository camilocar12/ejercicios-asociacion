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
public class Main {
    public static void main(String[] args) {
       boolean resultado = false;
       Cuenta magdalena = new Cuenta();
       magdalena.numero = 1012;
       magdalena.clave = 1234;
       magdalena.usuario = "Magdalena Sanchez";
       magdalena.saldo = 0;
       resultado = magdalena.consignar(100000);
       if (resultado == true) {
           System.out.println("Consignacion exitosa, nuevo saldo" + magdalena.consultarSaldo());
       } else {
           System.out.println("Consignacion no Exitosa");
       }
       
       Cuenta joselito = new Cuenta();
       joselito.numero = 1013;
       joselito.clave = 9876;
       joselito.saldo = 50000;
       joselito.usuario = "Joselito Perez";
       double saldo = joselito.consultarSaldo();
        System.out.println("Saldo " + saldo );
       
    }
}

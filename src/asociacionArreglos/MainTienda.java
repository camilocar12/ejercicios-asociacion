/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacionArreglos;

/**
 *
 * @author PROFESOR
 */
public class MainTienda {
    public static void main(String[] args) {
        Disco[] d = new Disco[5];
        for (int i = 0; i < 10; i++) {
            d[i] = new Disco(i);
            d[i].nombre = "X" + i;
        }
        
        Tienda t = new Tienda(0);
        System.out.println(t.getNombre());
        t.setNombre("Y");
        t.setDiscos(d);
        System.out.println(t.getNombre().length());
        System.out.println(t.getDiscos().length);
       
    }
}

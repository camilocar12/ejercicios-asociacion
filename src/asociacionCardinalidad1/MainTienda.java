/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacionCardinalidad1;

/**
 *
 * @author PROFESOR
 */
public class MainTienda {
    public static void main(String[] args) {
        Disco d = new Disco(10);
        d.nombre = "X";
        
        Tienda t = new Tienda(0);
        System.out.println(t.getNombre());
        t.setNombre("Y");
        System.out.println(t.getNombre().length());
        System.out.println(t.getDiscos());
        t.setDiscos(d);
        System.out.println(t.getDiscos().getPrecio());
    }
}

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
public class Tienda {
    private int nit;
    public String nombre;
    //Relacion asociacion unidirecional
    private Disco discos;

    public Tienda(int nit) {
        this.nit = nit;
    }

    public Disco getDiscos() {
        return discos;
    }

    public void setDiscos(Disco discos) {
        this.discos = discos;
    }
    
   
        
    public int getNit() {
        return nit;
    }

   

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

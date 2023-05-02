/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.HashMap;

/**
 *
 * @author Carolina Hernández
 */
public class Tienda {
 

    private HashMap<String, Double> productos;

    public Tienda() {
        this.productos = new HashMap();
    }

    public HashMap<String, Double> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Double> productos) {
        this.productos = productos;
    }
    
    

}    



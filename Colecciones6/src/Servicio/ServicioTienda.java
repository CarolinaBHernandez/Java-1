/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Tienda;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



/**
 *
 * @author Carolina Hernández
 */

public class ServicioTienda {

   Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Tienda crearTienda(){
        Tienda tienda = new Tienda();
//        agregarProductos(tienda);
        return tienda;
    }
    
    public void agregarProductos(Tienda tienda){
//        boolean verificar = true;
        do {
        System.out.print("Ingrese nombre del producto: ");
        String nombre = scan.next();
        System.out.print("Ingrese precio del producto: ");
        double precio = scan.nextDouble();
        tienda.getProductos().put(nombre, precio);
        } while (verificarRespuesta());
    }
    
    private boolean verificarRespuesta(){
        boolean verificar = true;
        String respuesta;
            while (verificar) {          
                System.out.print("Desea ingresar otro producto? (si o no): ");
              respuesta =  scan.next();  
              if (respuesta.equalsIgnoreCase("si")){
                  break;
              }else if(respuesta.equalsIgnoreCase("no")){
              verificar = false;
                }
              else{
                  System.out.println("Respuesta incorrecta");
              }
            }
            return verificar;
    }
    
    public void mostrarProductos(Tienda tienda){
        for (Map.Entry<String, Double> entry : tienda.getProductos().entrySet()) {
            System.out.println(" â€¢ " + entry.getKey() + " = " + entry.getValue());
        }
    }
    
    public void eliminarProducto(Tienda tienda, String producto){
        Iterator<Map.Entry<String, Double>> iterator = tienda.getProductos().entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().equalsIgnoreCase(producto)) {
                iterator.remove();
                break;
            }else if(!iterator.hasNext()){
                System.out.println("No se ha encontrado el producto");
            }
        }
    }    
    
    public void modificarPrecio(Tienda tienda, String producto) {
    for (Map.Entry<String, Double> entry : tienda.getProductos().entrySet()) {
        if (entry.getKey().equalsIgnoreCase(producto)) {
            System.out.print("Ingrese el nuevo precio: ");
            entry.setValue(scan.nextDouble());
            return;
        }
    }
    System.out.println("No se ha encontrado el producto");
}
    
}


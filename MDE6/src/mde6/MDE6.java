/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mde6;

//import static Entidades.Uno.metodo;

import static Entidades.Dos.metodo;


/**
 *
 * @author Carolina Hernández
 */
public class MDE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            System.out.println(metodo());
//        } catch (Exception e) {
//            System.err.println("Excepcion en metodo() ");
//        }
//    }
    /*CONSOLA:
    Valor final del try: 44
Valor final del finally: 45
Valor antes del return: 46
46 */
    
    //DOS
//    try{
//System.out.println ( metodo ( ) ) ;
//} catch(Exception e) {
//System.err.println ( "Excepcion en metodo ( ) " ) ;
//}
//}
    /*Valor final del catch: 43
Valor final del finally: 44
Valor antes del return: 45
45*/

try{
System.out.println( metodo ( ) ) ;
} catch(Exception e) {
System.err.println("Excepcion en metodo ( ) " ) ;
}
}
    
}

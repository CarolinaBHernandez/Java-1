/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu6;

import Entidad.Curso;



/**
 *
 * @author Carolina Hernández
 */
public class CDU6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso = new Curso();
        curso.crearCurso();
        double gananciaSemanal = curso.calcularGananciaSemanal();
        System.out.println("La ganancia semanal del curso es: $" + gananciaSemanal);
      
    }
    
}

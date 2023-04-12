/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;

/**
 *
 * @author User
 */
public class RaicesServicio {
    
    
   

    public double getDiscriminante(Raices ecuacion) {
        double discriminante = Math.pow(ecuacion.getB(), 2) - 4 * ecuacion.getA() * ecuacion.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices ecuacion) {
        double discriminante = Math.pow(ecuacion.getB(), 2) - 4 * ecuacion.getA() * ecuacion.getC();
        if (discriminante >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices ecuacion) {
        double discriminante = getDiscriminante(ecuacion);
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }
        public void obtenerRaices(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            double discriminante = getDiscriminante(ecuacion);
            double x1 = (-ecuacion.getB() + Math.sqrt(discriminante)) / (2 * ecuacion.getA());
            double x2 = (-ecuacion.getB() - Math.sqrt(discriminante)) / (2 * ecuacion.getA());
            System.out.println("Las posibles soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }

    
    }
       
       

      


    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu5;

import Entidades.Persona;
import Servicio.PersonaService;




/**
 *
 * @author Carolina Hernández
 */
public class CDU5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      PersonaService personaService = new PersonaService();

        // Crear una nueva persona
        Persona persona = personaService.crearPersona();

        // Mostrar información de la persona
        personaService.mostrarPersona(persona);

        // Verificar si la persona es menor que una edad base
        boolean esMenorQue = personaService.menorQue(persona);
        if (esMenorQue) {
            System.out.println(persona.getNombre()+" es menor que la edad base.");
        } else {
            System.out.println(persona.getNombre()+"es mayor a la edad base.");
        }
    }
}

    
    


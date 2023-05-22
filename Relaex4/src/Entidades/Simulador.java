/*
 Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Carolina Hernández
 */
public class Simulador {

    public List<Alumno> listaAlumnos(int cantAlum) {
        List<Alumno> alumnos = new ArrayList<>();
        List<Integer> dnis = generarDNIs(cantAlum);

        for (int i = 0; i < cantAlum; i++) {
            String nombreCompleto = nomAleatorio();
            int dni = dnis.get(i);

            Alumno alumno = new Alumno(nombreCompleto, dni);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    private String nomAleatorio() {
        String[] nombres = {"Carolina Hernández", "Alan Rolon", "Agustina Molina", "Dario Garcia", "Cristian Benicio", "Daiana Zapata"};
        Random random = new Random();
        int indice = random.nextInt(nombres.length);
        return nombres[indice]; // Retorna directamente el nombre completo aleatorio
    }

    
    /*Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.*/
    
    private List<Integer> generarDNIs(int cantidad) {
        List<Integer> dnis = new ArrayList<>();

        int dniInicial = 10000000;
        int rangoDNI = 90000000;

        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int dni = dniInicial + random.nextInt(rangoDNI);
            dnis.add(dni);
        }

        return dnis;
    }
/*Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.*/
    
    private int dniUnico(Set<Integer> dnisUtilizados, List<Integer> listaDNIs) {
        Random random = new Random();

        while (true) {
            int indice = random.nextInt(listaDNIs.size());
            int dni = listaDNIs.get(indice);

            if (!dnisUtilizados.contains(dni)) {
                dnisUtilizados.add(dni);
                return dni;
            }
        }
    }

    public void crearAlumnos(int cantidadAlumnos, List<Alumno> listaAlumnos, List<Integer> listaDNIs) {
        Set<Integer> dnisUtilizados = new HashSet<>();

        for (int i = 0; i < cantidadAlumnos; i++) {
            String nombreCompleto = nomAleatorio();
            int dni = dniUnico(dnisUtilizados, listaDNIs);

            Alumno alumno = new Alumno(nombreCompleto, dni);
            listaAlumnos.add(alumno);
        }
    }
 //Se debe imprimir por pantalla el listado de alumnos.
    
    public void mostrarAlumnos(List<Alumno> listaAlumnos) {
    System.out.println("Listado de Alumnos:");
    
    for (Alumno alumno : listaAlumnos) {
        System.out.println("Nombre: " + alumno.getNombreCompleto() + ", DNI: " + alumno.getDni());
    }
}
    
    
}





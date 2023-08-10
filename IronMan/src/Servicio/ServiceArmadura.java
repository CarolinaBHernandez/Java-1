/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Armadura;
import Entidades.Propulsor;
import Entidades.Repulsor;

/**
 *
 * @author Carolina Hernández
 */
public class ServiceArmadura extends Armadura {
    
        /*Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
establecida como consumo en la bota por el tiempo en el que se camine.*/
    public void caminar(int tiempo) {
        int consumoTotal = 0;

        // Calcular el consumo de energía total de las botas
        for (Propulsor propulsor : propulsores) {
            consumoTotal += propulsor.getConsumoEnergia();
        }

        // Calcular el consumo de energía por el tiempo de caminata
        int consumoEnergia = consumoTotal * tiempo;

        // Verificar si hay suficiente energía en la batería
        if (bateria.getCapacidad() >= consumoEnergia) {
            // Restar el consumo de energía de la batería
            bateria.setCapacidad(bateria.getCapacidad() - consumoEnergia);
            System.out.println("La armadura caminó durante " + tiempo + " minutos.");
            System.out.println("Se consumieron " + consumoEnergia + " unidades de energía.");
        } else {
            System.out.println("No hay suficiente energía en la batería para caminar.");
        }
    }

    /*Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
energía establecida como consumo en la bota por el tiempo en el que se corra.*/
    public void correr(int tiempo) {
        int consumoTotal = 0;

        // Calcular el consumo de energía total de las botas
        for (Propulsor propulsor : propulsores) {
            consumoTotal += propulsor.getConsumoEnergia();
        }
        int consumoEnergia = consumoTotal * 2 * tiempo;

        if (bateria.getCapacidad() >= consumoEnergia) {
            bateria.setCapacidad(bateria.getCapacidad() - consumoEnergia);
            System.out.println("La armadura corrió durante " + tiempo + " minutos.");
            System.out.println("Se consumieron " + consumoEnergia + " unidades de energía.");
        } else {
            System.out.println("No hay suficiente energía en la batería para correr.");
        }
    }

    /*Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
energía por el tiempo que dure la propulsión.*/
    public void propulsarse(int tiempo) {
        int consumoTotal = 0;

        // Calcular el consumo de energía total de las botas
        for (Propulsor propulsor : propulsores) {
            consumoTotal += propulsor.getConsumoEnergia();
        }
        int consumoEnergia = consumoTotal * 3 * tiempo;

        if (bateria.getCapacidad() >= consumoEnergia) {
            bateria.setCapacidad(bateria.getCapacidad() - consumoEnergia);
            System.out.println("La armadura corrió durante " + tiempo + " minutos.");
            System.out.println("Se consumieron " + consumoEnergia + " unidades de energía.");
        } else {
            System.out.println("No hay suficiente energía en la batería para propulsarse.");
        }
    }

    /*Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
consumiendo el triple de la energía establecida para las botas y el doble para los guantes.*/
    public void volar(int tiempo) {
        int consumoTotalBotas = 0;
        int consumoTotalGuantes = 0;

        for (Propulsor propulsor : propulsores) {
            consumoTotalBotas += propulsor.getConsumoEnergia();
        }

        for (Repulsor repulsor : repulsores) {
            consumoTotalGuantes += repulsor.getConsumoEnergia();
        }

        int consumoEnergiaBotas = consumoTotalBotas * 3 * tiempo;
        int consumoEnergiaGuantes = consumoTotalGuantes * 2 * tiempo;

        if (bateria.getCapacidad() >= consumoEnergiaBotas + consumoEnergiaGuantes) {

            bateria.setCapacidad(bateria.getCapacidad() - (consumoEnergiaBotas + consumoEnergiaGuantes));
            System.out.println("La armadura voló durante " + tiempo + " minutos.");
            System.out.println("Se consumieron " + consumoEnergiaBotas + " unidades de energía en las botas.");
            System.out.println("Se consumieron " + consumoEnergiaGuantes + " unidades de energía en los guantes.");
        } else {
            System.out.println("No hay suficiente energía en la batería para volar.");
        }
    }

    /*Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.*/
    public void guanteArma(int tiempoDisparo) {
        int consumoTotalGuantes = 0;

        for (Repulsor repulsor : repulsores) {
            consumoTotalGuantes += repulsor.getConsumoEnergia();
        }

        int consumoEnergiaGuantes = consumoTotalGuantes * 3 * tiempoDisparo;

        if (bateria.getCapacidad() >= consumoEnergiaGuantes) {

            bateria.setCapacidad(bateria.getCapacidad() - consumoEnergiaGuantes);
            System.out.println("Se utilizó los guantes como armas durante " + tiempoDisparo + " segundos.");
            System.out.println("Se consumieron " + consumoEnergiaGuantes + " unidades de energía en los guantes.");
        } else {
            System.out.println("No hay suficiente energía en la batería para utilizar los guantes como armas.");
        }
    }


    /*Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
establecido en estos dispositivos. Solo se usa en nivel básico.*/
    public void escribirEnConsola(String mensaje) {
        int consumoEnergiaConsola = consola.getConsumoEnergia();

        if (bateria.getCapacidad() >= consumoEnergiaConsola) {
            bateria.setCapacidad(bateria.getCapacidad() - consumoEnergiaConsola);
            System.out.println("Escribiendo en la consola: " + mensaje);
            System.out.println("Se consumieron " + consumoEnergiaConsola + " unidades de energía en la consola.");
        } else {
            System.out.println("No hay suficiente energía en la batería para escribir en la consola.");
        }
    }

    public void hablarSintetizador(String mensaje) {
        int consumoEnergiaSintetizador = sintetizador.getConsumoEnergia();

        if (bateria.getCapacidad() >= consumoEnergiaSintetizador) {
            bateria.setCapacidad(bateria.getCapacidad() - consumoEnergiaSintetizador);
            System.out.println("Hablando a través del sintetizador: " + mensaje);
            System.out.println("Se consumieron " + consumoEnergiaSintetizador + " unidades de energía en el sintetizador.");
        } else {
            System.out.println("No hay suficiente energía en la batería para hablar por el sintetizador.");
        }

    }
    
    
    
}

/*
ARMADURA IRON MAN:
J.A.R.V.I.S. es una inteligencia artificial desarrollada por Tony Stark. Está programado para hablar
con voz masculina y acento británico. Actualmente se encarga de todo lo relacionado con la
información doméstica de su casa, desde los sistemas de calefacción y refrigeración hasta los Hot
Rod que Stark tiene en su garage.
Tony Stark quiere adaptar a J.A.R.V.I.S. para que lo asista en el uso de sus armaduras, por lo tanto,
serás el responsable de llevar adelante algunas de estas tareas.
El objetivo de JARVIS es que analice intensivamente toda la información de la armadura y del
entorno y en base a esto tome decisiones inteligentes.
En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
prisioneros.
Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.
La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
se mide con un número entero cuya unidad de medida de dureza es Rockwell
(https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen un nivel de salud el
cual se mide de 0 a 100. Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
parte de la armadura.
La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe
información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS
susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
consola y sintetizador) tienen un consumo de energía asociado.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Armadura {

    public String colorPrimario;
    public String colorSecundario;
    public Propulsor[] propulsores;
    public Repulsor[] repulsores;
    public int nivelResistencia;
    public int nivelSalud;
    public Generador generador;
    public Bateria bateria;
    public Consola consola;
    public Sintetizador sintetizador;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, Propulsor[] propulsores, Repulsor[] repulsores, int nivelResistencia, int nivelSalud, Generador generador, Bateria bateria, Consola consola, Sintetizador sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.propulsores = propulsores;
        this.repulsores = repulsores;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.generador = generador;
        this.bateria = bateria;
        this.consola = consola;
        this.sintetizador = sintetizador;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Propulsor[] getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(Propulsor[] propulsores) {
        this.propulsores = propulsores;
    }

    public Repulsor[] getRepulsores() {
        return repulsores;
    }

    public void setRepulsores(Repulsor[] repulsores) {
        this.repulsores = repulsores;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

}

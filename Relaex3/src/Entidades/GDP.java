/*
Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package Entidades;

import java.util.Date;


/**
 *
 * @author Carolina Hernández
 */
public class GDP {
    
    private GDV vehiculo;
    private GIC cliente;
    private int numPoliza;
    private Date fechadeinicio;
    private Date fechafinal;
    private int cuotas;

    public GDP() {
    }

    public GDP(GDV vehiculo, GIC cliente, int numPoliza, Date fechadeinicio, Date fechafinal, int cuotas) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numPoliza = numPoliza;
        this.fechadeinicio = fechadeinicio;
        this.fechafinal = fechafinal;
        this.cuotas = cuotas;
    }

    public GDV getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(GDV vehiculo) {
        this.vehiculo = vehiculo;
    }

    public GIC getCliente() {
        return cliente;
    }

    public void setCliente(GIC cliente) {
        this.cliente = cliente;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(Date fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    
    
}

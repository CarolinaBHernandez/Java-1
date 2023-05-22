/*
Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Carolina Hernández
 */
public class GDC {
    
    private int numCuota;
    private double montoTotal;
    private boolean pagada;
    private Date fechaVenc;
    private String fdp;

    public GDC() {
    }

    public GDC(int numCuota, double montoTotal, boolean pagada, Date fechaVenc, String fdp) {
        this.numCuota = numCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVenc = fechaVenc;
        this.fdp = fdp;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public String getFdp() {
        return fdp;
    }

    public void setFdp(String fdp) {
        this.fdp = fdp;
    }
    
}

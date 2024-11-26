/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba8valor;

/**
 *
 * @author chung
 */

//R = renta o pago por periodo.
//M o C = monto o cantidad en el momento del vencimiento.
//i = tasa de interés.
//n = número de pagos.


public class datosCliente {
    
    
double montoVencido, montoPeriodo;
int interesPorcentaje, numeroPagos;

    public double getMontoVencido() {
        return montoVencido;
    }

    public void setMontoVencido(double montoVencido) {
        this.montoVencido = montoVencido;
    }

    public double getMontoPeriodo() {
        return montoPeriodo;
    }

    public void setMontoPeriodo(double montoPeriodo) {
        this.montoPeriodo = montoPeriodo;
    }

    public int getInteresPorcentaje() {
        return interesPorcentaje;
    }

    public void setInteresPorcentaje(int interesPorcentaje) {
        this.interesPorcentaje = interesPorcentaje;
    }

    public int getNumeroPagos() {
        return numeroPagos;
    }

    public void setNumeroPagos(int numeroPagos) {
        this.numeroPagos = numeroPagos;
    }



}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba8valor;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Prueba8valor {

    static datosCliente cliente = new datosCliente();
    
    /**
     * @param args the command line arguments
     */
    
    
    //R = renta o pago por periodo.
//M o C = monto o cantidad en el momento del vencimiento.
//i = tasa de interés.
//n = número de pagos.

    public static void pedir(){
    Scanner entrada = new Scanner (System.in);   
        
    System.out.println("Ingrese su pago por periodo");
    cliente.setMontoPeriodo(entrada.nextDouble());
    entrada.nextLine();
    
    System.out.println("Ingrese su monto al momento de vencimiento: ");
    cliente.setMontoVencido(entrada.nextDouble());
    
    System.out.println("Ingrese su tasa de interes en porcentaje: ");
    cliente.setInteresPorcentaje(entrada.nextInt());
    
    System.out.println("Ingrese su numero de pagos: ");
    cliente.setNumeroPagos(entrada.nextInt());
   
    }
    
    public static double calculo(int tipoAnualidad, double interesPorcentaje){
        double calculo=0;
        switch(tipoAnualidad){
    
        case 1:
            calculo = cliente.getMontoPeriodo() * ((1- Math.pow((1+interesPorcentaje),-cliente.getNumeroPagos())/ cliente.getNumeroPagos()) );
            break;
    
        case 2:
            calculo = (cliente.getMontoPeriodo() * (1+ cliente.getNumeroPagos()) * ((1- Math.pow((1+interesPorcentaje),-cliente.getNumeroPagos())/ cliente.getNumeroPagos())) );
            
            break;
            
        default:
            break;
        
    
    }
    
    return calculo;
    }
    
    public static void main(String[] args) {
        int tipoAnualidad;
        Scanner entrada = new Scanner(System.in);
        double calculo;
        
        System.out.println("Ingrese el tipo de anualidad que desea calcular: \n1.Anualidad ordinaria\n2.Anualidad anticipada");
        tipoAnualidad = entrada.nextInt();
        
        pedir();
        double interesDecimal = cliente.getInteresPorcentaje()/100;
    
        
           
                
        System.out.println("Lps." + calculo(tipoAnualidad,interesDecimal));
                
                
           
        
        
        
        
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba8_restaurante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author chung
 */

public class Prueba8_restaurante {

    public static cliente cliente= new cliente();
    public static menu menu = new menu();
    /**
     * @param args the command line arguments
    
    
    */
    
 
    public static void validarMenu(){
    
    
    
    
    }
    public static double descuentos(double total){
    double montoDescuentos=0;
    
    
        
        
    return montoDescuentos;
    }
    
    public static void main(String[] args) {
        String usuarioInput;
        int dia;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre completo: ");
        cliente.setNombre(entrada.nextLine());
        
        System.out.println("Ingrese su direccion: ");
        cliente.setDireccion(entrada.nextLine());
        
        System.out.println("Ingrese su numero de telefono sin guiones: ");
        cliente.setNumeroTelefono(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Ingrese el dia actual: \n1.Lunes\n2.Martes\n3.Miercoles\n4.Jueves\n5.Viernes\n6.Sabado\n7.Domingo");
        dia = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Es cliente frecuente (s/n)");
        usuarioInput = entrada.next().toLowerCase();
        
        if(usuarioInput.equals("s")){
        cliente.setFrecuente(true);
                }
        else{
        cliente.setFrecuente(false);
        
        }
        
        System.out.println("Es mayor de edad?(s/n)");
        usuarioInput = entrada.next().toLowerCase();
        
        if(usuarioInput.equals("s")){
        cliente.setMayorEdad(true);   
        }
        else{
        cliente.setMayorEdad(false);
        
        }
        
        
        
        
    }
    
}

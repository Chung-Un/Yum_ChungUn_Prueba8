/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba8_restaurante;

import java.util.Scanner;

/**
 *
 * @author chung
 */

public class Prueba8_restaurante {

    public static cliente cliente= new cliente();
    /**
     * @param args the command line arguments
    
    
    */
    
 
    public static void validarMenu(){
    int dia=0;
    switch(dia){
        case 1:
    
    
    
    }
    
    
    
    }
    
    public static void main(String[] args) {
        
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
        
        
        
    }
    
}

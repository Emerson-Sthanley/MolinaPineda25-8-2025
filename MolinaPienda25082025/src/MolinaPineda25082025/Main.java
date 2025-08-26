/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MolinaPineda25082025;

/**
 *
 * @author UFG
 */

//Creando una clase Scanner.
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ingresar_Datos();
    }
    //METODO DE ARREGLO DE EDADES
    public static void Ingresar_Datos(){
        //INICIACIÓN DE LA CLASE DE SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //DECLARACIÓN DE LAS VARIABLES A UTILIZAR
        int[] edades = new int [10];
        int suma = 0;
        int total_edades_pares = 0;
        int total_edades_impares = 0;
        
        //MENSAJE DE USUARIO
        System.out.println("Ingrese " +edades.length+ " edades");
        
        //SE RECORRE EL ARREGO PARA ASIGNAR VALOR A CADA ELEMENTO 
        for(int i = 0; i < edades.length; i++){
         
            //SE SOLICITA AL USUARIO EL INGRESO DE UN VALOR
            System.out.println("Edad " +i+ ": ");
            
            //SE LEE DESDE TECLADO EL CALOR DIGITADO POR EL USUARIO
            //Y SE ASIGNA A LA VARIBLE DE EDAD QUE CORRESPONDE SEGÚ
            //LA POSICIÓN EN LA ITERACIÓN
            edades[i] = scanner.nextInt();
            
            //PARA CALCULAR EL PROMEDIO, SE REQUIERE SUMAR TODAS LAS 
            //EDADES REGISTRADAS EN CADA ELEMENTO 
            suma+= edades[i];
            
            //ESTABLECER SI EL VALOR DIGITADO ES PAR O IMPAR
            if((edades[i] % 2) == 0){
                //ES PAR
                //SE INCREMENTA LA VARIABLEACUMULADORA
                total_edades_pares++;
            }
            else{
                 //ES IMPAR
                 //SE INCREMENTA LA VARIABLEACUMULADORA

                 total_edades_impares++;
            }
            
        }
        
        //SE CALCULA EL PROMEDIO DE LAS EDADES
        double promedio =(double) suma/edades.length;
        
        //SE IMPRIME LA SALIDA
        System.out.println("Usted ha ingresado: " +edades.length+ " edades");
        System.out.println("El promedio de las edades ingresadas es: " +promedio);
        System.out.println("Ingreso: " +total_edades_pares+ " edades pares y "+total_edades_impares+ " edades impares");
        
        //SE CIERRA EL OBJETO DE TIPO scanner, PORQUE YA NO HABRÁ MÁS LECTURAS
        scanner.close();
        
    }
    
}

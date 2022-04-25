/*

Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package pruebaejemplo;
/**
*
*
*/
public class PruebaEjemplo {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    String [] nombres = new String [5]; 
    
    nombres[0] = "Armando";
    nombres[1] = "Rosa";
    nombres[2] = "Maya";
    nombres[3] = "Jesus";   
    nombres[4] = "Carlos";   

    for(String nombre : nombres)
    {

}
    int [] idCliente = {7890731, 0601260, 33659596, 45388100, 53571505};
    int [] balance = {9000, 2000000,5000, 1000000, 7000};
    
    String Armando     =  ("Nombre: " + nombres [0] + " ID del cliente: " + idCliente [0]+ " Saldo disponible: " + balance [0] );
    
    String Rosa     =  ("Nombre: " + nombres [1] + " ID del cliente: " + idCliente [1]+ " Saldo disponible: " + balance [1] );
    
    String Maya     =  ("Nombre: " + nombres [2] + " ID del cliente: " + idCliente [2]+ " Saldo disponible: " + balance [2] );
    
    String Jesus     =  ("Nombre: " + nombres [3] + " ID del cliente: " + idCliente [3]+ " Saldo disponible: " + balance [3] );
    
    String Carlos    =  ("Nombre: " + nombres [4] + " ID del cliente: " + idCliente [4]+ " Saldo disponible: " + balance [4] );
    
    System.out.println(Armando);
    
    System.out.println(Rosa);
    
    System.out.println(Maya);
    
    System.out.println(Jesus);
    
    System.out.println(Carlos);
    
    String res = "";
    for (int i:balance){
        if( i < 50000){
            res = "Cliente Regular";
        }else{
            res = "Cliente Premium";
        }
    
        System.out.println("---------------------------------------");
        System.out.println( "Nivel de los clientes: "  + res );
        
    }
}

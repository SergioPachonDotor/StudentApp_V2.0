/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

//import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author sap98
 */
public class App {
    
    public static void main(String[] args){
        
        Scanner input_command = new Scanner(System.in);
        int command = 0;
        
        do{
            System.out.println("__________");
            System.out.println("1. Create Student");
            System.out.println("2. List Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Quit App");
            
            command = input_command.nextInt();
            
            switch(command){
                case 1: 
                    StudentServices.createStudent();
                    break;
                case 2:
                    StudentServices.listStudent();
                    break;
                case 3:
                    StudentServices.editStudent();
                    break;
                case 4:
                    StudentServices.deleteStudent();
                    break;
                default:
                    break;
            }
        }
        while(command != 5);
        
        
//        Conexion connection = new Conexion();
        
 //       try(Connection cnx = connection.get_connection()){
 //       }
//        catch(Exception e){
//            System.out.println(e);
  //     }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.Scanner;

/**
 *
 * @author Sergio Pachón D.
 */
public class StudentServices {
    
    public static void createStudent(){
        Scanner input_command = new Scanner(System.in);
        
        System.out.println("Student Name: ");
        String student_name = input_command.nextLine();
        
        System.out.println("Student Mail: ");
        String student_mail = input_command.nextLine();
        
        System.out.println("Student Address: ");
        String student_address = input_command.nextLine();
        
        System.out.println("Student Phone: ");
        String student_phone = input_command.nextLine();
        
        System.out.println("Student Gender: ");
        String student_gender = input_command.nextLine();
        
        Student register = new Student();
        
        register.setStudent_name(student_name);
        register.setStudent_mail(student_mail);
        register.setStudent_address(student_address);
        register.setStudent_phone(student_phone);
        register.setStudent_gender(student_gender);
        
        StudentsDAO.createStudentDB(register);
    }
    
    public static void listStudent(){
        StudentsDAO.readStudentDB();
    }
    
    public static void editStudent(){
        Scanner input_command = new Scanner(System.in);
        Scanner input_command_int = new Scanner(System.in);
        
        System.out.println("Update Student\n");
        
        System.out.println("Student ID: ");
        int student_id = input_command_int.nextInt();
        
        System.out.println("Student Name: ");
        String student_name = input_command.nextLine();
        
        System.out.println("Student Mail: ");
        String student_mail = input_command.nextLine();
        
        System.out.println("Student Address: ");
        String student_address = input_command.nextLine();
        
        System.out.println("Student Phone: ");
        String student_phone = input_command.nextLine();
        
        System.out.println("Student Gender: ");
        String student_gender = input_command.nextLine();
        
        Student update = new Student();
        
        update.setStudent_name(student_name);
        update.setStudent_mail(student_mail);
        update.setStudent_address(student_address);
        update.setStudent_phone(student_phone);
        update.setStudent_gender(student_gender);
        update.setStudent_id(student_id);
        
        StudentsDAO.updateStudentDB(update);
    }
    
    public static void deleteStudent(){
        Scanner input_command = new Scanner(System.in);

        System.out.println("Student ID to delete: ");
        int student_id = input_command.nextInt();
        StudentsDAO.deleteStudentDB(student_id);
    }
    
    // Methods for GUI
    
    public static void createStudentGUI(
                                        String student_name, 
                                        String student_mail,
                                        String student_address,
                                        String student_phone,
                                        String student_gender
    ){
        Student register = new Student();
        
        register.setStudent_name(student_name);
        register.setStudent_mail(student_mail);
        register.setStudent_address(student_address);
        register.setStudent_phone(student_phone);
        register.setStudent_gender(student_gender);
        
        StudentsDAO.createStudentDB(register);
    }
    
    public static void updateStudentGUI(
                                        int student_id,
                                        String student_name, 
                                        String student_mail,
                                        String student_address,
                                        String student_phone,
                                        String student_gender
    ){
        
        Student update = new Student();
        
        update.setStudent_name(student_name);
        update.setStudent_mail(student_mail);
        update.setStudent_address(student_address);
        update.setStudent_phone(student_phone);
        update.setStudent_gender(student_gender);
        update.setStudent_id(student_id);
        
        StudentsDAO.updateStudentDB(update);
    }
    
    public static void deleteStudentGUI(int student_id){
        StudentsDAO.deleteStudentDB(student_id);
    }
}

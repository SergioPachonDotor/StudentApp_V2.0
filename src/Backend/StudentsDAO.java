/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author sap98
 */
public class StudentsDAO {
    
    public static void createStudentDB(Student student){
        Conexion connect_to_db = new Conexion();
        try(Connection conexion = connect_to_db.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO students (student_name, student_mail, student_address, student_phone, gender) VALUES (?,?,?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,student.getStudent_name());
                ps.setString(2,student.getStudent_mail());
                ps.setString(3,student.getStudent_address());
                ps.setString(4,student.getStudent_phone());
                ps.setString(5,student.getStudent_gender());
                ps.executeUpdate();
                System.out.println("Srudent Created Succesfully");
            }
            catch(SQLException ex){
                System.out.println(ex);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void readStudentDB(){
        Conexion connect_to_db = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection conexion = connect_to_db.get_connection()){
            String query = "SELECT * FROM students";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("student_id"));
                System.out.println("Sudent Name: " + rs.getString("student_name"));
                System.out.println("Student E-Mail: " + rs.getString("student_mail"));
                System.out.println("Student Address: " + rs.getString("student_address"));
                System.out.println("Student Phone: " + rs.getString("student_phone"));
                System.out.println("Student Gender: " + rs.getString("gender"));
                System.out.println("__________\n");
            }
        }
        catch(SQLException e){
            System.out.println("No Students Recorded");
            System.out.println(e);
        }
    }
    
    public static void updateStudentDB(Student student){
        Conexion connect_to_db = new Conexion();
       
        try(Connection conexion = connect_to_db.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "UPDATE students SET student_name = ?, student_mail = ?, student_address = ?, student_phone = ? , gender = ? WHERE student_id = ? ";
                
                ps = conexion.prepareStatement(query);
                ps.setString(1, student.getStudent_name());
                ps.setString(2, student.getStudent_mail());
                ps.setString(3, student.getStudent_address());
                ps.setString(4, student.getStudent_phone());
                ps.setString(5, student.getStudent_gender());
                ps.setInt(6, student.getStudent_id());
                ps.executeUpdate();
                System.out.println("Successfully Updated Student");

            }
            catch(SQLException ex){
                System.out.println(ex);
            }           
        }
        catch(SQLException e){
            System.out.println(e);
            System.out.println("Unable To Update Student");
        }
    }
    
    public static void deleteStudentDB(int student_id){
        Conexion connect_to_db = new Conexion();
       
        try(Connection conexion = connect_to_db.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM students WHERE students.student_id = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, student_id);
                ps.executeUpdate();
                System.out.println("Student Deleted");
            }
            catch(SQLException ex){
                System.out.println(ex);
            }           
        }
        catch(SQLException e){
            System.out.println(e);
            System.out.println("Unable To Delete Student");
        }
    }
}

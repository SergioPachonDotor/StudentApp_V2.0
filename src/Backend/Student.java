/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Sergio Pachón D.
 */
public class Student {
    int student_id;
    String student_name;
    String student_mail;
    String student_address;
    String student_phone;
    String student_gender;
    
    public Student(){
    
    }

    public Student(String student_name, String student_mail, String student_address, String student_phone, String student_gender) {
        this.student_name = student_name;
        this.student_mail = student_mail;
        this.student_address = student_address;
        this.student_phone = student_phone;
        this.student_gender = student_gender;
    }
    
   public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_mail() {
        return student_mail;
    }

    public void setStudent_mail(String student_mail) {
        this.student_mail = student_mail;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public String getStudent_phone() {
        return student_phone;
    }

    public void setStudent_phone(String student_phone) {
        this.student_phone = student_phone;
    }

    public String getStudent_gender() {
        return student_gender;
    }

    public void setStudent_gender(String student_gender) {
        this.student_gender = student_gender;
    }
    
    
}

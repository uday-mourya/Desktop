/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBMS;

/**
 *
 * @author T460
 */
public class Student {
    private int stid;
    private String studentName;
    private String studentCity;
    private String studentPhone;

    public Student() {
        super();
    }

    public Student(int stid, String studentName, String studentCity, String studentPhone) {
        super();
        this.stid = stid;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentPhone = studentPhone;
       
    }

    public Student(String studentName, String studentCity, String studentPhone) {
        super();
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentPhone = studentPhone;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    @Override
    public String toString() {
        return "Student{" + "stid=" + stid + ", studentName=" + studentName + ", studentCity=" + studentCity + ", studentPhone=" + studentPhone + '}';
    }
    
    
    
    
    
}

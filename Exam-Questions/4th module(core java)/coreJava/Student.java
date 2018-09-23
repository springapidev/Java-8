/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-27
 */
public class Student {
    public static int noOfStudent=0;
    private int id;
    public String name;
    private int age;

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    noOfStudent++;
    
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
         noOfStudent++;
         
    }
    public static void main(String[] args) {
        Student std=new Student();
        System.out.println("No of Student"+Student.noOfStudent);
        
        Student Student1=new Student();
        System.out.println("No of Student"+Student1.noOfStudent);
        
    }
            
    


}

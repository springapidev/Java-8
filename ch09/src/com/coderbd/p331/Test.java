package com.coderbd.p331;

public class Test {
    
    public static void main(String[] args) {
        System.out.println("========== way -1=================");
        Student student1 = new Student();
        student1.setName("Shuvo");
        student1.setAge(25);
        student1.setIsScienceMajor(true);
        student1.setGender('m');
        
        student1.setName("Motin");
        
        System.out.println("name? " + student1.name);
        System.out.println("age? " + student1.age);
        System.out.println("isScienceMajor? " + student1.isScienceMajor);
        System.out.println("gender? " + student1.gender);

        //////////way-2===============
        System.out.println("========== way -2=================");
        Student student2 = new Student();
        student2.name = "Shetu";
        student2.age = 25;
        student2.isScienceMajor = true;
        student2.gender = 'm';
        student2.setAge(24);
        
        System.out.println("name? " + student2.name);
        System.out.println("age? " + student2.age);
        System.out.println("isScienceMajor? " + student2.isScienceMajor);
        System.out.println("gender? " + student2.gender);
        
        System.out.println("========== way -3=================");
        Student student3 = new Student("Arif", 25, true, 'm');
        System.out.println("name? " + student3.name);
        System.out.println("age? " + student3.age);
        System.out.println("isScienceMajor? " + student3.isScienceMajor);
        System.out.println("gender? " + student3.gender);
        
        System.out.println("========== way -4=================");
        
        Studentt studentt4 = new Studentt("Sumaya", 22, false, 'f');        
        System.out.println("name? " + studentt4.getName());
        System.out.println("age? " + studentt4.getAge());
        System.out.println("isScienceMajor? " + studentt4.isIsScienceMajor());
        System.out.println("gender? " + studentt4.getGender());
    }
}

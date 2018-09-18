package com.coderbd;
// Setter and Getter based
// Value set korbo and get korbo

public class Teacher {
// Step-1: Instance Variable declare

    int id;
    String name;
    String educationQualification;
// Step-2: Deafult Constructor Neya (Optional)    

//Step-3: create setters methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }
    //Step-4: Take a Main Method or any method (Optional)

    public static void main(String[] args) {
        //STep-5: Create object using default constructor
        Teacher teacher = new Teacher();
        //Step-6: set value within Object teacher
        teacher.setId(2000);
        teacher.setName("Mr. Jorge Washington");
        teacher.setEducationQualification("MASTER");
        System.out.println("ID: " + teacher.getId());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Edu: " + teacher.getEducationQualification());
        /////////////////////
        Teacher teacher2 = new Teacher();
        //Step-6: set value within Object teacher
        teacher2.setId(3000);
        teacher2.setName("Mr. Jorge Japan");
        teacher2.setEducationQualification("Honors");
        System.out.println("ID 2: " + teacher2.getId());
        System.out.println("Name 2: " + teacher2.getName());
        System.out.println("Edu 2: " + teacher2.getEducationQualification());
    }
    //Step-7: generate getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

}

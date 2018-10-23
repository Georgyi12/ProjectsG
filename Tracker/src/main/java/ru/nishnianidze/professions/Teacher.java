package ru.nishnianidze.professions;

public class Teacher extends Profession{

    public String subject;

    public Teacher(String subject){
        this.subject = subject;
    }
    public Teacher (String name, String professionn, String salary) {
        super ( name,professionn, salary);
    }


    public String teachStudents() {

     return this.subject;
    }
}
package ru.nishnianidze.professions;

public class Teacher extends Profession{
    public String subject;

 public Teacher (String name, String professionn, String salary, String subject) {
     this.name = name;
     this.professionn = professionn;
     this.salary = salary;
     this.subject = subject;

    }

    public Teacher(String katya, String teacher, String twoThousend$) {
    }

    public String teachStudents() {

     return this.subject;
    }
}
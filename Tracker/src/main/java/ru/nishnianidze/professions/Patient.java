package ru.nishnianidze.professions;

public class Patient extends Profession {

    public String diagnose;

    public Patient(String name, String profession, String salary, String diagnose) {

        this.name = name;
        this.professionn = professionn;
        this.salary = salary;
        this.diagnose= diagnose;

    }

     public String getDiagniose() {
        return this.diagnose;
     }

}
package ru.nishnianidze.professions;

public class Profession{

    public String name;
    public String professionn;
    public String salary;



    public Profession(String name, String professionn, String salary) {
        this.name = name;
        this.professionn = professionn;
        this.salary = salary;
    }

    public Profession() {
    }

    public String getName() {

        return this.name;
        }
    public String getProfession() {

        return this.professionn;
    }

     public String getSalary() {

        return this.salary;
     }


}
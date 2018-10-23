package ru.nishnianidze.professions;

public class Patient extends Profession {

    public String cure;

    public Patient(String cure){
        this.cure = cure;
    }


     public String getCure() {
        return this.cure;
     }

}
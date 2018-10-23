package ru.nishnianidze.professions;

public class Doctor extends Profession {

    public String diagnose;
    public String medicament;

    public Doctor (String name, String professionn, String salary, String medicament, String diagnose) {
        this.name = name;
        this.professionn = professionn;
        this.medicament = medicament;
        this.diagnose = diagnose;
        this.salary = salary;

    }

    public Doctor(String richard, String doctor, String thousend$) {
    }

    public String getDiagnose(){
            return this.diagnose;
        }

        public String healPatient(){
         return medicament;
        }
    }



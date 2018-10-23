package ru.nishnianidze.professions;

public class Doctor extends Profession {

    public String diagnose;
    public String medicament;

    public Doctor (String medicament, String diagnose) {

        this.medicament = medicament;
        this.diagnose = diagnose;
        }

    Doctor (String name, String professionn, String salary) {
        super ( name,professionn, salary);
    }


    public String getDiagnose(){
            return this.diagnose;
        }

        public String healPatient(){
         return medicament;
        }
    }



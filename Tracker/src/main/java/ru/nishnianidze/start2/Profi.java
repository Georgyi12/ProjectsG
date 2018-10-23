package ru.nishnianidze.start2;

import ru.nishnianidze.professions.*;

public class Profi {
    public Profession[] profession = new Profession[4];


    public static void main(String[] args) {
        Profi profi = new Profi();

        profi.profession[0] = new Profession("Jango", "Doctor", "Hundred$");
        profi.profession[1] =  new Engineer("13");
        profi.profession[2] = new Doctor("nurofen", "snuffle");
        profi.profession[3] = new Teacher("mathematic");


        for (Profession profess : profi.profession) {
            if (profess instanceof Teacher) {
                Teacher teacher = (Teacher) profess;
                System.out.println(teacher.teachStudents());

            }


            System.out.println(profess.getName() + " " + profess.getProfession() + " " + profess.getSalary());

        }
    }
}
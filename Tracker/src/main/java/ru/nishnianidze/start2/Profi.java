package ru.nishnianidze.start2;

import ru.nishnianidze.professions.*;

public class Profi {
    public Profession[] profession = new Profession[4];


    public static void main(String[] args) {
        Profi profi = new Profi();
        profi.profession[0] = new Profession("Jango", "Doctor", "Hundred$");
        profi.profession[1] = new Engineer("James", "Engineer", "FiveHundred$");
        profi.profession[2] = new Doctor("Richard", "Doctor", "Thousend$");
        profi.profession[3] = new Teacher("Katya", "Teacher", "TwoThousend$", "Chemistry");

        for (Profession profess : profi.profession) {
            if (profess instanceof Teacher) {
                Teacher teacher = (Teacher) profess;
                System.out.println(teacher.teachStudents());

            }


            System.out.println(profess.getName() + " " + profess.getProfession());

        }
    }
}
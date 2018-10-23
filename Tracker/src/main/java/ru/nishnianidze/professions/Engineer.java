package ru.nishnianidze.professions;

public class Engineer extends Profession {

         public String howLong;

         public Engineer(String howLong){
             this.howLong = howLong;
         }

         Engineer (String name, String professionn, String salary) {
            super ( name,professionn, salary);
            }

            public String howLong(){

             return howLong;
            }


        }


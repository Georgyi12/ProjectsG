package ru.nishnianidze.professions;

public class Engineer extends Profession {

        public String branchOfEngeneering;

        public Engineer (String name, String professionn, String salary, String branchOfEngeneering) {

            this.name = name;
            this.professionn = professionn;
            this.salary = salary;
            this.branchOfEngeneering = branchOfEngeneering;
        }

    public  Engineer(String james, String engineer, String fiveHundred$) {
    }


    public String getBranchOfEngeneering()
    {

        return branchOfEngeneering;
        }

    }

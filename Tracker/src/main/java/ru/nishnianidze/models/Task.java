package ru.nishnianidze.models;

public class Task extends Item {


    public Task(String name) {
        this.name = name;
        //this.description = desc;

}
      public String calculatePrice() {

       return "100%";
}
      
}
package ru.nishnianidze.start;

import ru.nishnianidze.models.*;

public class StartUi {

    public static void main(String[] args){
        Tracker tracker = new Tracker();
        tracker.add(new Task("first task, first desk"));
        for(Item item: tracker.getAll()) {
            System.out.println(item.getName());
        }
    }
}
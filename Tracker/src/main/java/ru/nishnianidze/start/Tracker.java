package ru.nishnianidze.start;

import ru.nishnianidze.models.*;
import java.util.*;


public class Tracker {

    private Item[] items = new Item[100];

    private int position = 0;

    private static final Random RN = new Random();


    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    public void replace(String id, Item item) {
        for (int index = 0; index != items.length; index++) {
            if (items[index].getId().equals(id)) {
                this.items[index] = item;
            }
        }
    }

    public void delete(String id) {
        for (int index = 0; index != items.length; index++)
            if (items[index].getId().equals(id)) {
                System.arrayCopy(index, items.length - 1);
            }

    }


    public  Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }

        }
        return result;
    }

    public Item findByName(String key){
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result = item;
                break;
            }
        }
        return result;
    }



    String generateId() {

        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }


    public Item[] getAll() {

        return this.items;

        }
    }

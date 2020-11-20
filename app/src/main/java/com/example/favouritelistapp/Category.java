package com.example.favouritelistapp;

import java.io.Serializable;
import java.util.ArrayList;

public class Category implements Serializable {
    private String name;
    private ArrayList<String> items = new ArrayList<>();

    public Category(String name, ArrayList<String> items) {
        this.name = name;
        this.items = items;
    }

    //getters
    public String getName() {
        return name;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}

package com.project.models;

import java.io.*;
import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Task> tasks;

    public User(String name) {
        this.name = name;
    }

    public void write(String title, String body){
        tasks.add(new Task(title, body));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getPages() {
        return tasks;
    }

    public void save() {
        File userData = new File("user.txt");
        try(PrintWriter writer = new PrintWriter(new FileWriter(userData))) {
            writer.println(this.name);
            writer.println(this.tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

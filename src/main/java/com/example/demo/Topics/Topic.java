package com.example.demo.Topics;

public class Topic {
    //this is the entity class

    //topic class ATTRIBUTES
    String id,name, description;

    //GETTERS AND SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public Topic() {
        //default constructor
    }

    public Topic(String id, String name, String description) {
        //PARAMERIZED constructor
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

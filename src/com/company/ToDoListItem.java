package com.company;

public class ToDoListItem {

    private String description;
    private String state;


    public ToDoListItem(String description, String state){
        this.description = description;
        this.state = state;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }


}

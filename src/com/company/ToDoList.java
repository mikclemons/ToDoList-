package com.company;

public class ToDoList {

    private ToDoListItem[] toDoListItems = new ToDoListItem[3];

    public void addItem(ToDoListItem item){
        for(int i = 0; i < toDoListItems.length; i ++ ){
            if(toDoListItems[i] == null){
                toDoListItems[i] = item;
                break;
            }
        }
    }

    public void deleteItem(){

    }

    public void editItem(){

    }

    public ToDoListItem getItems(){

    }

    public ToDoListItem getItemsByState(){

    }
}

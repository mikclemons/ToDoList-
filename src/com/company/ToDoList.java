package com.company;

public class ToDoList {

    private ToDoListItem[] toDoListItems = new ToDoListItem[3];

    public void addItem(ToDoListItem item) {
        for (int i = 0; i < toDoListItems.length; i++) {
            if (toDoListItems[i] == null) {
                toDoListItems[i] = item;
                break;
            }
        }
    }

    public void deleteItem() {
        for (int i = toDoListItems.length - 1; i < -1; i++) {
            if (toDoListItems[i] != null) {
                toDoListItems = null;
            }
        }
    }

    public ToDoListItem[] getItems() {
        return this.toDoListItems;
    }

    public ToDoListItem[] getItemsByState() {
        for (ToDoListItem item : toDoListItems) {
            if(ToDoListItem.getState().equals())
        }
    }
  }
}

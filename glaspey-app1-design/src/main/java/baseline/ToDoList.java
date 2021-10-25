/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to create To-Do List objects to store lists of items.

package baseline;

import javafx.collections.ObservableList;

import java.util.List;

public class ToDoList {

    // create instance variables

    // create an observable array list to store the items
    // note: the list will be maxed at 256 values
    private ObservableList<ItemCell> list;

    // create list to store items
    private List<ItemCell> listOfItems;

    // create a title for the list
    private String title;

    // initialize the list
    public ToDoList(String title) {
        // initialize the title

        // initialize the list using FXCollections.observableArrayList()
    }

    // create method to get the title
    public String getTitle() {
        // this method was implemented to test the GUI
        return title;
    }

    // create method to set the title
    public void setTitle(String title) {
        // set this.title to the new title
    }

    // create method to get the list
    public ObservableList<ItemCell> getList() {
        // return the list
        return null;
    }

    // create method to remove a value from the list
    public void removeItemFromList(int i) {
        // remove "i" index slot from the list
    }

    // create method to add a new item to the list
    // however, it will refuse to add a new item if the list size is 256
    public void addItemToList(ItemCell item) {
        // check if the size of the list is 256
            // if size is 256, do not add new value
            // if size is less than 256, add a new item to the top of the list
            // note: values are blank until set by user
    }

    // create method to determine if the name of an item is unique compared to the other values in the list
    private boolean isUnique(String name) {
        // loop through list
        // if name.equals( name of item at this index)
            // prompt user that this is not a unique name
            // return false
        // if the loop completes, return true
        return false;
    }
}

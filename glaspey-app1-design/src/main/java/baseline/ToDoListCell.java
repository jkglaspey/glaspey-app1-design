/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to override the default text view for to-do lists in ListViews.
// Note: Since this is only modifying a control, it does not need to be tested.

package baseline;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ToDoListCell implements Callback<ListView<ToDoList>, ListCell<ToDoList>> {

    // override the cell call
    @Override
    public ListCell<ToDoList> call(ListView<ToDoList> param) {
        return new ListCell<>(){

            // override the item display method
            @Override
            public void updateItem(ToDoList list, boolean empty) {
                // necessary to display correct result
                super.updateItem(list,empty);

                // empty case check
                if(empty || list == null) {
                    setText(null);
                }

                // display title instead of object
                else {
                    setText(list.getTitle());
                }
            }
        };
    }
}

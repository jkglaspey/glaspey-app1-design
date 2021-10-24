/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to manage the embedded GUI program which can load in To-Do Lists from a file.

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoadFileController {

    @FXML
    private Button button;

    @FXML
    private TextField textPane;

    @FXML
    void loadLists(ActionEvent event) {
        // assign text from textPane to new String
        // try to create a Scanner at location
        // if not, throw exception
        // if found:
            // loop through file
            // for each list found such that current list size + 1 is not > 256,
                // create new list
                // use number printed on next line to loop through each item
                // for numOfItems:
                    // add a new item
                    // set description to next line
                    // set due date to next line
                    // set completion status to next line
            // add list to current list of lists
            // if list size > 256, tell user that not all lists could be imported
            // if list size <= 256, tell user lists were imported successfully
        // close Scanner
    }
}

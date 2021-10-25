/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to manage the embedded GUI program which can save To-Do Lists to a file.

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SaveFileController {

    @FXML
    private Button button;

    @FXML
    private TextField textPane;

    // trigger save method via text field
    @FXML
    void saveLists(ActionEvent event) {
        save(textPane.getText());
    }

    // attempt to save the currently selected lists to a file
    private void save(String path) {
        // try:
        // create new File using text from textPane
        // create .txt file at File object
        // create new Formatter to this File
        // catch exceptions with user permissions and pre-existing file
        // create new ObservableList using selected values (ctrl click) of lists
        // if size is 0, terminate
        // for each list:
        // write title to file
        // write total size of item list to next line
        // for size of item list:
        // write description to new line
        // write due date to new line
        // write completion status to new line
        // close Formatter
    }
}

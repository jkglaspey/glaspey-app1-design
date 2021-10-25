/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to pop up a window telling the user that their input was invalid.
// Note: Since this class only manages a popup, we do not need to test it.

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LessThan3CharactersController {

    // button which closes popup
    @FXML
    private Button button;

    // method for closing popup
    @FXML
    void closePopup(ActionEvent event) {
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }

}
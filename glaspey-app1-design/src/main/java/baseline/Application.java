/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to initialize the GUI and run the application.
// Note: Since it calls the GUI, it does not require unit testing

package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Declare parent FXML
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene.fxml")));

        // Set the scene and apply style
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Initialize the GUI
        stage.setTitle("To-Do List Manager");
        stage.setScene(scene);
        stage.show();
    }

    // Launch the GUI
    public static void main(String[] args) {
        launch(args);
    }

}
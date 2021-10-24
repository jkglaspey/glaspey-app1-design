/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to manage the main GUI program.

package baseline;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SceneController {

    // text representing item description
    @FXML
    private TextField descriptionTextField;

    // calendar object representing due date
    @FXML
    private DatePicker dueDateDatePicker;

    // list representing the to-do lists
    @FXML
    private ListView<ToDoList> leftListView;

    // list of to-do lists being displayed to the user
    @FXML
    private final ObservableList<ToDoList> list = FXCollections.observableArrayList();

    // pane allowing the user to scroll down to view more to-do lists if need be
    @FXML
    private ScrollPane leftScrollPane;

    // menu group representing overall operations on To-Do lists
    @FXML
    private Menu menuActions;

    // menu button representing deleting selected to-do lists
    @FXML
    private MenuItem menuActionsDeleteLists;

    // menu button representing deleting selected to-do lists
    @FXML
    private MenuItem menuActionsDeleteItems;

    // menu button representing creating a new to-do list
    @FXML
    private MenuItem menuActionsNewList;

    // menu group representing file reading and writing commands
    @FXML
    private Menu menuFile;

    // menu button which will prompt a new GUI window for the user to import saved lists
    @FXML
    private MenuItem menuFileLoadList;

    // menu button which will prompt a new GUI window for the user to save multiple lists to a .txt file
    @FXML
    private MenuItem menuFileSaveList;

    // menu group representing the view of items on a to-do list
    @FXML
    private Menu menuView;

    // menu button representing the view of all items in a list
    @FXML
    private MenuItem menuViewAll;

    // menu button representing the view of only the complete items in a list
    @FXML
    private MenuItem menuViewComplete;

    // menu button representing the view of only the complete items in a list
    @FXML
    private MenuItem menuViewIncomplete;

    // button which adds a new item to the list of items
    @FXML
    private Button newItemButton;

    // list representing the items in a to-do list
    @FXML
    private ListView<ItemCell> rightListView;

    // lists which represent the current viewed items
    @FXML
    private ObservableList<ItemCell> allItems = FXCollections.observableArrayList();    // all items (inventory)
    @FXML
    private ObservableList<ItemCell> statusItems = FXCollections.observableArrayList(); // filtered items

    // pane allowing the user to scroll down to view more items if need be
    @FXML
    private ScrollPane rightScrollPane;

    // text field representing the title of the to-do list
    @FXML
    private TextField rightTitleTextField;

    // drop-down button representing the status of completion of the item
    @FXML
    private MenuButton statusButton;

    // button representing a complete item
    @FXML
    private MenuItem statusComplete;

    // button representing an incomplete item
    @FXML
    private MenuItem statusIncomplete;

    // initialize the controller and values
    public void initialize() {

        // add an initial blank to-do list with a blank item

        // set the lists to be visible
        leftListView.setItems(list);
        rightListView.setItems(allItems);

        // set the lists to allow for multiple selection
        leftListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        rightListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // when new list is selected, show its properties in the other pane
        leftListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->

            // set the right pane to the new list of items
            rightListView.setItems(newValue.getList())
        );

        // when new item is selected, update values in the bottom options
        rightListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            descriptionTextField.setText(newValue.getDescription());            // set description
            dueDateDatePicker.setValue(LocalDate.parse(newValue.getDueDate())); // set date

            // we do not need to set the status since it is carried over with the ItemCell
        });
    }

    // method that adds an item to the item list of a to-do list
    @FXML
    void addItemToList(ActionEvent event) {
        // check if the list size is 256
        // if size is too big: use method call GUI to call "moreThan256Objects.fxml"
        // otherwise, add new blank ItemCell to list
    }

    // method that changes the title of a previously existing to-do list
    @FXML
    void changeTitle(ActionEvent event) {
        // verify the size of the title is at least 3 characters
        // if the size is too small, use method callGUI to call "lessThan3Characters.fxml"
        // otherwise get the current to-do list and set its name to value in text pane
    }

    // method that creates a new to-do list
    @FXML
    void createList(ActionEvent event) {
        // check if the total number of lists is 256
        // if size is too big, use method callGUI to call "moreThan256Objects.fxml"
        // otherwise, add new blank to-do list to the lists
    }

    // method that deletes selected items
    @FXML
    void deleteItems(ActionEvent event) {
        // create new List using selected values (ctrl click) of lists
        // for each list, utilize arraylist.remove() to remove that value
        // if the size of the observable array is 0, create a new item in the to-do list
    }

    // method that presents a popup pane to load in new lists
    @FXML
    void loadLists(ActionEvent event) {
        callGUI("loadFile.fxml");
    }

    // method that presents a popup pane to save selected lists
    // note: the user can select multiple lists using ctrl
    @FXML
    void saveLists(ActionEvent event) {
        callGUI("saveFile.fxml");
    }

    // method that changes the current item's due date
    // note: the string is presented through a DatePicker, so the string is formatted correctly
    @FXML
    void setDate(KeyEvent event) {
        // change the due date of the current item to the value read in from the DatePicker action
    }

    // method that changes the current item's description
    @FXML
    void setDescription(ActionEvent event) {
        // verify the new description is at least 3 characters
        // if not, use method callGUI() to call "lessThan3Characters.fxml"
        // otherwise set the current item's name to value in text pane
    }

    // method that changes the status of the event to complete
    @FXML
    void setStatusToComplete(ActionEvent event) {
        // if the status is already complete, break
        // otherwise:
            // set status label to "Complete"
            // change status color to green using setTextFill(Color.web(#hex value))
    }

    // method that changes the status of the event to incomplete
    @FXML
    void setStatusToIncomplete(ActionEvent event) {
        // if the status is already incomplete, break
        // otherwise:
        // set status label to "Incomplete"
        // change status color to red using setTextFill(Color.web(#hex value))
    }

    // method that changes the scroll pane to display all items
    @FXML
    void viewAllItems(ActionEvent event) {
        // set rightListView to allItems
    }

    // method that changes the scroll pane to display only complete items
    @FXML
    void viewCompleteItems(ActionEvent event) {
        // empty statusItems
        // loop through allItems list
        // if item status is complete, add it to list
        // set rightListView to statusItems
    }

    // method that changes the scroll pane to display only incomplete items
    @FXML
    void viewIncompleteItems(ActionEvent event) {
        // empty statusItems
        // loop through allItems list
        // if item status is incomplete, add it to list
        // set rightListView to statusItems
    }

    // method that deletes lists from the list of to-do lists
    @FXML
    void deleteLists(ActionEvent event) {
        // create new List using selected values (ctrl click) of lists
        // for each list, utilize arraylist.remove() to remove that value
        // if the size of the observable array is 0, create a new to-do list
    }

    // method that calls new GUI
    void callGUI(String fxml) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch(IOException e) {
            System.err.printf("Error calling GUI: %s%n",fxml);
        }
    }
}

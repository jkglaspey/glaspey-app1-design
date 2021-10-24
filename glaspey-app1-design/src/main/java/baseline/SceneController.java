/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class SceneController {

    @FXML
    private TextField descriptionTextField;

    @FXML
    private DatePicker dueDateDatePicker;

    @FXML
    private ListView<ToDoList> leftListView;

    @FXML
    private final ObservableList<ToDoList> list = FXCollections.observableArrayList();

    @FXML
    private ScrollPane leftScrollPane;

    @FXML
    private Menu menuActions;

    @FXML
    private MenuItem menuActionsDeleteLists;

    @FXML
    private MenuItem menuActionsNewList;

    @FXML
    private Menu menuFile;

    @FXML
    private MenuItem menuFileLoadList;

    @FXML
    private MenuItem menuFileSaveList;

    @FXML
    private Menu menuView;

    @FXML
    private MenuItem menuViewAll;

    @FXML
    private MenuItem menuViewComplete;

    @FXML
    private MenuItem menuViewIncomplete;

    @FXML
    private Button newItemButton;

    @FXML
    private ListView<Item> rightListView;

    @FXML
    private final ObservableList<Item> items = FXCollections.observableArrayList();

    @FXML
    private ScrollPane rightScrollPane;

    @FXML
    private TextField rightTitleTextField;

    @FXML
    private MenuButton statusButton;

    @FXML
    private MenuItem statusComplete;

    @FXML
    private MenuItem statusIncomplete;

    @FXML
    void addItemToList(ActionEvent event) {

    }

    @FXML
    void changeTitle(ActionEvent event) {

    }

    @FXML
    void createList(ActionEvent event) {

    }

    @FXML
    void loadLists(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loadFile.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void saveLists(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("saveFile.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void setDate(KeyEvent event) {

    }

    @FXML
    void setDescription(ActionEvent event) {

    }

    @FXML
    void setStatusToComplete(ActionEvent event) {

    }

    @FXML
    void setStatusToIncomplete(ActionEvent event) {

    }

    @FXML
    void viewAllItems(ActionEvent event) {

    }

    @FXML
    void viewCompleteItems(ActionEvent event) {

    }

    @FXML
    void viewIncompleteItems(ActionEvent event) {

    }

}

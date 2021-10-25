/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SceneControllerTest {

    // create a to-do list with 2 items for testing actions
    ToDoList list;
    @BeforeEach
    void init_ToDoList() {
        list = new ToDoList("Test");
        list.addItemToList(new ItemCell());
        list.addItemToList(new ItemCell());
    }


    //  ----- GUI tests ----- //

    @Test
    void addItemToList() {
        // Trigger GUI "Add Item" button
        // Assert no exception was thrown
        // Assert the item list now is 1 larger
    }

    @Test
    void addItemToListButThereIsTooManyItems() {
        // Trigger GUI "Add Item" button
        // Assert that "MoreThan256ObjectsController" scene was opened
    }

    @Test
    void changeTitle() {
        // Trigger the title change with the text field
        // Assert no exception was thrown
        // Assert the new title is set with getTitle() method of ToDoList class
    }

    @Test
    void changeTitleButSizeTooSmall() {
        // Trigger the title change with the text field
        // Assert that "LessThan3CharactersController" scene was created
    }

    @Test
    void createList() {
        // Trigger the create list menu button
        // Assert no exception was thrown
        // Assert the list of ToDoLists now is 1 larger
    }

    @Test
    void createListButThereIsTooManyLists() {
        // Trigger the create list menu button
        // Assert that "MoreThan256ObjectsController" scene was opened
    }

    @Test
    void deleteItem() {
        // Trigger delete items menu button with 1 item selected
        // Assert no exception was thrown
        // Assert the list of items is now 1 smaller
    }

    @Test
    void deleteItems() {
        // Trigger delete items menu button with 2 items selected
        // Assert no exception was thrown
        // Assert the list of items is now 2 smaller
    }

    @Test
    void deleteAllItems() {
        // Trigger delete items menu button with all items selected
        // Assert no exception was thrown
        // Assert the list of items is now size 0
    }

    @Test
    void loadLists() {
        // Trigger load lists menu button
        // Assert no exception was thrown
        // Logic of this method is handled in different test case
    }

    @Test
    void saveLists() {
        // Trigger save lists menu button
        // Assert no exception was thrown
        // Logic of this method is handled in different test case
    }

    @Test
    void setDate() {
        // Trigger new date selection on the DatePicker
        // Assert no exception was thrown
        // Assert that the String passed to the ItemCell is a matching String
    }

    @Test
    void setDescription() {
        // Trigger new description from text pane
        // Get text pane
        // Assert no exception was thrown
        // Assert that the String passed to the ItemCell is a matching String
    }

    @Test
    void setDescriptionButSizeTooSmall() {
        // Trigger new description from text pane
        // Get text pane
        // Assert that "LessThan3CharactersController" scene was opened
    }

    @Test
    void setStatusToComplete() {
        // Trigger "Complete" button
        // Assert no exception was thrown
        // Assert that the String passed to the ItemCell is "Complete"
    }

    @Test
    void setStatusToIncomplete() {
        // Trigger "Incomplete" button
        // Assert no exception was thrown
        // Assert that the String passed to the ItemCell is "Incomplete"
    }

    @Test
    void viewAllItems() {
        // Trigger "view all items" menu button
        // Assert no exception was thrown
        // Loop through ListView
        // Assert every value in ListView matches every value in AllItems observableList
    }

    @Test
    void viewCompleteItems() {
        // Trigger "view complete items" menu button
        // Assert no exception was thrown
        // Loop through StatusItems
        // Assert every item in list is set to "Complete"
        // Loop through ListView
        // Assert every value in ListView matches every value in StatusItems observableList
    }

    @Test
    void viewIncompleteItems() {
        // Trigger "view incomplete items" menu button
        // Assert no exception was thrown
        // Loop through StatusItems
        // Assert every item in list is set to "Incomplete"
        // Loop through ListView
        // Assert every value in ListView matches every value in StatusItems observableList
    }

    @Test
    void deleteList() {
        // Trigger delete lists menu button with 1 list selected
        // Assert no exception was thrown
        // Assert the number of lists is 1 less
    }

    @Test
    void deleteLists() {
        // Trigger delete lists menu button with 2 list selected
        // Assert no exception was thrown
        // Assert the number of lists is 2 less
    }

    @Test
    void deleteAllLists() {
        // Trigger delete lists menu button with all lists selected
        // Assert no exception was thrown
        // Assert the number of lists is 0
    }
}
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    // create class list for testing methods
    ToDoList test;
    @BeforeEach
    void init_ToDoList() {
        test = new ToDoList("Test");
    }

    // test that the title is returned correctly
    //@Test
    //void getTitle() {
    //    assertEquals("Test",test.getTitle());
    //}

    // test that setting the title changes the name correctly
    //@Test
    //void setTitle() {
    //    test.setTitle("Different String");
    //    assertEquals("Different String",test.getTitle());
    //}

    // test that this method retrieves a list of items
    //@Test
    //void getList() {
    //    assertTrue(test.getList() instanceof List<ItemCell>);
    //}

    // test that this method removes an item from the list
    //@Test
    //void removeItemFromList() {
        // add 3 items to the list
    //    test.addItemToList(new ItemCell());
    //    test.addItemToList(new ItemCell());
    //    test.addItemToList(new ItemCell());

        // remove one
    //    test.removeItemFromList(0);

        // assert size is 2
    //    assertEquals(2,test.getList().size());
    //}

    // test that this method adds items to a list
    //@Test
    //void addItemToList() {
        // add 2 items to the list
    //    test.addItemToList(new ItemCell());
    //    test.addItemToList(new ItemCell());

        // assert size is 2
    //    assertEquals(2,test.getList().size());
    //}
}
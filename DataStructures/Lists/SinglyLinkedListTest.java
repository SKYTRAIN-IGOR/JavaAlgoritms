import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    SinglyLinkedList list;

    @Before
    public void setUp(){
        list = new SinglyLinkedList();
    }

    @Test
    public void headMustNotNullAfterInsertingOneNode(){
        //When
        list.insertHead(10);
        //Then
        assertNotNull(list.getHead());
    }

    @Test
    public void headMustNullAfterDeletion(){

        //When
        list.insertHead(10);
        list.delete(10);

        //Then
        assertNull(list.getHead());
    }

    @Test
    public void insertAtASpecificPosition(){
        //When
        list.insertHead(10);
        list.insertHead(20);
        list.insertAtPosition(30 , 2);

        //Then
        assertEquals(30 , list.getHead().getNextNodeReference().getValue());
    }

    @Test
    public void deletionOfHeadNode(){
        list.insertHead(10);
        list.insertAtPosition(30,1);
        list.insertAtPosition(20,2);

        list.delete(20);

        assertEquals(30, list.getHead().getNextNodeReference().getValue());
    }

    @Test
    public void deletionOfEnd(){
        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(30);

        list.delete(30);

        assertEquals(null , list.getHead().getNextNodeReference().getNextNodeReference());
    }
    @Test
    public void deletionAtASpecificPosition(){
        //When
        list.insertHead(10);
        list.insertHead(20);
        list.insertAtPosition(30 , 2);
        list.delete(30);
        //Then
        assertEquals(10, list.getHead().getNextNodeReference().getValue());
    }

    @Test
    public void shouldReturnEmptyIfNoNodePresent(){
        assertTrue(list.isEmpty());
    }
}
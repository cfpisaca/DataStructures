package lab7;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SimpleLinkedListTest {


    private SimpleLinkedList abcList;

    @Before
    public void setUp() throws Exception
    {
        abcList = new SimpleLinkedList();
        abcList.addAtStart("C");
        abcList.addAtStart("B");
        abcList.addAtStart("A");// Now contains ["A", "B", "C"]
    }

    // TESTS FOR contains
//     @Test
//     public void testContainsFalseEmptyList()
//     {
//         SimpleLinkedList list = new SimpleLinkedList();
//         assertFalse(list.contains("A"));
//     }

    @Test
    public void testContainsTrueAtStart()
    {
        assertTrue(abcList.contains("A"));
    }

    @Test
    public void testContainsTrueInMiddle()
    {
        assertTrue(abcList.contains("B"));
    }

    @Test
    public void testContainsTrueAtEnd()
    {
        assertTrue(abcList.contains("C"));
    }

    @Test
    public void testContainsFalse()
    {
        assertFalse(abcList.contains("Q"));
    }

    // TESTS FOR addAtEnd
    @Test
    public void testAddAtEndIncrementsSize()
    {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addAtEnd("A");
        assertEquals(1, list.size());
        list.addAtEnd("B");
        assertEquals(2, list.size());
    }

    @Test
    public void testAddAtEndEmptyList()
    {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addAtEnd("A");
        assertEquals("A", list.get(0));
    }

    @Test
    public void testAddAtEndNonEmptyList()
    {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addAtStart("Y");
        list.addAtStart("X");
        list.addAtEnd("Z");
        assertEquals("X", list.get(0));
        assertEquals("Y", list.get(1));
        assertEquals("Z", list.get(2));
    }
}

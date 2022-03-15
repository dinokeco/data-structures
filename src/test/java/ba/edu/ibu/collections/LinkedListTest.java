package ba.edu.ibu.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void testAddToFront() {
        LinkedList<Integer> list = new LinkedList<>();

        list.addToFront(1);
        list.addToFront(2);

        int count = 0;
        int[] numbers = new int[2];

        for (Integer i : list) {
            numbers[count] = i;
            count++;
        }

        assertEquals(2, numbers[0]);
        assertEquals(1, numbers[1]);
    }

    @Test
    public void testAddToRear() {
        LinkedList<Integer> list = new LinkedList<>();

        list.addToRear(1);
        list.addToRear(2);

        int count = 0;
        int[] numbers = new int[2];

        for (Integer i : list) {
            numbers[count] = i;
            count++;
        }

        assertEquals(1, numbers[0]);
        assertEquals(2, numbers[1]);
    }

    @Test
    public void testRemoveFromFront() {
        LinkedList<String> list = new LinkedList<>();

        list.addToRear("apples");
        list.addToRear("grapes");

        list.removeFromFront();

        assertEquals("grapes", list.get(0));
    }

    @Test
    public void testRemoveFromRear() {
        LinkedList<String> list = new LinkedList<>();

        list.addToRear("apples");
        list.addToRear("grapes");

        list.removeFromRear();

        assertEquals("apples", list.get(0));
    }

    @Test
    public void testCount() {
        LinkedList<String> list = new LinkedList<>();

        list.addToRear("apples");
        list.addToRear("grapes");
        list.addToRear("bananas");
        list.addToFront("oranges");

        System.out.println("The current size of the list is: " + list.count());

        assertEquals(4, list.count());

        list.removeFromRear();
        list.removeFromFront();

        System.out.println("After removing 2 items from the list, the size is: " + list.count());

        assertEquals(2, list.count());
    }
}
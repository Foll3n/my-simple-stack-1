package deqo.PFOU.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;

public class SimpleStackTest {

    private SimpleStack stack;

    @Before
    public void setUp() throws Exception {
        this.stack = new SimpleStack();
    }

    @Test
    public void isEmpty() {
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(0, stack.getSize());
    }

    @Test
    public void push() {
        Item i = new Item(3, "Item");
        stack.push(i);
        assertSame(i, stack.peek());
        assertFalse("La pile n'est pas vide", stack.isEmpty());
        assertEquals(1, stack.getSize());
    }

    @Test (expected = EmptyStackException.class)
    public void peek() {
        stack.peek();
    }

    @Test
    public void pop() {
        Item i = new Item(3, "Item");
        stack.push(i);
        Item i2 = new Item(5, "Item2");
        stack.push(i2);
        assertSame(i2, stack.pop());
    }
}
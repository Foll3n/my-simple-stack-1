package deqo.PFOU.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() throws Exception {
        this.item = new Item(5, "Value");
    }

    @Test
    public void getAmount() {
        assertEquals(5, item.getAmount());
    }

    @Test
    public void getValue() {
        assertEquals("Value", item.getValue());
    }

    @Test
    public void setAmount() {
        item.setAmount(4);
        assertEquals(4, item.getAmount());
    }

    @Test
    public void setValue() {
        item.setValue("hola");
        assertEquals("hola", item.getValue());
    }
}
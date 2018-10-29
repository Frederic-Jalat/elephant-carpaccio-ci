package fr.iut;

import fr.iut.Cart;
import fr.iut.Item;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestHtPrice {

    @Test
    public void testItemConstructor() {
        final Item i = new Item("Counter strike", 60.0d);

        assertEquals("Counter strike", i.getLabel());
        assertTrue(60.0d == i.getPrice());
    }

    @Test
    public void testAddProduct() {
        final Item i = new Item("Counter strike", 60.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);

        assertEquals(1, c.countProducts());
    }

    @Test
    public void testHtPrice() {
        final Item i = new Item("Counter strike", 60.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 20.0d), 5);

        assertTrue(220.0d == c.computePrice());

    }
}

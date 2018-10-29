package fr.iut;

import fr.iut.Cart;
import fr.iut.Item;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTtcPriceIs {

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
    public void testTTCPrice() {
        final Item i = new Item("Counter strike", 0.255d*60.0d+60.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 0.255d*20.0d+20.0d), 5);

        assertTrue(276.1d == c.computePrice());

    }
}

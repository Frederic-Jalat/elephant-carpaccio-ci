package fr.iut;

import fr.iut.Cart;
import fr.iut.Item;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTtcPriceDe {

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
        final Item i = new Item("Counter strike", 0.19d*60.0d+60.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 0.19d*20.0d+20.0d), 5);

        assertTrue(261.8d == c.computePrice());

    }
    
    @Test
    public void testTTCPrice1000() {
        final Item i = new Item("Counter strike", 0.19d*200.0d+200.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 0.19d*200.0d+200.0d), 5);

        assertTrue(1616.02d == c.computePrice());

    }
    
    @Test
    public void testTTCPrice5000() {
        final Item i = new Item("Counter strike", 0.19d*1500.0d+1500.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 0.19d*500.0d+500.0d), 5);

        assertTrue(6217.75d == c.computePrice());

    }
    
    @Test
    public void testTTCPrice7000() {
        final Item i = new Item("Counter strike", 0.19d*2000.0d+2000.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 0.19d*500.0d+500.0d), 5);

        assertTrue(7193.55d == c.computePrice());

    }
    
    @Test
    public void testTTCPrice10000() {
        final Item i = new Item("Counter strike", 0.19d*20000.0d+20000.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 0.19d*50.0d+50.0d), 5);

        assertTrue(43107.75d == c.computePrice());

    }
    
    @Test
    public void testTTCPrice50000() {
        final Item i = new Item("Counter strike", 0.19d*20000.0d+20000.0d);

        final Cart c = new Cart();
        c.addProduct(i, 2);
        c.addProduct(new Item("Tomates", 0.19d*5000.0d+5000.0d), 5);

        assertTrue(65747.5d == c.computePrice());

    }
    
}
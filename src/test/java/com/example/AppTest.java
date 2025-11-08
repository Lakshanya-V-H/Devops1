package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAppMessage() {
        String message = "Hello from Maven Regression Test!";
        assertEquals("Hello from Maven Regression Test!", message);
    }

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        assertEquals(8, a + b, "Addition test failed");
    }
}

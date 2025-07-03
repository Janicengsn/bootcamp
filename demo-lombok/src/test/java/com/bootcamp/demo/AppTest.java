package com.bootcamp.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    
    @Test
    void testApp() {
        assertEquals(1, 1);
        assertEquals(1, new Person().add(1, 1));
        assertEquals(6, new Person().add(3, 2));
  }
}

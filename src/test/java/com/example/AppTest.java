package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest { // public modifier removed

    @Test
    void testAdd() { // public modifier removed
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
}

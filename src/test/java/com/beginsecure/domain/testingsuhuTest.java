package com.beginsecure.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testingsuhuTest {

    @Test
    void testPanas() {
        assertEquals("Panas", testingsuhu.kategoriSuhu(35));
        assertEquals("Panas", testingsuhu.kategoriSuhu(30));
    }

    @Test
    void testNormal() {
        assertEquals("Normal", testingsuhu.kategoriSuhu(29.9));
        assertEquals("Normal", testingsuhu.kategoriSuhu(20));
    }

    @Test
    void testDingin() {
        assertEquals("Dingin", testingsuhu.kategoriSuhu(19.9));
        assertEquals("Dingin", testingsuhu.kategoriSuhu(0));
        assertEquals("Dingin", testingsuhu.kategoriSuhu(-5));
    }

    @Test
    void testBoundaryValues() {
        assertEquals("Panas", testingsuhu.kategoriSuhu(30));
        assertEquals("Normal", testingsuhu.kategoriSuhu(20));
        assertEquals("Normal", testingsuhu.kategoriSuhu(29.999));
        assertEquals("Dingin", testingsuhu.kategoriSuhu(19.999));
    }
}

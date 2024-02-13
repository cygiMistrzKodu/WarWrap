package org.letning.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class WordWrapTest {

    private void assertWrapped(String s, int width, String expected) {
        assertEquals(expected, wrap(s, width));
    }

    @Test
    public void testWrap() {
        assertWrapped("", 1, "");
        assertWrapped("x", 1, "x");
        assertWrapped("xx", 1, "x\nx");
        assertWrapped("xx", 2, "xx");
        assertWrapped("xxx", 1,"x\nx\nx");
        assertWrapped("xxx", 2,"xx\nx");
        assertWrapped("xxx", 3,"xxx");
        assertWrapped("x x", 1,"x\nx");
        assertWrapped("x x", 2,"x\nx");


    }

    private String wrap(String s, int w) {
        if (w >= s.length()) {
            return s;
        } else {
            return s.substring(0, w).trim() + "\n" + wrap(s.substring(w).trim(),w);
        }

    }
}

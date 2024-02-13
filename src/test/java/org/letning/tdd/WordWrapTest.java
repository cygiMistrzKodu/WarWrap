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


    }

    private String wrap(String s, int w) {
        if (w >= s.length()) {
            return s;
        } else {
            return s.substring(0, w) + "\n" + s.substring(w);
        }

    }
}

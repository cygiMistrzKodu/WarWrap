package org.letning.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class WordWrapTest {

    private void assertWrapped(String s, int width, String expected) {
        assertEquals(expected, wrap(s, width));
    }

    @Test
    public void testWrap() {
        assertWrapped("Wołam",7,"Wołam");
        assertWrapped("Wołam, ja",7,"Wołam,\nja");

    }

    private String wrap(String s, int w) {
        return s.replace(" ", "\n");
    }
}

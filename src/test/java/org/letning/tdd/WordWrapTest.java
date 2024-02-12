package org.letning.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WordWrapTest {

    @Test
    public void testWrap() {
        assertEquals("Wołam", wrap("Wołam",7));
        assertEquals("Wołam,\nja",wrap("Wołam, ja",7));

    }

    private String wrap(String s, int w) {
        return s.replace(" ","\n");
    }
}

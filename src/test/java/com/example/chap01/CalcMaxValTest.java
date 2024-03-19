package com.example.chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcMaxValTest {

    @Test
    void max() {
        int result = CalcMaxVal.findMax(3, 4, 5);
        assertEquals(5, result);
        assertEquals(9, CalcMaxVal.findMax(6, 8, 9));
        assertEquals(6, CalcMaxVal.findMax(6, 6, 6));
        assertEquals(8, CalcMaxVal.findMax(8, 7, 8));
    }

}
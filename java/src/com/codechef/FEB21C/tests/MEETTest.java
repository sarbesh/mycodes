package com.codechef.FEB21C.tests;

import com.codechef.FEB21C.MEET;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MEETTest {


    @Test
    void test12AM() throws Exception {
        assertEquals("00:00",MEET.format("12:00 AM"));
    }

    @Test
    void test1142PM() {
        assertEquals("23:42",MEET.format("11:42 PM"));
    }

    @Test
    void test1159AM() {
        assertEquals("11:59",MEET.format("11:59 AM"));
    }
}
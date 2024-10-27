package org.example;
import org.example.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzbuzz() {
        int n = 1;
        List<String> list = Main.fizzbuzz(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");

        assertEquals(expected, list);
    }

    @Test
    void reversePrint() {
        String expected = "llatsni ekam";

        assertEquals(expected, Main.reversePrint("make install"));
    }

    @Test
    void solveEquation() {
        List<String> list = Main.solveEquation(1, -2,-3);
        List<String> expected = List.of(
                "3.0",
                "-1.0"
        );
        assertEquals(expected, list);
    }

    @Test
    void summary() {
        double res = Main.summary();
        double expected = 0.6101121094474383;

        assertEquals(expected, res);
    }

    @Test
    void palindrom() {
        boolean list1 = Main.palindrom("tot");
        boolean list2 = Main.palindrom("tor");

        assertTrue(list1);
        assertFalse(list2);
    }
}
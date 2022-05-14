package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivSevenTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new long[] {7, 2}, DivSeven.seven(1603));
        assertArrayEquals(new long[] {35, 1}, DivSeven.seven(371));
        assertArrayEquals(new long[] {42, 1}, DivSeven.seven(483));
    }
}
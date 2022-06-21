package kyu3;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
        @Test
        public void test_0_10() {
            test(0, 10, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        }

        @Test
        public void test_10_10() {
            test(10, 10, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71);
        }

    @Test
    public void test_0_10_000_000() {
        test(1_000_000, 10, 15485867, 15485917, 15485927, 15485933, 15485941, 15485959, 15485989, 15485993, 15486013, 15486041);
    }

    private void test(int skip, int limit, int... expect) {
        int[] found = Prime.stream(16_000_000).skip(skip).limit(limit).toArray();
        assertArrayEquals(expect, found);
    }

}
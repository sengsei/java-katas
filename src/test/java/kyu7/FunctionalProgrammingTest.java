package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalProgrammingTest {
    @Test
    public void testJohnSmith()  {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue(FunctionalProgramming.f.apply(jSmith), "John Smith with student number js123 did not return true");

    }

}
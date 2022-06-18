package kyu7.fp;

import kyu7.fp.FunctionalProgrammingPartOne;
import kyu7.fp.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalProgrammingPartOneTest {
    @Test
    public void testJohnSmith()  {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue(FunctionalProgrammingPartOne.f.apply(jSmith), "John Smith with student number js123 did not return true");

    }

}
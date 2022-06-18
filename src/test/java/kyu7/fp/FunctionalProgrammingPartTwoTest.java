package kyu7.fp;

import org.junit.jupiter.api.Test;

import static kyu7.fp.FunctionalProgrammingPartTwo.*;
import static org.junit.jupiter.api.Assertions.*;

class FunctionalProgrammingPartTwoTest {
    @Test
    public void testArea()  {
        Triangle t = new Triangle(5, 10);
        assertEquals(25D, f.applyAsDouble(t), 0.001);
        assertEquals(25D, t.getArea(), 0.001);

    }

}
package kyu7.fp;

import java.util.Objects;
import java.util.function.Function;

public class FunctionalProgrammingPartOne {
    public static Function<Student, Boolean> f = s -> Objects.equals(s.getFullName(), "John Smith") && s.studentNumber.equals("js123");
}

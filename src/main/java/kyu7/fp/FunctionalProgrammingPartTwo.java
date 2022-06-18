package kyu7.fp;


import java.util.function.ToDoubleFunction;

public class FunctionalProgrammingPartTwo {

   public static ToDoubleFunction<Triangle> f = x -> {
       double area = 0.5 * x.base * x.height;
       x.setArea(area);
       return area;
   };




}

package kyu7.fp;


import java.util.function.IntUnaryOperator;


public class AdderFactory {

    public static IntUnaryOperator create(int addTo){
        return e -> e + addTo;
    }
}

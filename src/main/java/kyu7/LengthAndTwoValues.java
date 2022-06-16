package kyu7;

public class LengthAndTwoValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] values = new String[n];
        for (int i = 0; i < n; i++){
            if (isEven(i)){
                values[i] = firstValue;
            } else {
                values[i] = secondValue;
            }
        }
        return values;
    }

    private static boolean isEven(int indexNumber){
        return indexNumber % 2 == 0;
    }

}

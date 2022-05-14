package kyu7;

public class DivSeven {

    public static long[] seven(long m) {
        int counter = 0;
        long[] result = new long[2];

        while (m >= 100) {
            result[0] = helper(m);
            m = result[0];
            counter++;
        }
        result[1] = counter;
        return result;
    }

    private static long helper(long m) {
        String y = String.valueOf(String.valueOf(m).charAt(String.valueOf(m).length()-1));
        String x = String.valueOf(m).substring(0,String.valueOf(m).length()-1);
        return Long.parseLong(x) - (Long.parseLong(y) * 2) ;
    }
}

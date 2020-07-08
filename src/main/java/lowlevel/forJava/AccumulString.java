package lowlevel.forJava;

public class AccumulString {

    public static String accum(String s) {

        String accum = "",accumulated = "";
        for (int i = 0; i < s.length(); i++) {
            StringBuilder inc = new StringBuilder();

            for (int j = 0; j <= i; j++) {
                inc.append(s.charAt(i));
            }
            accum = inc.substring(0, 1).toUpperCase() + inc.substring(1).toLowerCase();

            if (i < s.length() - 1)/*else*/ accum += "-";
            accumulated += accum;
        }
        return accumulated;
    }
}

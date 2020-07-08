package lowlevel.forJava;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        // Do something
//        System.out.println(seconds);
//        seconds =
        double bb =0;
//        if (seconds >= 3600){
            seconds = 5400;
           bb = (seconds/3600);
            System.out.println(bb);
//        }
        String sseconds = "00:00:00";
        return sseconds;
    }
}

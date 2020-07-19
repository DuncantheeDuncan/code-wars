package lowlevel.forJava;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {


        int hr = seconds / 60 / 60;
        int min = seconds / 60 % 60;
        int sec = seconds % 60;


//        System.out.println(String.format("%02d:%02d:%02d",hr,min,sec));


        return String.format("%02d:%02d:%02d", hr, min, sec);


//        float maxSec = 3600;
//        double hour = seconds / maxSec;
//
//        String[] getDec = Double.toString(hour).split("\\.");
//
//        double minutes = Float.parseFloat("0." + getDec[1]) * 60.0;
//        String x = String.valueOf(Math.round(minutes * 100.0) / 100.0);

//
//        int min = (int) minutes;
//        int hr = (int) hour;
//
//        getDec = Float.toString(Float.parseFloat(x)).split("\\.");
//
//        double sec = Math.round(Float.parseFloat("0.".concat(getDec[1]))  * 60.0) / 100.0;
//        getDec = Double.toString(Double.parseDouble(String.valueOf(sec))).split("\\.");
//


//
//        if (seconds < 60){
//            if (seconds == 0){
//                return "00:00:00";
//            }
//            return "00:00:".concat(getDec[1]);
//        }else if (seconds < 3600){
//FIXME test does not pass if i use 90 it gets me 0.3 instead of 30

//            if (min <10){
//
//                if (Integer.parseInt(getDec[1]) < 10){

//                    getDec[1] = "0".concat(getDec[1]);
//
//                }

//                return "00:0".concat(String.valueOf(min))+":".concat(getDec[1]);
//            }
//
//            return "00:".concat(String.valueOf(min))+":".concat(getDec[1]);
//        }else{
//            if (hr <10){
//
//                return "0".concat(String.valueOf(hr))  + ":" + min + ":" + getDec[1];
//            }
//            return time;
//        }

    }
}

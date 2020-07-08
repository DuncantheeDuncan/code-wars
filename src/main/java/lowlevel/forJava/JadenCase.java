package lowlevel.forJava;

public class JadenCase {

    public String toJadenCase(String phrase) {

        String Jadenword ="",concat;

        if(phrase == null | phrase == ""){

            return null;
        }else {
            String[] x = phrase.split(" ");
            for(int i =0; i<x.length;i++){
                concat =  x[i];
                concat = " "+concat.substring(0,1).toUpperCase() + concat.substring(1).toLowerCase();
                Jadenword+=concat;
            }
            return  Jadenword.trim();
        }
    }
}

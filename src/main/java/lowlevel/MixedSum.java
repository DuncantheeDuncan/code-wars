package lowlevel;



import java.util.List;

import static java.lang.Integer.parseInt;

public class MixedSum {


    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {

        int total = 0;
        for (Object i : mixed){total += parseInt(String.valueOf(i));}
        return total;
//        int sum = 0;
//
//        for (Object element : mixed)
//        {
//            if (element instanceof Integer)
//            {
//                sum += (Integer) element;
//            }
//            else if (element instanceof String){
//                sum += Integer.parseInt( (String) element );
//            }
//        }
//        return sum;
    }
}
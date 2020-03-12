package lowlevel;

public class FirstNonConsecutive {

    static Integer find(final int[] array) {
        Integer nonrec = array[0];

        for (int i = 0; i < array.length; i++) {
            if (nonrec == array[i]) {
                nonrec++;
//                if (nonrec == array[array.length - 1]) redundant
//                    return null;
            } else {
                nonrec = array[i];
                return nonrec;
            }
        }
        return null; /*return nonrec*/
    }
}

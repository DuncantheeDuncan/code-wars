package lowlevel;

public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {

// System.out.println(n + " given number");
//        int n = 3;
        int oddnumber = n * 2 - 1;// gets you an odd number
        System.out.println(oddnumber + " odd number");// gives me an odd number!!
        int z = 0;
        int to = 0;
        z = +oddnumber  /**2 -1*/;
        for (int i = 1; i <= n; i++) {
//          int m = + z;
            System.out.println(z);
            z += 2;
            to = to + z;
//          System.out.println(i);
        }


        System.out.println(z + " outside loop");
        System.out.println(to - oddnumber - 1 + " total");
        int xoo = to - oddnumber;

        return xoo - 1;
    }


}
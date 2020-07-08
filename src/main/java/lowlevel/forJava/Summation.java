package lowlevel.forJava;

 class Summation {

     public static int summation(int n) {


         int summup = 0;
         for (int i = 1; i < n; i++) {
             summup += i;
         }
         summup += n;
         System.out.println(summup);
    return summup;

     }
 }
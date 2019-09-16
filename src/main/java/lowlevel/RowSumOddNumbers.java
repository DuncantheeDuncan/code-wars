package lowlevel;

public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {

// System.out.println(n + " given number");
        int givenNumber = 42;
        int oddnumber = givenNumber * 2 -1;// gets you an odd number
        System.out.println(oddnumber + " odd number");// gives me an odd number!!
        int z= 0;
        for (int i = 1;i <=givenNumber;i++){
      z =+ oddnumber *2 -1 + i++;

//     System.out.println(i +  "loop");

        }
        System.out.println(z -1   +  " outside loop");

        return z -1;
    }


}
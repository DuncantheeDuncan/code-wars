package lowlevel;

public class SummingUpArrays {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int totalsum = 0;
       for (int i : arr2){
           totalsum +=i;
       }

       for(int j :arr1){
           totalsum +=j;
       }
       return totalsum;
    }
}

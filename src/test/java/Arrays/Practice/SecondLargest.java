package Arrays.Practice;

public class SecondLargest {


    public static int getThirdLargest(int array[]) {

        int temp;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }


            }


        }

        for(int value:array) {
           // System.out.println(value);
        }

        return array[array.length-3];

    }


    public static void main(String... s) {

        int a[] = {10, 1, 2, 3, 4, 34, 0, 12};

      int third_Largest=getThirdLargest(a);
      System.out.println(third_Largest);

    }


}

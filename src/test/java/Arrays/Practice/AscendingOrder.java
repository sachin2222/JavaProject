package Arrays.Practice;

public class AscendingOrder {


    public static void main(String... s) {

        int a[] = {10, 20, 1, 4, 100, 45, -2, -1, 0};
        int temp = 0;


        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {


                if (a[i] >a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;


                }


            }
        }

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }

    }


}


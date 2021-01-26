package Arrays.Practice;

public class Reverse {

    public static void main(String... s) {

        int a[] = {1, 2, 3, 4, 5};
        int b[]=new int[a.length];


        for (int i = 0; i < a.length; i++) {

            b[i] = a[a.length - 1 - i];

        }


        for (int i = 0; i < b.length; i++) {

            System.out.println(b[i]);
        }

    }


}



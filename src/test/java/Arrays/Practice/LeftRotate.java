package Arrays.Practice;

public class LeftRotate {

    public static void main(String... s) {

        int a[] = {1, 2, 3, 4, 5};
        int temp = a[0];

        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];

            if (i == a.length - 1)
                a[a.length - 1] = temp;


        }


        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }

    }


}

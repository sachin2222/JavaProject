package Arrays.Practice;

public class RightRotate {

    public static void main(String... s) {

        int a[] = {1, 2, 3, 4, 5};
        // {5,1,2,3,4}
        int temp=a[0];


        for (int i = 0; i < a.length; i++) {

            a[i+1]=a[i];

            if(i==0){
                a[0]=a[a.length-1];

            }


        }


        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }

    }


}




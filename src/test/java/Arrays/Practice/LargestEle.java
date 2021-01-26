package Arrays.Practice;

public class LargestEle {


    public static void main(String... s) {

        int a[] = {-1,-2,-3,0,56,78,777,0,-888,1};
        //int max=a[0];

        int min=a[0];

        for (int i = 0; i < a.length; i++) {

            if(a[i]<min){

                min=a[i];
            }


        }

            System.out.println(min);


    }


}



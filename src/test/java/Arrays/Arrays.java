package Arrays;

public class Arrays {

    static int[] getArray() {

        return new int[]{1, 23, 4, 4455, 5};

    }

    public static void main(String... s) {
        int a[];
        a=new int[]{1,2,34,4,5,6,7,8,99,10};


        System.out.println(a.length);

        for (int i : a) {
            System.out.print(i+ " ");


        }

        System.out.println("");
      int array[]=  getArray();

        for(int i:array)
        {
            //System.out.print(i + " ");


        }
        System.out.println("\n");

       String classname= a.getClass().getName();
        //System.out.println(classname);

        // Cloning of the Array

        int copy[]=a.clone();

        for(int c:copy)
        {
            //System.out.print(c+ " ");

        }

        // Copy the Array from Other Array
        int copyTo[]=new int[5];
        System.arraycopy(a,4,copyTo,0,5);

        for(int c:copyTo){

            System.out.print(c+" ");
        }


    }

}

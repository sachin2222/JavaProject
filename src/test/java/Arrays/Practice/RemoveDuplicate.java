package Arrays.Practice;

public class RemoveDuplicate {

    public static void main(String... s) {

        int array[] = {1,1,2,3,2,3,4,1,3,3,3,3,1,2,1,11,1,11,11};

        int array2[] = new int[array.length];
        int frequency = 1;
        int visited = -1;

        int Req[]=new int[array.length];



        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    frequency++;
                    array2[j] = visited;

                }


            }

            if (array2[i] != visited) {
                array2[i] = frequency;


            }
            frequency=1;


        }

        for (int i = 0; i < array2.length; i++) {

            System.out.print(array2[i]+ " ");
            if (array2[i]>=1){

                Req[i]=array[i];
            }



        }

        System.out.println("\n");
        for(int Req_value:Req)
            if(Req_value!=0)
            System.out.print(Req_value+ " ");

    }


}

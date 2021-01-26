package Arrays.Practice;

public class FrequencyCount {

    public static void main(String... s) {

        int array1[] = {1,2,3,4,54,5,5,5,6,6,7,6,77,66,7};
        int frequency = 1;
        int visited=-1;
        int fr[]=new int[array1.length];


        for (int i = 0; i < array1.length; i++) {

            for (int j = i + 1; j < array1.length; j++) {

                if (array1[i] == array1[j]) {
                    frequency++;
                    fr[j]=visited;

                }

            }
            if(fr[i]!=visited)
                fr[i]=frequency;
            frequency=1;

        }

        for(int i=0;i< fr.length;i++) {
            if(fr[i]!=visited && fr[i]==2)
                    System.out.println(array1[i] + "|"+ fr[i]);
                }
        }

    }


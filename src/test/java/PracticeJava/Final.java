package PracticeJava;

public class Final {

    final int a;// Blank Final Variable

    Final(int a) {
        this.a = a;
    }

    void display() {
        System.out.println(a);

    }


    public static void main(String... s) {

        Final f = new Final(10);
        f.display();

    }
}

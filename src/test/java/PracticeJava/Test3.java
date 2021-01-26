package PracticeJava;

public class Test3 extends Test2 {


    int a=30;
    public void display(int a)
    {
        this.a=a;
        System.out.println(this.a);
        System.out.println(super.a);
        super.display();


    }

    Test3()
    {

        super();
    }

    public static void main(String... s) {

        Test2 t2 = new Test3();
        t2.display(1000);

    }


}

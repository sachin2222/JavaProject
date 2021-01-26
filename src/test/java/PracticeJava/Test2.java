package PracticeJava;


public class Test2 extends Test1 {

    int a = 20;

   public  void display(int a) {
       System.out.println("Test2");
       super.display();


    }

    Test2()
    {

       System.out.println("Test2 Constructor Calling");
    }



}

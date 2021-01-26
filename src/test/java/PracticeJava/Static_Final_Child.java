package PracticeJava;

public class Static_Final_Child extends  Static_Final{



    public void display()
    {

        System.out.println("Parent Class Variable: " + super.a);
    }


    public static void main(String args[]){

        System.out.println("Main");
        Static_Final_Child t1= new Static_Final_Child();
        t1.display();


    }


}

package String;

import java.nio.charset.StandardCharsets;

public class StringTest {

    public static void main(String args[]) {


        //int length = s.length();
        //System.out.println(length);

        // char ch=s.charAt(6);
        //System.out.println(ch);

        //int value= s.compareTo("welcome");
        //System.out.println(value);

        // String concat = s.concat(" to World");
        //System.out.println(concat);

        // boolean b= s.contains("wel");
        // System.out.println(b);

        // byte[] ascii=s.getBytes(StandardCharsets.UTF_8);

        //for(int i:ascii)
        // System.out.println(i);

        //char ch[]=new char[s.length()];

        //s.getChars(0,7,ch,0);

        // for(char v:ch){
        // System.out.println(v);


        //String demo[]=s.split("to");
        //String demo[]=s.split("\\s");

        //String demo[]=s.split("to");

        //  String demo[]=s.split("\\s");


        // for(String split:demo){

        //System.out.println(split);


        String s = "  welcome to India  ";
        System.out.println(s);

        //char ch[]= s.toCharArray();

        //for (char c:ch)
        //System.out.print(c);


        String s1 = s.trim();
        System.out.println(s1);

        String substring=s1.substring(0,5);
        System.out.println(substring);


    }
}

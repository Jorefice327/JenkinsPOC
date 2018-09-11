package main.java;

public class ClassA {

    public static void main(String[] args)
    {
        int x = 3;
        System.out.println(helloWorld());
        System.out.println("Using Maven now");
    }

    public static String helloWorld()
    {
        return "Hello World";
    }

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int subtract(int a, int b)
    {
        return a - b;
    }
}

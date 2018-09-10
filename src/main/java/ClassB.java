public class ClassB {

    public static int addAndMultiply(int a, int b, int c)
    {
        return ClassA.add(a, b) * c;
    }

    public static double addAndDivide(int a, int b, double c)
    {
        return ((double) ClassA.add(a, b)) / c;
    }
}

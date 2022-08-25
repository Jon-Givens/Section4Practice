public class TestClass {




    public static void main(String args[]) {
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results

        ComputeMethods tests = new ComputeMethods();

        double test1 = tests.fToC(100.1);
        System.out.println("temp in celcius is: " + test1);

        double test2 = tests.hypotenuse(30, 25);
        System.out.println("Hypotenuse is: " + test2);

        int test3 = tests.roll();
        System.out.println("the sum of the rolls is: " + test3);
    }
}

import java.util.Random;




public class ComputeMethods {



    public double fToC(double degreesF) {
        double celsius = ( (degreesF - 32.0) * 5/9);
        return celsius;
    }

    public double hypotenuse(int a, int b) {
        double hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hypo;
    }

    public int roll() {
        Random rand = new Random();
        int result = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
        return result;
    }
}


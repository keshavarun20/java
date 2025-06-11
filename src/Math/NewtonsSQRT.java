package Math;

public class NewtonsSQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f\n", sqrt(40));
    }

    static double sqrt(double S) {
        double x = S;
        double tolerance = 1e-6; //(can be 1 also)
        double root;

        while (true) {
            root = 0.5 * (x + S / x);

            if (Math.abs(root - x) < tolerance) {
                break;
            }

            x = root;
        }

        return root;
    }
}

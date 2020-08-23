import java.util.Arrays;

/**
 * Demonstrates command-line arguments.
 */
public class Max {

    /**
     * Converts args to integers and prints the max.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        if (args.length == 0) {
            System.err.println("Usage: java Max <numbers>");
            return;
        }

        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The max is " + max);
    }

}

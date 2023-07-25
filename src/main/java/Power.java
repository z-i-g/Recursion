public class Power {
    public static double execute(int base, int exponent) {
        if (exponent == 1)
            return base;
        if (exponent == 0)
            return 1;
        if (exponent < 0)
            return base / execute(base, Math.abs(exponent - 1));

        return base * execute(base, exponent - 1);
    }
}
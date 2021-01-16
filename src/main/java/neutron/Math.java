package neutron;

public class Math {
    public static final double PI = 3.14159265358979323846;
    public static final double E = 2.7182818284590452354;

    public Math() {}
    /** Returns the power of two integers */
    public static int pow(int x,int y) {
        int prefix = 1;
        if (y == 0) {
            return 1;
        }
        while (y != 1) {
            if (y % 2 == 0) {
                x *= x;
            } else if(y % 2 == 1) {
                prefix*=x;
                x*=x;
                y-=1;
            }
            y /= 2;
        }
        return x*prefix;
    }
    /** Returns the power of two doubles */
    public static double pow(double x,double y) {
        double prefix = 1.0;
        if (y == 0.0) {
            return 1.0;
        }
        while (y != 1.0) {
            if (y % 2.0 == 0.0) {
                x *= x;
            } else if(y % 2.0 == 1.0) {
                prefix*=x;
                x*=x;
                y-=1.0;
            }
            y /= 2.0;
        }
        return x*prefix;
    }
    /** Returns the power of two floats */
    public static float pow(float x,float y) {
        float prefix = 1;
        if (y == 0) {
            return 1f;
        }
        while (y != 1) {
            if (y % 2 == 0) {
                x *= x;
            } else if(y % 2 == 1) {
                prefix*=x;
                x*=x;
                y-=1;
            }
            y /= 2;
        }
        return x*prefix;
    }
    /** Returns the power of two longs */
    public static long pow(long x,long y) {
        long prefix = 1;
        if (y == 0.0) {
            return 1;
        }
        while (y != 1) {
            if (y % 2 == 0) {
                x *= x;
            } else if(y % 2 == 1) {
                prefix*=x;
                x*=x;
                y-=1;
            }
            y /= 2;
        }
        return x*prefix;
    }
    /** Returns the sum of two integers */
    public static int add(int x,int y) { return x+y; }
    /** Returns the sum of two integers */
    public static double add(double x,double y) { return x+y; }
    /** Returns the sum of two integers */
    public static float add(float x,float y) { return x+y; }
    /** Returns the sum of two integers */
    public static long add(long x,long y) { return x+y; }
    /** Returns the square of two integers
     * @param x ^ 2 */
    public static int square(int x) { return pow(x,2); }
    public static double square(double x) { return pow(x,2); }
    public static float square(float x) { return pow(x,2); }
    public static long square(long x) { return pow(x,2); }
}

package neutron;

public class Math {
    public static final double PI = 3.14159265358979323846;
    public static final double E = 2.7182818284590452354;

    public Math() {}

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
    public static int add(int x,int y) { return x+y; }
    public static double add(double x,double y) { return x+y; }
    public static float add(float x,float y) { return x+y; }
    public static long add(long x,long y) { return x+y; }
    public static int square(int x,int y) { return pow(x,2); }
    public static double square(double x,double y) { return pow(x,2); }
    public static float square(float x,float y) { return pow(x,2); }
    public static long square(long x,long y) { return pow(x,2); }
}

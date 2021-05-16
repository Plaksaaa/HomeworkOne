public class Main {
    public static void main(String[] args) {

        boolean one = true;
        System.out.println(one);

        byte two = 2;
        System.out.println(two);

        short three = 3;
        System.out.println(three);

        int four = 4;
        System.out.println(four);

        long five = 5;
        System.out.println(five);

        char six = '6';
        System.out.println(six);

        double eight = 8.0;
        System.out.println(eight);

        float nine = 9.000f;
        System.out.println(nine);

//        char lol = '34';
//        System.out.println(lol);
        System.out.println(divisionInt(5, 1));
        System.out.println(divisionInt(5, 0));
        System.out.println(divisionDouble(5.0, 0.0));
        System.out.println(divisionFloat(5.0f, 0.0f));

    }

    public static int divisionInt(int a, int b) {
        return a / b;
    }

    public static double divisionDouble(double a, double b) {
        return a / b;
    }

    public static float divisionFloat(float a, float b) {
        return a / b;
    }
}

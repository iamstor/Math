class Solution {


    //      {Функция, площадь которой нужно вычислить}
    public static double function1(double x) {
        double F = (x * x);
        return F;
    }

    public static double function2(double x) {
        double F = (3 * x * x * x - 2 * x * x + 7 * x - 8);
        return F;
    }

    public static double function3(double x) {
        double F = (3 * x * x * x + 5 * x * x + 3 * x - 6);
        return F;
    }

    static int k = 4;

    public static void doTrapeze1(double a, double b, double esp) {
        double result = 0;

        double previous_res = 0;
        double priv = 0;
        System.out.println(" k  " + k);
        if (Math.abs(previous_res - priv) < esp) {
            k = k * 2;

            double h = (b - a) / k;
            System.out.println("h  " + h);
            result += (function1(a) + function1(b)) / 2;
            System.out.println("result  " + result);
            priv = result;
            System.out.println("ptiv  " + priv);
            for (int i = 1; i < k; i++)
                result += function1(a + h * i);
            System.out.println("res  " + result);
            previous_res = h * result;

            System.out.println("prres" + previous_res);
            System.out.println(k);
        }


        System.out.println(previous_res);

    }


    public static void doTrapeze2(double a, double b, double esp) {
        double result = 0;
        long k = 4;

        double previous_res = 0;
        double prev = 0;
        int aloha = 0;
        do {
            aloha++;
            System.out.println("aloha" + aloha);
            k *= 2;
            System.out.println("kol" + k);
            double h = (b - a) / k;
            result += (function2(a) + function2(b)) / 2;
            System.out.println("result" + result);

            for (int i = 1; i < k; i++) {

                prev += function2(a + h * i);
                System.out.println("prev" + prev);
                previous_res = h * prev;


            }
        } while (Math.abs(previous_res - result) <= esp);
        System.out.println("previous_res" + previous_res);
        System.out.println("k" + k);

        System.out.println("total" + previous_res);
    }


    public static void doTrapeze3(double a, double b, double esp) {
        double result = 0;
        int k = 4;
        double previous_res;
        double priv;

        do {
            k = k * 2;
            // priv=result;
            double h = (b - a) / k;
            result += (function3(a) + function3(b)) / 2;
            priv = result;
            for (int i = 1; i < k; i++)
                result += function3(a + h * i);
            previous_res = h * result;

        }
        while (Math.abs(previous_res - priv) > esp);

        System.out.println(k);
        System.out.println(previous_res);
    }

}



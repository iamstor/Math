import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Нижний предел интегрирования :");
        double a = scan.nextDouble();
        System.out.println("Верхний предел интегрирования :");
        double b = scan.nextDouble();

        System.out.println("Точность :");
        double ha=scan.nextDouble();
        System.out.println("Количество интервалов разбиения, по умолчанию равно 4");

        int size=4;

        Solution solution=new Solution();

        System.out.println("Выберите уравнение: \n " +
                "A -> x * x \n"+
                " B -> 3 * x * x * x - 2 * x * x + 7 * x - 8 \n"+
                " C -> 2x^3 - 2x^2 + 7x - 14 \n");


        switch(scan.next()){
            case("A"):{
                Solution.doTrapeze1(a,b,ha);
                break;
            }
            case("B"):{
               Solution.doTrapeze2(a,b,ha);
               break;
            }
            case("C"):{
              Solution.doTrapeze3(a,b,ha);
                break;
            }

        }
    }
}

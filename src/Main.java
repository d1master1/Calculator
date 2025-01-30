import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Все операции выполняются соответствующими знаками");
        System.out.println("После ввода числа или операции нажимать на Enter");
        Scanner scanner = new Scanner(System.in);

        boolean key = true;
        while (key) {

            int a = scanner.nextInt();
            int b;
            char c = scanner.next().charAt(0);

            switch (c) {

                case '+':
                    b = scanner.nextInt();
                    System.out.println("Результат: " + sum(a, b));
                    break;
                case '-':
                    b = scanner.nextInt();
                    System.out.println("Результат: " + sub(a, b));
                    break;
                case '/':
                    b = scanner.nextInt();
                    System.out.println("Результат: " + div(a, b));
                    break;
                case '*':
                    b = scanner.nextInt();
                    System.out.println("Результат: " + mul(a, b));
                    break;
            }

            System.out.print("Закончить?(y/не y - чтобы продолжить): ");
            char stop = scanner.next().charAt(0);
            if (stop == 'y') {
                key = false;
            }
        }
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static double div(int a, int b){
        return (double) a / b;
    }
    public static int mul(int a, int b){
        return a * b;
    }

}
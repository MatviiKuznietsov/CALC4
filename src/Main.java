import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainCalc ();
    }
    public static void mainCalc (){ String repeat="Y";
        do {
            System.out.println("Input 2 number");
            double number1 = input();
            double number2 = input();
            ChooseOperation(number1,number2);
            System.out.println("Would you like repeat new operation Y/N");
            repeat=input2();
            repeat=Repeat(repeat);
        } while (repeat.equals("Y"));}
    static Scanner scanner = new Scanner(System.in);
    public static String ChooseOperation(double number1,double number2){
        System.out.println("Input type of operation +,-,*,/");
        String operation = input2();
        switch (operation) {
            case "+" -> {
                number1 = number1 + number2;
                System.out.println("Result is " + number1);
            }
            case "-" -> {
                number1 = number1 - number2;
                System.out.println("Result is " + number1);
            }
            case "*" -> {
                number1 = number1 * number2;
                System.out.println("Result is " + number1);
            }
            case "/" -> {
                number1 = number1 / number2;
                System.out.println("Result is " + number1);
            }
            default -> System.out.println("Input type of operation is incorrect");
        }
        return "0";
    }
    public static int input(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = input();
        }
        return num;
    }
    public static String input2( ){
        Scanner scan = new Scanner(System.in);
        String inputOperation = scan.next();
        return  inputOperation;
    }
    public static String Repeat(String repeat){
        if (repeat.equals("Y")){System.out.println("Continue"); }
        else if (repeat.equals("N")){System.out.println("Finish"); }
        else {System.out.println("Incorrect input");
        }
        return repeat;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainCalc ();
    }
    public static void mainCalc (){
        String repeat="Y";
        while (repeat.equals("Y"))
        {
            System.out.println("WELCOME TO THE NEW CALCULATOR");
            double firstNumber = getNumbersFromConsole(); //Output function 1-st Number
            double secondNumber = getNumbersFromConsole(); //Output function 2-nd Number
            System.out.println("Choose operation [+][-][*][/]");
            String operation = getSymbolFromConsole(); //Choose operator
            System.out.println(resultCalc (firstNumber,secondNumber, operation));
            System.out.println("Would you like repeat new operation Y/N");
            repeat=getSymbolFromConsole();
            repeat=Repeat(repeat);
        }
    }
    public static double resultCalc (double firstNumber,double secondNumber,String inputOperation ){

        switch (inputOperation) {
            case "+" -> {
                double result=firstNumber + secondNumber;
                return result;
            }
            case "-" -> {
                double result=firstNumber - secondNumber;
                return result;
            }
            case "*" -> {
                double result = firstNumber * secondNumber;
                return result;
            }
            case "/" -> {
                if (secondNumber == 0){
                    System.out.println("division by 0 is forbidden");
                }
                else {
                    double result = firstNumber / secondNumber;
                    return result;
                }
            }
            default -> System.out.println("Input type of operation is incorrect");
        }
        return 0;
    }
    static Scanner scanner = new Scanner(System.in);
    public static double getNumbersFromConsole(){
        System.out.println("Input NUMBER:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("You have mistake imput");
            scanner.next();
            num = getNumbersFromConsole();
        }
        return num;
    }
    public static String getSymbolFromConsole( ){
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
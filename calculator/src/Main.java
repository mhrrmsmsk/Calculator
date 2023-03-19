import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     double num1, num2 ;
     String symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter a number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter the action you want to do: ");
        symbol=scanner.next();

        switch (symbol){
            case "+":
                System.out.println(num1+"+"+num2+"="+(num1+num2));
break;
            case "-":
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
                case "/":
                    if (num2!=0){
                        System.out.println(num1+"/"+num2+"="+(num1/num2));
                    }else System.out.println("Denominator must not be equal to zero");
                    break;
                    case "*":
                        System.out.println(num1+"*"+num2+"="+(num1*num2));
                        break;
            case "%":
                System.out.println(num1+"%"+num2+"="+(num1%num2));
           default:
                System.out.println("Please enter the valid value");
                break;
        }
    }
}
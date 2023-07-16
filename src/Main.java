import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-ci ədədi daxil edin:");
        double first = sc.nextDouble();
//        System.out.println("Riyazi əməli yazın");
//        String math = sc.next();
        System.out.println("2-ci ədədi daxil edin:");
        double second = sc.nextDouble();
        System.out.println("Cavab: +  " + (first  + second) );
        System.out.println("Cavab: -  " + (first  - second) );
        System.out.println("Cavab: *  " + (first  * second) );
        System.out.println("Cavab: /  " + (first  / second) );
//        switch(math) {
//            case "+":
//                System.out.println( first + second);
//                break;
//            case "-":
//                System.out.println( first - second);
//                break;
//            case "/":
//                System.out.println( first / second);
//                break;
//            case "*":
//                System.out.println( first * second);
//                break;
//            default:
//                System.out.println("belə əməl mövcud deyil.");
//        }
    }
}
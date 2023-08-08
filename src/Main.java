import java.util.Scanner;
import java.util.Vector;

public class Main {


    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;
        // if(clock<8 || clock>=20){
        //  return true;
        //}
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && firstAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);

    }

    public static boolean hasTeenOptional(int... ages) {
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp > 25 && temp <= 45;
        }
        return temp > 25 && temp <= 35;

    }

    public static double area(double x, double y) {
        if (x <= 0 || y <= 0) {
            System.out.println("Alan değerleri 0'dan büyük olmalıdır.");
            return -1;
        }
        return x * y;
    }

    public static double circleArea(double radius) {
        if (radius < 0) {
            System.out.println("Alan değerleri 0'dan büyük olmalıdır");
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static boolean isPrime(int num) {
        if (num < 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("shouldWakeUp............");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("hasTeen ............");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("isCatPlaying............");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("RectabgleArea............");
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (isValid) {
            try {
                System.out.println("Enter width of rectangle");
                double x = scanner.nextDouble();
                System.out.println("Enter height of rectangle");
                double y = scanner.nextDouble();
                System.out.println("Area=" + area(x, y));

            } catch (Exception ex) {
                System.out.println("Invalid Input");
            }

        }
        System.out.println("CircleArea.....");
        try {
            System.out.println("Enter radius of circle:");
            double radius = scanner.nextDouble();
            System.out.println("Result=" + circleArea(radius));

        } catch (Exception ex) {
            System.out.println("Invalid Input");

        }
        System.out.println("isPrime......");
        System.out.println(isPrime(3));
        System.out.println(2);
        System.out.println(1);
        System.out.println(17);


    }


}
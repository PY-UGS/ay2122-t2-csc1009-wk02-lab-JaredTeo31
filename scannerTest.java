import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args){
        System.out.println("Q1");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = scan.nextDouble();
        double pi = 3.14159;
        double area = pi * radius * radius;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
        System.out.println("Q2");
        System.out.print("Enter 3 numbers: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double average = (a+b+c)/3;
        System.out.println("The average of " + a + " " + b + " "+ c + " " + " is " + average);
        System.out.println("Q3");
        long milliseconds = System.currentTimeMillis();
        long totalSeconds = milliseconds/1000;
        long seconds = totalSeconds % 60;
        long totalminutes = totalSeconds/60;
        long minutes = totalminutes % 60;
        long totalHours = totalminutes/60;
        long hours = totalHours%24;
        System.out.println("current time is " + hours + ":" + minutes + ":"+ seconds + " GMT");
        System.out.println("Q4");
        Scanner year = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int inputYear = year.nextInt();
        int zodiacSign = inputYear % 12;
        switch(zodiacSign)
        {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Unknown input");
                break;
        }
        scan.close();
        year.close();

    }
}

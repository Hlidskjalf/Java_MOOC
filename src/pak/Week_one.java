package pak;

import java.util.Scanner;

public class Week_one {

    public static void main(String[] args) {
        useAdd();

    }

    public static void useAdd() {
        int numOne = 5;
        int numTwo = 13;

        numOne = numOne * numTwo;
        numTwo = numOne * numTwo;

        Week_two.add(numOne, numTwo);
    }

    public static void name() {
        System.out.println("Andrew Vroman");
    }

    public static void HelloWorld() {
        System.out.println("Hello World!");
        System.out.println("(And all the people of the world)");
    }

    public static void Spruce() {
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");
        System.out.println("    *    ");

    }

    public static void farmTracker() {
        int chickens = 3;
        double baconWeight = 5.5;
        String tractor = "There is none!";

        System.out.println("Chickens: \n" + chickens + "\nBacon (kg): \n" + baconWeight + "\nTractor: \n" + tractor + "\n");
        System.out.println("In a nutshell: \n" + chickens + "\n" + baconWeight + "\n" + tractor + "\n");

        System.out.println("Let's modify these numbers programmatically.\n");

        Scanner input = new Scanner(System.in);

        System.out.println("How many Chickens are there?");
        chickens = input.nextInt();
        System.out.println("How much bacon is there? (kg)");
        baconWeight = input.nextDouble();
        System.out.println("What model of tractor is there?");
        tractor = input.next();

        System.out.println("Chickens: \n" + chickens + "\nBacon (kg): \n" + baconWeight + "\nTractor: \n" + tractor + "\n");
        System.out.println("In a nutshell: \n" + chickens + "\n" + baconWeight + "\n" + tractor + "\n");

    }

    public static void secondsPerYear() {
        double seconds;
        seconds = (60 * 60 * 24 * 365);

        System.out.println("There are " + seconds + " seconds per year.");
    }

    public static void add() {
        int x = 5;
        int y = 4;

        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public static void multiply() {
        int x = 7;
        int y = 10;

        System.out.println(x + " * " + y + " = " + (x * y));
    }

    public static void adder() {
        int x;
        int y;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        x = input.nextInt();
        System.out.println("Enter another number: ");
        y = input.nextInt();

        System.out.println("Sum of the numbers: " + (x + y));
    }

    public static void circumference() {
        double pi = Math.PI;
        double radius;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        radius = input.nextDouble();

        System.out.println("The circumference is " + ((2 * pi) * radius));

    }

    public static void findTheBiggerNumber() {
        int x;
        int y;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        x = input.nextInt();
        System.out.println("Enter another number: ");
        y = input.nextInt();
        int larger = (x > y) ? x : y;
        System.out.println("The larger of the two is: " + larger);
    }

    public static void namesAndAges() {
        String nameOne;
        String nameTwo;
        int ageOne;
        int ageTwo;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name and the age: ");
        nameOne = input.next();
        ageOne = input.nextInt();
        System.out.println("Enter the second name and age: ");
        nameTwo = input.next();
        ageTwo = input.nextInt();

        System.out.println("The sum of the ages of " + nameOne + " and " + nameTwo + " is: " + (ageOne + ageTwo));
    }

}

package Average;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int point1, point2, point3, point4;
        double average;

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your name:");
        name = scanner.nextLine();
        System.out.println("enter 4 numbers:");
        point1 = scanner.nextInt();
        point2 = scanner.nextInt();
        point3 = scanner.nextInt();
        point4 = scanner.nextInt();

        scanner.close();

        average = (double) (point1+point2+point3+point4)/4;
        System.out.println("Hey "+name+", your average score is: "+ average);
    }
}
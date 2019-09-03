import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String display() {
        return " a = " + a + "\n b = " + b + "\n c = " + c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + (Math.pow((b * b) - (4 * a * c), 0.5))) / 2 * a;
    }

    public double getRoot2() {
        return (-b - (Math.pow((b * b) - (4 * a * c), 0.5))) / 2 * a;
    }

    public static void main(String[] args) {
        hideError();
    }

    private static void hideError() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert a:");
            double a = scanner.nextDouble();
            System.out.println("Insert b:");
            double b = scanner.nextDouble();
            System.out.println("Insert c:");
            double c = scanner.nextDouble();

            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            System.out.println(quadraticEquation.display());

            if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
            } else {
                System.out.println("The equation has no root!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error datatype ! try again.");
            hideError();
        } catch (Exception e) {
            System.out.println("Something broken ! try again.");
            hideError();
        }
    }
}


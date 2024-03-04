import java.util.Scanner;

class ComplexNumber {
    double real, imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }
}

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        ComplexNumber sum = complex1.add(complex2);

       System.out.println("Sum of the complex numbers: " + sum.real + " + " + sum.imaginary + "i");
    }
}

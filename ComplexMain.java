import java.util.Scanner;

class Complex {
    double real, img;

    // Default Constructor
    Complex() {
        real = 0;
        img = 0;
    }

    // Parameterized Constructor
    Complex(double r, double i) {
        real = r;
        img = i;
    }

    // Add Method
    Complex add(Complex c2) {
        Complex result = new Complex();
        result.real = real + c2.real;
        result.img = img + c2.img;
        return result;

        // Or:
        // return new Complex
    }

    // Subtract Method
    Complex subtract(Complex c2) {
        Complex result = new Complex();
        result.real = real - c2.real;
        result.img = img - c2.img;
        return result;

        // Or:
        //
    }

    // Multiply Method
    Complex multiply(Complex c2) {
        Complex result = new Complex();
        result.real = (real * c2.real) - (img * c2.img);
        result.img = (real * c2.img) + (img * c2.real);
        return result;
    }

    // Display Method
    void display() {
        System.out.println(real + " + " + img + "i");

      
    }
}

public class ComplexMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input First Number
        System.out.println("Enter Real and Imaginary part of First Number:");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        // Input Second Number
        System.out.println("Enter Real and Imaginary part of Second Number:");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        System.out.println("\n--- Results ---");

        // Perform Operations
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Display Results
        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        diff.display();

        System.out.print("Product: ");
        prod.display();
    }
}


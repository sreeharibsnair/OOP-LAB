import java.util.Scanner;

class CPU {
    double price;

    class Processor {
        int cores;
        String manufacturer;
    }

    static class RAM {
        int memory;
        String manufacturer;
    }
}

public class CPUMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CPU cpuObj = new CPU();

        System.out.print("Enter CPU price: ");
        cpuObj.price = sc.nextDouble();
        sc.nextLine();

        CPU.Processor p = cpuObj.new Processor();
        System.out.print("Enter number of cores: ");
        p.cores = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter processor manufacturer: ");
        p.manufacturer = sc.nextLine();

        CPU.RAM r = new CPU.RAM();
        System.out.print("Enter RAM size (GB): ");
        r.memory = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter RAM manufacturer: ");
        r.manufacturer = sc.nextLine();

        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("CPU Price: " + cpuObj.price);
        System.out.println("Processor Cores: " + p.cores);
        System.out.println("Processor Manufacturer: " + p.manufacturer);
        System.out.println("RAM Size: " + r.memory + " GB");
        System.out.println("RAM Manufacturer: " + r.manufacturer);
    }
}



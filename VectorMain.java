import java.util.Scanner;

public class VectorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter dimension of Vector A (2 or 3): ");
            int dimA = sc.nextInt();
            double[] compA = new double[dimA];
            System.out.println("Enter " + dimA + " components of Vector A:");
            for (int i = 0; i < dimA; i++) {
                System.out.print("  Component " + (i + 1) + ": ");
                compA[i] = sc.nextDouble();
            }
            Vector a = new Vector(compA);

            System.out.print("Enter dimension of Vector B (2 or 3): ");
            int dimB = sc.nextInt();
            double[] compB = new double[dimB];
            System.out.println("Enter " + dimB + " components of Vector B:");
            for (int i = 0; i < dimB; i++) {
                System.out.print("  Component " + (i + 1) + ": ");
                compB[i] = sc.nextDouble();
            }
            Vector b = new Vector(compB);

            boolean running = true;
            while (running) {
                System.out.println("\n--- Vector Operations ---");
                System.out.println("1. Add");
                System.out.println("2. Subtract (A - B)");
                System.out.println("3. Dot Product");
                System.out.println("4. Display Vectors");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("A + B = ");
                        Vector sum = a.add(b);
                        sum.display();
                        break;
                    case 2:
                        System.out.print("A - B = ");
                        Vector diff = a.subtract(b);
                        diff.display();
                        break;
                    case 3:
                        double dot = a.dotProduct(b);
                        System.out.println("A . B = " + dot);
                        break;
                    case 4:
                        System.out.print("Vector A = ");
                        a.display();
                        System.out.print("Vector B = ");
                        b.display();
                        break;
                    case 5:
                        running = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }

        } catch (VectorException e) {
            System.out.println("VectorException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
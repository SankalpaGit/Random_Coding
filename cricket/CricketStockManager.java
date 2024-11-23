package cricket;

import java.util.Scanner;

public class CricketStockManager {
    public static void main(String[] args) {
        StockService stockService = new StockService();
        ReportGenerator reportGenerator = new ReportGenerator(stockService);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Cricket Stock Manager ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Current Stock");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stockService.addStock();
                    break;
                case 2:
                    stockService.sellStock();
                    break;
                case 3:
                    stockService.displayCurrentStock();
                    break;
                case 4:
                    reportGenerator.generateReport();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

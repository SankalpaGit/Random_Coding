package cricket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockService {
    private Map<String, StockItem> stockItems = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStock() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter quantity to add: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price per unit: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        StockItem item = stockItems.getOrDefault(itemName, new StockItem(itemName, 0, price));
        item.addStock(quantity);
        stockItems.put(itemName, item);

        System.out.println(quantity + " units of " + itemName + " added.");
    }

    public void sellStock() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter quantity to sell: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        StockItem item = stockItems.get(itemName);
        if (item == null || item.getCurrentStock() < quantity) {
            System.out.println("Insufficient stock or item not found.");
        } else {
            item.sellStock(quantity);
            System.out.println(quantity + " units of " + itemName + " sold.");
        }
    }

    public void displayCurrentStock() {
        if (stockItems.isEmpty()) {
            System.out.println("No items in stock.");
        } else {
            System.out.println("\n--- Current Stock ---");
            for (StockItem item : stockItems.values()) {
                System.out.println(item);
            }
        }
    }

    public Map<String, StockItem> getStockItems() {
        return stockItems;
    }
}

package cricket;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ReportGenerator {
    private StockService stockService;

    public ReportGenerator(StockService stockService) {
        this.stockService = stockService;
    }

    public void generateReport() {
        Map<String, StockItem> stockItems = stockService.getStockItems();
        if (stockItems.isEmpty()) {
            System.out.println("No items in stock to generate a report.");
            return;
        }

        String fileName = "CricketStockReport_" + System.currentTimeMillis() + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("--- Cricket Stock Report ---\n");
            writer.write("Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n\n");

            for (StockItem item : stockItems.values()) {
                writer.write("Item Name: " + item.getName() + "\n");
                writer.write("Price per Unit: $" + item.getPricePerUnit() + "\n");
                writer.write("Total Stock: " + (item.getCurrentStock() + item.getTotalSold()) + "\n");
                writer.write("Sold Stock: " + item.getTotalSold() + "\n");
                writer.write("Remaining Stock: " + item.getCurrentStock() + "\n\n");
            }

            System.out.println("Report generated successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error generating report: " + e.getMessage());
        }
    }
}

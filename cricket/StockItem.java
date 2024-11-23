package cricket;

public class StockItem {
    private String name;
    private int currentStock;
    private double pricePerUnit;
    private int totalSold;

    public StockItem(String name, int currentStock, double pricePerUnit) {
        this.name = name;
        this.currentStock = currentStock;
        this.pricePerUnit = pricePerUnit;
        this.totalSold = 0;
    }

    public void addStock(int quantity) {
        this.currentStock += quantity;
    }

    public void sellStock(int quantity) {
        if (quantity <= currentStock) {
            this.currentStock -= quantity;
            this.totalSold += quantity;
        }
    }

    public String getName() {
        return name;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    @Override
    public String toString() {
        return "Item: " + name +
                ", Current Stock: " + currentStock +
                ", Price per Unit: $" + pricePerUnit +
                ", Total Sold: " + totalSold;
    }
}

class ItemManager {
    // Method untuk menambahkan barang ke dalam stok
    public void addItem(String itemName) {
        System.out.println("Barang " + itemName + " ditambahkan ke dalam stok.");
    }

    // Method untuk menambahkan jumlah barang ke dalam stok
    public void addItem(String itemName, int quantity) {
        System.out.println(quantity + " " + itemName + " ditambahkan ke dalam stok.");
    }
}

public class Main {
    public static void main(String[] args) {
        ItemManager itemManager = new ItemManager();
        itemManager.addItem("Pensil");
        itemManager.addItem("Buku", 10);
    }
}

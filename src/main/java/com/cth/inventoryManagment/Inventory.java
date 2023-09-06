package com.cth.inventoryManagment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {
    private static final ObservableList<Part> allParts = FXCollections.observableArrayList();
    private static final ObservableList<Product> allProducts = FXCollections.observableArrayList();

    // Part and product IDs. To improve the utility of the program, these numbers should be autogenerated and stored in
    // a database, otherwise they won't persist after the program ends.
    private static int currentProductId = 0;
    private static int currentPartId = 0;

    // Methods to increment part and product IDs.
    public static int incrementProductId() {
        ++currentProductId;
        return currentProductId;
    }
    public static int incrementPartId() {
        ++currentPartId;
        return currentPartId;
    }

    // Method to add a part to allParts list
    public static void addPart(Part newPart) {
        allParts.add(newPart);
    }
    // Method to add a product to allProducts list
    public static void addProduct(Product newProduct) {
        allProducts.add(newProduct);
    }

    // Lookup parts by ID

    // Lookup products by ID

    // Lookup parts by name

    // Lookup products by name

    // Update the selected part by index

    // Update the selected product by index
    public static void updateProduct(Product modifiedProduct, int index) {
        Inventory.getAllProducts().set(index, modifiedProduct);
    }
    // Delete the selected part and return boolean
    public static boolean deletePart(Part selectedPart) {
        return allParts.remove(selectedPart);
    }
    // Delete the selected product and return boolean
    public static boolean deleteProduct(Product selectedProduct) {
        return allProducts.remove(selectedProduct);
    }

    // Method to get all parts from allParts list
    public static ObservableList<Part> getAllParts() {
        return allParts;
    }
    // Method to get all products from allProducts list
    public static ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}

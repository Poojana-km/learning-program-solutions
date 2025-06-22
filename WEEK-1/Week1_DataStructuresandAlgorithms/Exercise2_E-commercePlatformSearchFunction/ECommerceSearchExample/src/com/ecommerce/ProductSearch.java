package com.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shampoo", "Personal Care"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Book", "Stationery"),
            new Product(104, "Pen", "Stationery"),
            new Product(105, "Smartphone", "Electronics")
        };

        System.out.println("🔍 Linear Search for 'Pen'");
        Product result1 = linearSearch(products, "Pen");
        System.out.println(result1 != null ? "Found: " + result1 : "Not Found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\n🔍 Binary Search for 'Pen'");
        Product result2 = binarySearch(products, "Pen");
        System.out.println(result2 != null ? "Found: " + result2 : "Not Found");
    }
}
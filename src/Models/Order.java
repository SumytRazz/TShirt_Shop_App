package Models;

import java.util.Arrays;

public class Order {
    String name;
    String PhoneNumber;
    int[] items;
    double[] prices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.name = name;
        PhoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }
    public void generateBill() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }

        double vat = total * 0.13;
        double totalPriceWithVat = total + vat;

        System.out.println("Order details:");
        System.out.println("  Name: " + name);
        System.out.println("  Phone number: " + PhoneNumber);
        System.out.println();
        System.out.println("  Items: " + Arrays.toString(items));
        System.out.println("  Prices: " + Arrays.toString(prices));
        System.out.println();
        System.out.println("  VAT (13%): " + vat);
        System.out.println("  Total Price (including VAT): " + totalPriceWithVat);
        System.out.println();
    }
}

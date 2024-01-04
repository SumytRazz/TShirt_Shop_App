package Models;

import java.util.Arrays;

public class TShirt {
    String name;
    int ProductCode;
    String brand;
    double price;
    String description;
    String[] sizes;

    //4 Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductCode() {
        return ProductCode;
    }

    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }


    //2; Constructor to initialize fields.
    public TShirt(String name, int productCode, String brand, double price, String description, String[] sizes) {
        this.name = name;
        ProductCode = productCode;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.sizes = sizes;

    }

    //4. Method to describe the TShirt in format.
    public void displayTShirt() {
        System.out.println("Item name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + ProductCode);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + Arrays.toString(sizes));
        System.out.println();
    }
}


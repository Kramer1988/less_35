package Task4;

import java.util.ArrayList;

public class TV implements Comparable<TV> {

    private String model;                     //модель телевизора
    private int year;                         //год выпуска
    private int price;                          //цена
    private int diagonal;                      //диагональ
    private String countryOfManufacture;      //страна производитель

    public TV(String model, int year, int price, int diagonal, String countryOfManufacture) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    @Override
    public String toString() {
        return "TV{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", countryOfManufacture='" + countryOfManufacture + '\'' +
                '}';
    }


    public int compareTo(TV o) {
        return this.getPrice() - o.getPrice();

    }


}

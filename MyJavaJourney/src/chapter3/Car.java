package chapter3;

public class Car {
    /* (Car Class) Create a class called Car that includes three instance variables—a model (type
String), a year (type String), and a price (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the price is not positive,
do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities.
Create two Car objects and display each object’s price. Then apply a 5% discount on the
price of the first car and a 7% discount on the price of the second. Display each Car’s price again.
    */

    private String carModel;
    private String productionYear;
    private double price;

    public Car(String carModel, String productionYear, double price){
        this.carModel = carModel;
        this.productionYear = productionYear;
        if(price > 0.0)
        this.price = price;

    }

    public void setCarModel(String carModel){

        this.carModel = carModel;
    }

    public String getCarModel(){

        return carModel ;
    }

    public void setProductionYear(String productionYear){

        this.productionYear = productionYear;
    }
    public String getProductionYear(){

        return productionYear;
    }

    public void setPrice(double price)
    {   if(price > 0.00)
        this.price = price;
    }
    public double getPrice(){

        return price;
    }

    public void discount(double percentDiscount){

        price = price * (1 - (percentDiscount / 100));
    }
}

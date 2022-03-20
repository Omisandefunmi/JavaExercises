package chapter3;

public class PetrolPurchase {
    /* (Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String),
the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount
that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value.
Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.
     */

    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase (String stationLocation, String petrolType, int quantity,
                           double pricePerLiter, double percentageDiscount){
        this.stationLocation = stationLocation;
        this.percentageDiscount = percentageDiscount;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
    }

    public void setStationLocation (String stationLocation){
        this.stationLocation = stationLocation;
    }

    public String getStationLocation(){
        return stationLocation;
    }

    public void setPercentageDiscount (double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public void setQuantity (int quantity){

        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPetrolType (String petrolType){
        this.petrolType = petrolType;
    }

    public String getPetrolType(){
        return petrolType;
    }

    public void setPricePerLiter (double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter(){
        return pricePerLiter;
    }
    /* provide a method named getPurchaseAmount
that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. */


   /* public double PurchaseAmount(double ){

        return quantity * pricePerLiter - percentageDiscount;
    }
*/
}

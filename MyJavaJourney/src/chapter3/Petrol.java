package chapter3;

public class Petrol {
    public static void main(String[] args) {
       PetrolPurchase petrolSales = new PetrolPurchase("Bodija","Refined",
               23, 167.8, 0.2);

        System.out.println("The purchase amount is " + petrolSales.getQuantity());
        petrolSales.setQuantity(45);
        System.out.println("The purchase amount is " + petrolSales.getQuantity());
       }




}

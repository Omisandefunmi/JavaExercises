package chapter3;

public class CarApplication {
    public static void main(String[] args) {
        Car firstCar = new Car("Honda", "2001", 200);

        System.out.printf(" The default car name is %.2f%n" , firstCar.getPrice());

//        firstCar.setPrice(0.95 * firstCar.getPrice());
        firstCar.discount(5);

        System.out.printf(" The default car price is %.2f%n" , firstCar.getPrice());


        Car secondCar = new Car ("nissan","2000", 1550000);

        System.out.println("The default car name is " +secondCar.getCarModel()+ ", year is "
                +secondCar.getProductionYear()+ " and price is "+secondCar.getPrice());

        secondCar.discount(7);
        System.out.println("The discounted price of " +secondCar.getCarModel()+ " is " + secondCar.getPrice());

    }
}

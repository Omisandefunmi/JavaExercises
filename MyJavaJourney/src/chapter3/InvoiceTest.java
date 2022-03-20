package chapter3;

public class
InvoiceTest {
    public static void main(String[] args) {
      Invoice shopRite = new Invoice("ig47", "bottle water", 4, 80.0);

      // System.out.println("invoice amount is: " + shopRite.getInvoiceAmount());
        System.out.printf("%s %d %s", shopRite.getPartNumber(), shopRite.getQuantity(), shopRite.getPartDescription());


    }
}

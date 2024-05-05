package SolidPrinciple;
public class OrderTest {
    public static void main(String[] args) {
        TotalCalculator totalCalculator = new TotalCalculation();
        OrderPlacer orderPlacer = new OrderPlacement();
        InvoiceGenerator invoiceGenerator = new SimpleInvoiceGenerator();
        EmailNotifier emailNotifier = new EmailNotification();

        OrderAction orderAction = new OrderAction(totalCalculator, orderPlacer, invoiceGenerator, emailNotifier);

        double total = orderAction.calculateTotal(10.0, 2);
        orderAction.placeOrder("John Doe", "123 Main St");
        orderAction.generateInvoice("order_123.pdf");
        orderAction.sendEmailNotification("johndoe@example.com");
    }
}


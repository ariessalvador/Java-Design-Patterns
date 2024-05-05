package SolidPrinciple;

public class OrderAction implements TotalCalculator, OrderPlacer, InvoiceGenerator, EmailNotifier {
    private TotalCalculator totalCalculator;
    private OrderPlacer orderPlacer;
    private InvoiceGenerator invoiceGenerator;
    private EmailNotifier emailNotifier;

    public OrderAction(TotalCalculator totalCalculator, OrderPlacer orderPlacer,
                       InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier) {
        this.totalCalculator = totalCalculator;
        this.orderPlacer = orderPlacer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    @Override
    public double calculateTotal(double price, int quantity) {
        return totalCalculator.calculateTotal(price, quantity);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        orderPlacer.placeOrder(customerName, address);
    }

    @Override
    public void generateInvoice(String fileName) {
        invoiceGenerator.generateInvoice(fileName);
    }

    @Override
    public void sendEmailNotification(String email) {
        emailNotifier.sendEmailNotification(email);
    }
}


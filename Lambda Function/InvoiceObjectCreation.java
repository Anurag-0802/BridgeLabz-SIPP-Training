public class InvoiceObjectCreation {
    private String transactionId;

    public InvoiceObjectCreation(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{transactionId='" + transactionId + "'}";
    }
}

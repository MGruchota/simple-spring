package pl.groo.service;

public class InvoiceImpl implements Invoice{
    String invoice;

    @Override
    public String generateInvoiceNumber() {
        return "";
    }

    @Override
    public String getBankNumber() {
        return null;
    }
}

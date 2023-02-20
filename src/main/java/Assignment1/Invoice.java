package Assignment1Invoice;


public class Invoice {

    public static final int MAX_INVOICE_ITEMS = 5;
    private InvoiceItem[] invoiceItemArray;
    private int numberItems;

    public Invoice() {
        numberItems = 0;
        invoiceItemArray = new InvoiceItem[MAX_INVOICE_ITEMS];
    }

    public void addInvoiceItem(InvoiceItem invoiceItem) {
        if (numberItems < MAX_INVOICE_ITEMS) {
            invoiceItemArray[numberItems] = invoiceItem;
            numberItems++;
        }

    }


    public InvoiceItem getInvoiceItem(int lineNumber) {
        return invoiceItemArray[lineNumber - 1];
    }

    public int getNumberItems() {
        return numberItems;
    }

    public double getInvoiceTotal() {
        //TODO write this method - loop through line array and add up the lineitem totals
        double total = 0;
        for (int i = 1; i < this.numberItems; i++) {
            total += this.invoiceItemArray[i].getItemTotal();
        }
        return total;
    }
}

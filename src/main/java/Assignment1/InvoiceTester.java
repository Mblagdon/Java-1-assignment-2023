package Assignment1Invoice;



public class InvoiceTester {

    public static void main(String[] args) {
        System.out.println("Fun with Invoices");

        Product product1 = new Product(101, "Carton of Milk", 4.99);
        Product product2 = new Product(102, "Orange Juice", 6.99);
        Product product3 = new Product(103, "Loaf of Bread", 3.99);
        Product product4 = new Product(104, "Milk", 6.79);
        Product product5 = new Product(105, "Loafers", 33.99);

        InvoiceItem invoiceItem1 = new InvoiceItem(product1, 2);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2, 1);
        InvoiceItem invoiceItem3= new InvoiceItem(product3, 3);
        InvoiceItem invoiceItem4 = new InvoiceItem(product4, 11);
        InvoiceItem invoiceItem5 = new InvoiceItem(product5, 3);

        Invoice invoice = new Invoice();

        invoice.addInvoiceItem(invoiceItem1);
        invoice.addInvoiceItem(invoiceItem2);
        invoice.addInvoiceItem(invoiceItem3);
        invoice.addInvoiceItem(invoiceItem4);
        invoice.addInvoiceItem(invoiceItem5);

        printInvoice(invoice);
    }

    public static void printInvoice(Invoice invoice){
        System.out.println("Invoice Details\n");
        System.out.printf("ID\t\t \t\tDescription\t\t\tQuantity \t\tPrice \t\t\tTotal");
        int numberInvoiceItems = invoice.getNumberItems();
        for (int i = 1; i <= numberInvoiceItems; i++) {

            System.out.printf("\n%d %25s \t\t\t%d\t\t\t%.2f\t\t\t%.2f\n",
                    invoice.getInvoiceItem(i).getProduct().getId(),
                    invoice.getInvoiceItem(i).getProduct().getDescription(),
                    invoice.getInvoiceItem(i).getQuantity(),
                    invoice.getInvoiceItem(i).getProduct().getPrice(),
                    invoice.getInvoiceItem(i).getItemTotal());
        }
        System.out.printf("\nInvoice Total\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f", invoice.getInvoiceTotal());
    }


}



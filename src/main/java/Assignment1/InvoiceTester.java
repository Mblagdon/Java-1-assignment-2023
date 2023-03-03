package Assignment1;

/**
 * Create the invoice for assignment
 *
 * @author MBlagdon
 */
public class InvoiceTester {

    public static void main(String[] args) {
        System.out.println("Invoice Tester");

        Product product1 = new Product(101, "Oranges",1.99);
        Product product2 = new Product(102, "Bananas",0.59);
        Product product3 = new Product(103, "Cartons of milk",4.99);
        Product product4 = new Product(104, "Bag of coffee",12.99 );


        InvoiceItem invoiceItem1 = new InvoiceItem(product1, 5);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2, 7);
        InvoiceItem invoiceItem3= new InvoiceItem(product3, 2);
        InvoiceItem invoiceItem4 = new InvoiceItem(product4, 1);


        Invoice invoice = new Invoice();

        invoice.addInvoiceItem(invoiceItem1);
        invoice.addInvoiceItem(invoiceItem2);
        invoice.addInvoiceItem(invoiceItem3);
        invoice.addInvoiceItem(invoiceItem4);


        printInvoice(invoice);
    }

    public static void printInvoice(Invoice invoice){
        System.out.println("Invoice Details\n");
        System.out.printf("+-------------------------------------------------------------------------+");
        System.out.printf("\n|ID  \t \t|\t   Description \t\t| Quantity \t| Unit Price \t  | Total |");
        System.out.printf("\n+-------------------------------------------------------------------------+");
        int numberInvoiceItems = invoice.getNumberItems();
        for (int i = 1; i <= numberInvoiceItems; i++) {

            System.out.printf("\n%d %25s %13d %15.2f %12.2f\n",
                    invoice.getInvoiceItem(i).getProduct().getId(),
                    invoice.getInvoiceItem(i).getProduct().getDescription(),
                    invoice.getInvoiceItem(i).getQuantity(),
                    invoice.getInvoiceItem(i).getProduct().getPrice(),
                    invoice.getInvoiceItem(i).getItemTotal());
        }
        System.out.printf("\n+-------------------------------------------------------------------------+");
        System.out.printf("\n|Invoice Total %57.2f  |", invoice.getInvoiceTotal());
        System.out.printf("\n+-------------------------------------------------------------------------+");
    }


}



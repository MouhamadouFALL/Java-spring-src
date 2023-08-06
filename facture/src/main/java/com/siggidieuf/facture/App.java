package com.siggidieuf.facture;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.InvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Enter Name Client : " );
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Invoice invoice = new Invoice();
        invoice.setClient(name);
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);

        if (scan != null) scan.close();
    }
}

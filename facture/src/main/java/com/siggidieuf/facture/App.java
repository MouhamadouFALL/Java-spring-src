package com.siggidieuf.facture;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.InvoiceService;
import com.siggidieuf.facture.service.InvoiceServiceG;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // recupérer le nom du client
        System.out.println( "Enter Name Client : " );
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        // créer un objet facture
        Invoice invoice = new Invoice();
        invoice.setClient(name);
        System.out.println("Choose your configuration: 1- basic, 2- Garage");
        int config = scan.nextInt();
        if (config == 1) {
            InvoiceService invoiceService = new InvoiceService();
            invoiceService.createInvoice(invoice);
        } else if (config == 2) {
            InvoiceServiceG invoiceServiceG = new InvoiceServiceG();
            invoiceServiceG.createInvoice(invoice);
        }

        if (scan != null) scan.close();
    }
}

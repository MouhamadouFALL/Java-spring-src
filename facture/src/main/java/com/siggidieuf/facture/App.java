package com.siggidieuf.facture;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.controller.InvoiceController;
import com.siggidieuf.facture.controller.InvoiceControllerG;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println("Choose your configuration: 1- basic, 2- Garage");
        Scanner scan = new Scanner(System.in);
        int config = scan.nextInt();
        if (config == 1) {
            IinvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoice();
        } else if (config == 2) {
            IinvoiceController invoiceControllerG = new InvoiceControllerG();
            invoiceControllerG.createInvoice();
        }

        if (scan != null) scan.close();
    }
}

package com.siggidieuf.facture;

import com.siggidieuf.facture.controller.InvoiceController;
import com.siggidieuf.facture.controller.InvoiceControllerG;
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


        System.out.println("Choose your configuration: 1- basic, 2- Garage");
        Scanner scan = new Scanner(System.in);
        int config = scan.nextInt();
        if (config == 1) {
            InvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoiceBasic();
        } else if (config == 2) {
            InvoiceControllerG invoiceControllerG = new InvoiceControllerG();
            invoiceControllerG.createInvoiceG();
        }

        if (scan != null) scan.close();
    }
}

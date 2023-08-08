package com.siggidieuf.facture;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.controller.InvoiceController;
import com.siggidieuf.facture.controller.InvoiceControllerG;
import com.siggidieuf.facture.repository.InvoiceRepository;
import com.siggidieuf.facture.repository.InvoiceRepositoryG;
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
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            InvoiceService invoiceService = new InvoiceService();
            invoiceService.setInvoiceRepository(invoiceRepository);
            InvoiceController invoiceController = new InvoiceController();
            invoiceController.setInvoiceService(invoiceService);
            invoiceController.createInvoice();
        } else if (config == 2) {
            InvoiceRepositoryG invoiceRepositoryG = new InvoiceRepositoryG();
            InvoiceServiceG invoiceServiceG = new InvoiceServiceG();
            invoiceServiceG.setInvoiceRepository(invoiceRepositoryG);
            InvoiceControllerG invoiceControllerG = new InvoiceControllerG();
            invoiceControllerG.setInvoiceService(invoiceServiceG);
            invoiceControllerG.createInvoice();
        }

        if (scan != null) scan.close();
    }
}

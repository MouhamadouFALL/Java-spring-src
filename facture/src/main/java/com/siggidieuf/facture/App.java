package com.siggidieuf.facture;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.controller.InvoiceControllerDouchet;
import com.siggidieuf.facture.controller.InvoiceControllerKeyboard;
import com.siggidieuf.facture.controller.InvoiceControllerWeb;
import com.siggidieuf.facture.repository.IinvoiceRepository;
import com.siggidieuf.facture.repository.InvoiceRepositoryMemory;
import com.siggidieuf.facture.repository.InvoiceRepositoryDatabase;
import com.siggidieuf.facture.service.IinvoiceService;
import com.siggidieuf.facture.service.InvoiceServiceNumber;
import com.siggidieuf.facture.service.InvoiceServicePrefix;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Controller: web, keyboard, douchet : ");
        String controllerType = scan.nextLine();
        System.out.println("Choose your Service: number, prefix : ");
        String serviceType = scan.nextLine();
        System.out.println("Choose your Repository: memory, database: ");
        String repositoryType = scan.nextLine();


        IinvoiceController invoiceController = null;
        switch (controllerType){
            case "keyboard":
                invoiceController = new InvoiceControllerKeyboard();
                break;
            case "web":
                invoiceController = new InvoiceControllerWeb();
                break;
            case "douchet":
                invoiceController = new InvoiceControllerDouchet();
                break;
        }

        IinvoiceService invoiceService = null;
        switch (serviceType){
            case "number":
                invoiceService = new InvoiceServiceNumber();
                break;
            case "prefix":
                invoiceService = new InvoiceServicePrefix();
                break;
        }

        IinvoiceRepository invoiceRepository = null;
        switch (repositoryType){
            case "memory":
                invoiceRepository = new InvoiceRepositoryMemory();
                break;
            case "database":
                invoiceRepository = new InvoiceRepositoryDatabase();
                break;
        }

        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);

        invoiceController.createInvoice();

        if (scan != null) scan.close();

    }
}

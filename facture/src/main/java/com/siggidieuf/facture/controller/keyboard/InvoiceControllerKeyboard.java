package com.siggidieuf.facture.controller.keyboard;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.IinvoiceService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class InvoiceControllerKeyboard implements IinvoiceController {

    private IinvoiceService invoiceService;

    public IinvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IinvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){

        // recupérer le nom du client
        System.out.println( "Enter Name Client : " );
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Invoice invoice = new Invoice();
        invoice.setClient(name);

        //InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);

        if (scan != null) scan.close();
    }
}

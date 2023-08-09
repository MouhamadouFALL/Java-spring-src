package com.siggidieuf.facture.controller;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.IinvoiceService;
import java.util.Scanner;

public class InvoiceControllerKeyboard implements IinvoiceController{

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

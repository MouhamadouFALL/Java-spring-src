package com.siggidieuf.facture.controller;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.IinvoiceService;

import java.util.Scanner;

public class InvoiceControllerDouchet implements IinvoiceController{

    private IinvoiceService invoiceService;

    public IinvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IinvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){

        String name = "Douchet";
        Invoice invoice = new Invoice();
        invoice.setClient(name);
        invoiceService.createInvoice(invoice);

    }
}

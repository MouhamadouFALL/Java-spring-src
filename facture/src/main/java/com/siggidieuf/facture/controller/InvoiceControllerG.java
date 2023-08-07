package com.siggidieuf.facture.controller;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.IinvoiceService;

public class InvoiceControllerG implements IinvoiceController {

    private IinvoiceService invoiceService;
    public void createInvoice(){

        String name = "Leukk";
        Invoice invoice = new Invoice();
        invoice.setClient(name);

        //InvoiceServiceG invoiceServiceG = new InvoiceServiceG();
        invoiceService.createInvoice(invoice);

    }
}

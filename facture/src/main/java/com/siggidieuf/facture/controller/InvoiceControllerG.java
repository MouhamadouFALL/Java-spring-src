package com.siggidieuf.facture.controller;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.InvoiceService;
import com.siggidieuf.facture.service.InvoiceServiceG;

import java.util.Scanner;

public class InvoiceControllerG {

    public void createInvoiceG(){

        String name = "Leukk";
        Invoice invoice = new Invoice();
        invoice.setClient(name);

        InvoiceServiceG invoiceServiceG = new InvoiceServiceG();
        invoiceServiceG.createInvoice(invoice);

    }
}

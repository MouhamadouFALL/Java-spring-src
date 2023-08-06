package com.siggidieuf.facture.service;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.InvoiceRepository;

public class InvoiceServiceG {

    private static Long lastNumber=120L;
    private static InvoiceRepository invoiceRepository = new InvoiceRepository();
    public void createInvoice(Invoice invoice){
        invoice.setNumber("INV_"+(++lastNumber));
        invoiceRepository.create(invoice);
        System.out.println("| Client: "+invoice.getClient()+" || Fact: "+invoice.getNumber()+" |");
    }
}

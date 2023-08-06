package com.siggidieuf.facture.service;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.InvoiceRepository;

public class InvoiceService {

    private static Long lastNumber=0L;
    private static InvoiceRepository invoiceRepository = new InvoiceRepository();
    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
        System.out.println("| Client: "+invoice.getClient()+" || Fact: "+invoice.getNumber()+" |");
    }
}

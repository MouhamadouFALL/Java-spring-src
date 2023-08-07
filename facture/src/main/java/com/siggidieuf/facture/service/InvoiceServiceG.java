package com.siggidieuf.facture.service;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.IinvoiceRepository;

public class InvoiceServiceG implements IinvoiceService{

    private static Long lastNumber=120L;
    private IinvoiceRepository invoiceRepository;
    public void createInvoice(Invoice invoice){
        invoice.setNumber("INV_"+(++lastNumber));
        invoiceRepository.create(invoice);
        System.out.println("| Client: "+invoice.getClient()+" || Fact: "+invoice.getNumber()+" |");
    }
}

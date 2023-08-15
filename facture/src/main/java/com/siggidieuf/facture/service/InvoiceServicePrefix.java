package com.siggidieuf.facture.service;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.IinvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceServicePrefix implements IinvoiceService{

    private Long lastNumber;
    private String prfix;

    public void setPrfix(String prfix) {
        this.prfix = prfix;
    }

    @Autowired
    private IinvoiceRepository invoiceRepository;

    public IinvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(IinvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber("INV_"+(++lastNumber));
        invoiceRepository.create(invoice);
        System.out.println("| Client: "+invoice.getClient()+" || Fact: "+invoice.getNumber()+" |");
    }

    public Long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrfix() {
        return prfix;
    }
}

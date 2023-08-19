package com.siggidieuf.facture.service.prefix;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.IinvoiceRepository;
import com.siggidieuf.facture.service.IinvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServicePrefix implements IinvoiceService {

    @Value("${invoice.lastNumber}")
    private Long lastNumber;
    @Value("${invoice.prefix}")
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
        invoice.setNumber(prfix+(++lastNumber));
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

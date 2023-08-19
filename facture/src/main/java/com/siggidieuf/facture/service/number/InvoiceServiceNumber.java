package com.siggidieuf.facture.service.number;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.IinvoiceRepository;
import com.siggidieuf.facture.service.IinvoiceService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceNumber implements IinvoiceService {

    private static Long lastNumber=0L;
    private IinvoiceRepository invoiceRepository;

    public IinvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(IinvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
        System.out.println("| Client: "+invoice.getClient()+" || Fact: "+invoice.getNumber()+" |");
    }
}

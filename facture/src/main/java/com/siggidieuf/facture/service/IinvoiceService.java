package com.siggidieuf.facture.service;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.IinvoiceRepository;

public interface IinvoiceService {

    void createInvoice(Invoice invoice);
    void setInvoiceRepository(IinvoiceRepository invoiceRepository);
}

package com.siggidieuf.facture.controller;

import com.siggidieuf.facture.service.IinvoiceService;

public interface IinvoiceController {

    void createInvoice();
    void setInvoiceService(IinvoiceService invoiceService);
}

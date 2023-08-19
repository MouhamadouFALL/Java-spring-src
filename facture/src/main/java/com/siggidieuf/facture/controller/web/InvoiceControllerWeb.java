package com.siggidieuf.facture.controller.web;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.IinvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceControllerWeb implements IinvoiceController {

    @Autowired
    private IinvoiceService invoiceService;

    public IinvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IinvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){

        String name = "Leukk";
        Invoice invoice = new Invoice();
        invoice.setClient(name);

        //InvoiceServiceG invoiceServiceG = new InvoiceServiceG();
        invoiceService.createInvoice(invoice);

    }
}

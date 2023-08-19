package com.siggidieuf.facture.controller.scan;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.service.IinvoiceService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class InvoiceControllerDouchet implements IinvoiceController {

    private IinvoiceService invoiceService;

    public IinvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IinvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){

        String name = "Douchet";
        Invoice invoice = new Invoice();
        invoice.setClient(name);
        invoiceService.createInvoice(invoice);

    }
}

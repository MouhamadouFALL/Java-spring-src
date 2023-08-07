package com.siggidieuf.facture.repository;

import com.siggidieuf.facture.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryG implements IinvoiceRepository{

    private List<Invoice> invoices = new ArrayList<Invoice>();

    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Bill "+invoice.getNumber()+" added.");
    }
}

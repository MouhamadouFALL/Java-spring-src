package com.siggidieuf.facture.repository.memory;

import com.siggidieuf.facture.entity.Invoice;
import com.siggidieuf.facture.repository.IinvoiceRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryMemory implements IinvoiceRepository {

    private List<Invoice> invoices = new ArrayList<Invoice>();

    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("Bill "+invoice.getNumber()+" added.");
    }
}

package com.siggidieuf.facture;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.controller.InvoiceControllerDouchet;
import com.siggidieuf.facture.controller.InvoiceControllerKeyboard;
import com.siggidieuf.facture.controller.InvoiceControllerWeb;
import com.siggidieuf.facture.repository.IinvoiceRepository;
import com.siggidieuf.facture.repository.InvoiceRepositoryMemory;
import com.siggidieuf.facture.repository.InvoiceRepositoryDatabase;
import com.siggidieuf.facture.service.IinvoiceService;
import com.siggidieuf.facture.service.InvoiceServiceNumber;
import com.siggidieuf.facture.service.InvoiceServicePrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IinvoiceController invoiceController = context.getBean(IinvoiceController.class);
        invoiceController.createInvoice();

    }

}

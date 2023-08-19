package com.siggidieuf.facture;

import com.siggidieuf.facture.controller.IinvoiceController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

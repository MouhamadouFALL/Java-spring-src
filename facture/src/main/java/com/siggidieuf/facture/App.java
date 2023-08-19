package com.siggidieuf.facture;

import com.siggidieuf.facture.controller.IinvoiceController;
import com.siggidieuf.facture.service.IinvoiceService;
import com.siggidieuf.facture.service.number.InvoiceServiceNumber;
import com.siggidieuf.facture.service.prefix.InvoiceServicePrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = {"com.siggidieuf.facture.controller.web", /*"com.siggidieuf.facture.service.prefix",*/ "com.siggidieuf.facture.repository.database"})
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        IinvoiceController invoiceController = context.getBean(IinvoiceController.class);
        invoiceController.createInvoice();

    }

    @Bean
    public IinvoiceService configureInvoiceservice() {
        return new InvoiceServicePrefix();
    }

}

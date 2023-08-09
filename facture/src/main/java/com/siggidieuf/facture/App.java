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

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Controller name(Web, Keyboard, Douchet): ");
        String controllerName = scan.nextLine();
        controllerName = "com.siggidieuf.facture.controller.InvoiceController"+stringUpperFirst(controllerName);
        System.out.println("Enter your Service name(Number, Prefix): ");
        String serviceName = scan.nextLine();
        serviceName = "com.siggidieuf.facture.service.InvoiceService"+stringUpperFirst(serviceName);
        System.out.println("Enter your Repository name(Memory, Database): ");
        String repositoryName = scan.nextLine();
        repositoryName = "com.siggidieuf.facture.repository.InvoiceRepository"+stringUpperFirst(repositoryName);


        IinvoiceController invoiceController = null;
        IinvoiceService invoiceService = null;
        IinvoiceRepository invoiceRepository = null;

        try {
            invoiceController = (IinvoiceController) Class.forName(controllerName).getDeclaredConstructor().newInstance();
            invoiceService = (IinvoiceService) Class.forName(serviceName).getDeclaredConstructor().newInstance();
            invoiceRepository = (IinvoiceRepository) Class.forName(repositoryName).getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);

        invoiceController.createInvoice();

        if (scan != null) scan.close();

    }

    private static String stringUpperFirst(String chaine){
        String sousCaine = chaine.substring(1);
        String caractUpper = String.valueOf(chaine.trim().toUpperCase().charAt(0));

        return (caractUpper+sousCaine);

    }
}

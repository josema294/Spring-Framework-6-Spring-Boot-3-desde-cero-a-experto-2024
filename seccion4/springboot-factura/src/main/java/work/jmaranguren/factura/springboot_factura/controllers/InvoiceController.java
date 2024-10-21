package work.jmaranguren.factura.springboot_factura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.jmaranguren.factura.springboot_factura.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    public Invoice factura; 

     
    @GetMapping("/show")
    public Invoice show(){
        return factura;
    }



    
}

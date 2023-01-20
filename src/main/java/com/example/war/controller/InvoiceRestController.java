package com.example.war.controller;

import com.example.war.model.Invoice;
import com.example.war.rep.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class InvoiceRestController {

    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceRestController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    @PostMapping("/invoice")
    public Invoice postProduct(@RequestBody Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

}

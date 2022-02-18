package com.kodilla.hibernate.invoice.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InvoiceDaoTestSuite{

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
}
}

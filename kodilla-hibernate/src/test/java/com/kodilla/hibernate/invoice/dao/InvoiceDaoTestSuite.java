package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite{

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;

    @Test
    void testInvoiceDaoSave(){

        //given
        Product product = new Product("product");
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        productDao.saveAll(List.of(product, product1,product2));
        Item item = new Item(product, new BigDecimal(10), 5);
        Item item1 = new Item(product1, new BigDecimal(20), 5);
        Item item2 = new Item(product2, new BigDecimal(30), 5);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item1);
        itemList.add(item2);
        Invoice invoice = new Invoice("01/2022", itemList);

        //when
        invoiceDao.save(invoice);
        String invoiceNumber = invoice.getNumber();

        //then
        assertEquals("01/2022", invoiceNumber);

        //cleanup
        invoiceDao.deleteAll();


}
}

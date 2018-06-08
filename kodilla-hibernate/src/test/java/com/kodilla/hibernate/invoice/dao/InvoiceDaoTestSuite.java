package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //GIVEN
        Invoice invoice = new Invoice();
        invoice.setNumber("One");
        List<Item> items = new ArrayList<>();

        Product product1 = new Product("Milk");
        Product product2 = new Product("Booze");
        Product product3 = new Product("Mayo");
        Product product4 = new Product("Chocolate");
        Product product5 = new Product("Bread");

        Item item1 = new Item(product1, invoice, new BigDecimal(1.5),3, new BigDecimal(1.2));
        Item item2 = new Item(product2, invoice, new BigDecimal(12),8, new BigDecimal(10));
        Item item3 = new Item(product3, invoice, new BigDecimal(6),4, new BigDecimal(5));
        Item item4 = new Item(product4, invoice, new BigDecimal(3),21, new BigDecimal(2.5));
        Item item5 = new Item(product5, invoice, new BigDecimal(3),8, new BigDecimal(2.6));


        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        product1.setItems(items);
        product2.setItems(items);
        product3.setItems(items);
        product4.setItems(items);
        product5.setItems(items);

        invoice.setItems(items);

        //WHEN
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //THEN
        Assert.assertNotEquals(0, id);
        //CleanUp
        invoiceDao.delete(id);
    }
}
